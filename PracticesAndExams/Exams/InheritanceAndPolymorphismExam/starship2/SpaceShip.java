package starship2;

import java.util.Objects;

/**
 * The spaceship
 *
 * @author vima2670
 */
public abstract class SpaceShip implements SpaceFighter {

    protected String name;
    protected double energy;
    protected boolean alive;
    protected double shieldEnergyRatio;

    //constructor
    public SpaceShip(String name, double energy, double shieldEnergyRatio) {
        this.name = name;
        this.energy = energy;
        this.alive = true;
        this.shieldEnergyRatio = shieldEnergyRatio;
    }

    //getters and setters
    public SpaceShip() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getShieldEnergyRatio() {
        return shieldEnergyRatio;
    }

    public void setShieldEnergyRatio(double shieldEnergyRatio) {
        this.shieldEnergyRatio = shieldEnergyRatio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
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
        final SpaceShip other = (SpaceShip) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpaceShip{");
        sb.append("name=").append(name);
        sb.append(", energy=").append(energy);
        sb.append(", alive=").append(alive);
        sb.append(", shieldEnergyRatio=").append(shieldEnergyRatio);
        sb.append('}');
        return sb.toString();
    }

    public abstract void stateInfo();

    @Override
    public abstract void attack(SpaceShip enemy);

    @Override
    public abstract void receiveAttack(double force);

}
