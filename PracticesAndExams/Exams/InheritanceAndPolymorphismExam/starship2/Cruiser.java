package starship2;

import java.util.Random;

/**
 * The spaceship cruiser type
 *
 * @author vima2670
 */
public class Cruiser extends SpaceShip {

    private int numPhotonTorpedo;
    private final double INITIAL_ENERGY = 100.0;
    private final double SHIELD_ENERGY_RATIO = 0.45;
    private final double MAX_LASER_ENERGY_ATTACK = 50.0;
    private final double PAIN_FACTOR = 0.20;
    private final double TORPEDO_FORCE = 75.0;
    //constructor
    public Cruiser(int numPhotonTorpedo, String name) {
        super(name, 100.0, 0.45);
        this.numPhotonTorpedo = numPhotonTorpedo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cruiser{");
        sb.append("numPhotonTorpedo=").append(numPhotonTorpedo);
        sb.append(", INITIAL_ENERGY=").append(INITIAL_ENERGY);
        sb.append(", SHIELD_ENERGY_RATIO=").append(SHIELD_ENERGY_RATIO);
        sb.append(", MAX_LASER_ENERGY_ATTACK=").append(MAX_LASER_ENERGY_ATTACK);
        sb.append(", PAIN_FACTOR=").append(PAIN_FACTOR);
        sb.append(", TORPEDO_FORCE=").append(TORPEDO_FORCE);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Calculates the shield energy
     *
     * @return the shield energy
     */
    public double getShieldEnergy() {
        return energy * SHIELD_ENERGY_RATIO;
    }

    /**
     * Calculates the laser gun energy
     *
     * @return the laser gun energy
     */
    public double getLaserGunEnergy() {
        return energy - (energy * SHIELD_ENERGY_RATIO);
    }

    /**
     * Shows the state of the spaceship (type, name, state and energy)
     */
    @Override
    public void stateInfo() {
        System.out.println("==STATE OF THE SPACESHIP==");
        System.out.println("Type: Cruiser");
        System.out.println("Name: " + name);
        if (energy != 0) {
            System.out.println("State: alive");
        } else {
            System.out.println("State: destroyed");
            alive = false;
        }
        System.out.println("Energy: " + energy);
    }

    /**
     * Receives the attack from another spaceship
     *
     * @param force the force the another spaceship attacked
     */
    @Override
    public void receiveAttack(double force) {
        if (getShieldEnergy() < force * PAIN_FACTOR) {
            System.out.println("Spaceship destroyed");
            energy = 0;
            alive = false;
        } else {
            energy -= force * PAIN_FACTOR;
        }
        stateInfo();
    }

    /**
     * The info of the attack
     *
     * @param force
     * @param attackType
     */
    public void attackInfo(double force, boolean attackType) {
        if (attackType == true) {
            System.out.println("The spaceship Cruiser named " + name + " has done " + force * PAIN_FACTOR + " damage with TORPEDOS");
        } else {
            System.out.println("The spaceship Cruiser named " + name + " has done " + force * PAIN_FACTOR + " damage with LASERS");
        }

    }

    /**
     * Attacks the enemy with 2 options with the same probability, torpedos or
     * lasers
     *
     * @param enemy the enemy who receives the attack
     */
    @Override
    public void attack(SpaceShip enemy) {
        Random ran = new Random();
        int decision = ran.nextInt(1, 3);
        switch (decision) {
            case 1:
                enemy.receiveAttack(TORPEDO_FORCE);
                attackInfo(TORPEDO_FORCE, true);
                numPhotonTorpedo--;
                break;
            case 2:
                boolean exit = false;
                double force = 0;
                do {
                    double laser_energy_ratio = ran.nextDouble(1, 101);
                    if (laser_energy_ratio / 100 * getLaserGunEnergy() <= MAX_LASER_ENERGY_ATTACK) {
                        force = laser_energy_ratio / 100 * getLaserGunEnergy();
                        enemy.receiveAttack(force);
                        exit = true;
                    }
                } while (!exit);
                attackInfo(force, false);
                break;
        }
    }
}
