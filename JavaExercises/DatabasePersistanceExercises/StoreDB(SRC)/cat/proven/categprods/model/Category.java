package cat.proven.categprods.model;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Category {
    
    private long id;
    private String code;
    private String name;

    public Category(long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Category() {
    }

    public Category(long id) {
        this.id = id;
    }
    
    public Category(Category other) {
        this.id = other.id;
        this.code = other.code;
        this.name = other.name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.code);
        return hash;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category other = (Category) obj;
        return Objects.equals(this.code, other.code);
    }
}
