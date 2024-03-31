package car;

import java.util.Objects;

/**
 *
 * @author vimago
 */
public class Car {
    private String tuition;
    private String brand;
    private String model;
    private FuelType fuelType;
    private int gear;
    
    private boolean on;

    public Car(String tuition, String brand, String model, FuelType fuelType, int gear) {
        this.tuition = tuition;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.gear = gear;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.tuition);
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
        final Car other = (Car) obj;
        return Objects.equals(this.tuition, other.tuition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("tuition=").append(tuition);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", gear=").append(gear);
        sb.append(", on=").append(on);
        sb.append('}');
        return sb.toString();
    }
           
    
    /**
     * Arrenca el cotxe
     * @return true si té èxit, false si no
     */
    public boolean start() {
        boolean b = false;
        if (!on) {
            on = true;
            b = true;
        }
        return b;
    }
    
    /**
     * Apaga el cotxe
     * @return false si té èxit, true si no
     */
    public boolean close() {
        boolean b = false;
        if (on) {
            on = false;
            b = false;
        }
        return b;
    }
    
    /**
     * 
     * @param deltaSpeed
     * @return 
     */
    public boolean accelerate(double deltaSpeed) {
        boolean b = false;
        return b;
    }
    
    /**
     * 
     * @param gear
     * @return 
     */
    public boolean shiftGearsUp(int gear) {
        boolean b = false;
        if (gear != this.gear) {
        b = true;
        }
        return b;
    }
    
    /**
     * 
     * @param gear
     * @return 
     */
    public boolean shiftGearsDown(int gear) {
        boolean b = false;
        if (gear != 0) {
        b = true;
        }
        return b;
    }
}
