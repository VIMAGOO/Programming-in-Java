package car;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Concessionaire {
    private String tuition;
    private Car[] cars;

    public Concessionaire(String tuition, Car[] cars) {
        this.tuition = tuition;
        this.cars = cars;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.tuition);
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
        final Concessionaire other = (Concessionaire) obj;
        return Objects.equals(this.tuition, other.tuition);
    }

    
        /**
     * Searches an appliance given its name
     * @param tuition the name of the appliance research
     * @return the appliance found or null if it is not found
     */
    public Car searchCars(String tuition) {
        Car found = null;
        for (int i = 0; i < cars.length; i++) {
            Car elem = cars[i];
            if(elem.getTuition().equals(tuition)) {
                found = elem;
                break;
            }
        }
        return found; 
    }
}
