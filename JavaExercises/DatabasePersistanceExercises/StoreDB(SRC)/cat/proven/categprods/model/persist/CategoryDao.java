package cat.proven.categprods.model.persist;

import cat.proven.categprods.model.Category;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vimago
 */
public class CategoryDao {
    private DbConnect dbConnect;

    public CategoryDao() {
        this.dbConnect = new DbConnect();
    }
    
    private Category fromResultSet(ResultSet rs) throws SQLException {
        long id = rs.getLong("id");
        String code = rs.getString("code");
        String name = rs.getString("name");
        Category category = new Category(id, code, name);
        return category;
        
    }
    /**
     * inserts a category in database
     * @param category the category to insert
     * @return the number of rows inserted
     */
    public int insert(Category category) {
        int result = 0;
        try(Connection conn = dbConnect.getConnection()) {
            if (conn != null) {
                String query = "INSERT INTO categories VALUES(null, ?, ?)";
                PreparedStatement st = conn.prepareStatement(query);
                st.setString(1, category.getName());
                st.setString(2, category.getCode());
                result = st.executeUpdate(); //executa un canvi
            } else {
                result = 0;
            }
        } catch (SQLException ex) {
            result = 0;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    } 
    
    public int delete(Category category) {
        int result = 0;
        try(Connection conn = dbConnect.getConnection()) {
            if(conn != null) {
                String query = "DELETE FROM categories WHERE id = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setLong(1, category.getId());
                result = st.executeUpdate();
            } else {
                result = 0;
            }
        } catch (SQLException ex) {
            result = 0;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    } 
    
    public int update(Category category) {
        int result = 0;
        try(Connection conn = dbConnect.getConnection()) {
            if(conn != null) {
                String query = "UPDATE categories SET name = ?, code = ? WHERE id = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setString(1, category.getName());
                st.setString(2, category.getCode());
                st.setLong(3, category.getId());
                result = st.executeUpdate();
            } else {
                result = 0;
            }
        } catch (SQLException ex) {
            result = 0;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    } 
    
    /**
     * Selects all categoris from database
     * @return list of categories or null in case of error
     */
    public List<Category> selectAll(){
        List<Category> result = null;
        try (Connection conn = dbConnect.getConnection()) {
            if (conn != null) {
                result = new ArrayList<>();
                String query = "SELECT * FROM categories";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query); //executa una query no fa cap canvi a la bd
                while(rs.next()) {
                    Category c = fromResultSet(rs);
                    if (c != null) {
                        result.add(c);
                    }
                }
            } else {
                result = null;
            }
        } catch (SQLException ex) {
            result = null;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    /**
     * Selects a category given its id
     * @param category the category to search
     * @return the category found or null if was not found or in case of error
     */
    public Category select(Category category) {
        Category result = null;
        try (Connection conn = dbConnect.getConnection()){
            if (conn != null) {
                String query = "SELECT * FROM categories WHERE id = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setLong(1, category.getId());
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    result = fromResultSet(rs);
                }
            } else {
                result = null;
            }
        } catch (SQLException ex) {
            result = null;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public Category selectWhereCode(String code) {
        Category result = null;
        try(Connection conn = dbConnect.getConnection()) {
            if(conn != null) {
                String query = "SELECT * FROM categories WHERE code = ?";
                PreparedStatement st = conn.prepareStatement(code);
                ResultSet rs = st.executeQuery();
                if(rs.next()) {
                    result = fromResultSet(rs);
                }
            } else {
                result = null;
            }
        } catch (SQLException ex) {
            result = null;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public List<Category> selectWhereName(String name){
        List<Category> result = null;
        try(Connection conn = dbConnect.getConnection()) {
            if(conn != null) {
                String query = "SELECT * FROM categories WHERE name = ?";
                PreparedStatement st = conn.prepareStatement(name);
                ResultSet rs = st.executeQuery();
                while(rs.next()) {
                    Category c = fromResultSet(rs);
                    if(c != null) {
                        result.add(c);
                    }
                }
            } else {
                result = null;
            }
        } catch (SQLException ex) {
            result = null;
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
}
