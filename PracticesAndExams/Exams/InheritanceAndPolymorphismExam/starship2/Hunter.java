package starship2;

import java.util.Random;

/**
 * The spaceship hunter type
 *
 * @author vima2670
 */
public class Hunter extends SpaceShip {

    private final double INITIAL_ENERGY = 150.0;
    private final double SHIELD_ENERGY_RATIO = 0.40;
    private double MAX_LASER_ENERGY_ATTACK = 40.0;
    private double PAIN_FACTOR = 0.25;

    public Hunter(String name) {
        super(name, 150.0, 0.40);
    }

    /**
     * Calculates the energy of the shield
     *
     * @return
     */
    public double getShieldEnergy() {
        return energy * SHIELD_ENERGY_RATIO;
    }

    /**
     * Calculates the energy of the laser
     *
     * @return
     */
    public double getLaserGunEnergy() {
        return energy - (energy * SHIELD_ENERGY_RATIO);
    }

    /**
     * The state of the spaceship (type, name, state, energy)
     */
    @Override
    public void stateInfo() {
        System.out.println("==STATE OF THE SPACESHIP==");
        System.out.println("Type: Hunter");
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
     * The receiving of the attack
     *
     * @param force the force the other spaceship attacked
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
     * The attack info with the name of the spaceship and the damage it done
     *
     * @param force the force the spaceship attacks
     */
    public void attackInfo(double force) {
        System.out.println("The spaceship Hunter named " + name + " has done " + force * PAIN_FACTOR + " damage with LASERS");

    }

    /**
     * The attack that the spaceship do, it calculates the damage
     *
     * @param enemy the enemy where the damage will go
     */
    @Override
    public void attack(SpaceShip enemy) {
        Random ran = new Random();
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
        attackInfo(force);
    }

}
