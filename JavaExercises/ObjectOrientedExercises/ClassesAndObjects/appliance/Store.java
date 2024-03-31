package appliance;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Store {
    private String name;
    private Appliance[] appliances;

    public Store(String name, Appliance[] appliances) {
        this.name = name;
        this.appliances = appliances;
    }

    public Store() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Appliance[] getAppliances() {
        return appliances;
    }

    public void setAppliances(Appliance[] appliances) {
        this.appliances = appliances;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
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
        final Store other = (Store) obj;
        return Objects.equals(this.name, other.name);
    }
    
    /**
     * Searches an appliance given its name
     * @param name the name of the appliance research
     * @return the appliance found or null if it is not found
     */
    public Appliance searchAppliance(String name) {
        Appliance found = null;
        for (int i = 0; i < appliances.length; i++) {
            Appliance elem = appliances[i];
            if(elem.getName().equals(name)) {
                found = elem;
                break;
            }
        }
        return found; 
    }
    
}
