package cat.proven.categprods;

import cat.proven.categprods.model.Category;
import cat.proven.categprods.model.persist.CategoryDao;
import java.util.List;

/**
 *
 * @author vimago
 */
public class Main {
    private CategoryDao categoryDao;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        //
        System.out.println("CATEGORIES");
        categoryDao = new CategoryDao();
        //
        System.out.println("Search all categories");
        List<Category> allCategories = categoryDao.selectAll();
        printCategoryList(allCategories);
        //
        System.out.println("Find a category by name");
        String name = "category01";
        List<Category> categoryName = categoryDao.selectWhereName(name);
        printCategoryList(categoryName);
        //
        System.out.println("Find a category by code");
        String code = "C01";
        Category categoryCode = categoryDao.selectWhereCode(code);
        System.out.println(categoryCode);
        //
        System.out.println("Find a category by id");
        Category c = new Category(6);
        c = categoryDao.select(c);
        System.out.println(c);
        //
        System.out.println("Insert a category");
        c = new Category(7, "C07", "category07");
        int rowsIns = categoryDao.insert(c);
        System.out.println("Rows inserted: "+rowsIns);
        //
        System.out.println("Delete a category");
        int rowsDel = categoryDao.delete(c);
        System.out.println("Rows deleted: "+rowsDel);
        //
        System.out.println("Update a category");
        c.setName("category07U");
        int rowsUpdated = categoryDao.update(c);
        System.out.println("Rows updated: "+rowsUpdated);
        //

    }
    
    private void printCategoryList(List<Category> data) {
        for (Category category : data) {
            System.out.println(category);
        }
        System.out.println("Number of elements showed " + data.size());
    }
    
    
    
}
