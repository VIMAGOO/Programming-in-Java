package starship2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The battle between two ships that the user chooses
 *
 * @author vima2670
 */
public class SpaceBattle {

    SpaceShip[] spaceShips;

    public static void main(String[] args) {
        SpaceBattle sb = new SpaceBattle();
        sb.run();
    }

    private void run() {
        //we generate ships
        generateShips();
        //we instanciate ship 1 and ship 2
        SpaceShip ship1;
        SpaceShip ship2;
        do {
            //we assign a value all 2 ships
            System.out.println("==SELECT FIRST SPACESHIP==");
            ship1 = chooseShip();
            System.out.println("==SELECT SECOND SPACESHIP==");
            ship2 = chooseShip();
        } while (ship1.equals(ship2)); //if the user selects the same ship the loop will not end
        //we inicialize the rounds
        int round = 0;
        //starting information
        System.out.println("STARTING INFORMATION ");
        System.out.println("SHIP 1:");
        ship1.stateInfo();
        System.out.println("SHIP 2:");
        ship2.stateInfo();
        System.out.println("");
        do {
            System.out.println("");
            //message of the round
            System.out.println("==ROUND " + round++ + "==");
            //ship1 attacks ship2 and the same way with ship2
            ship1.attack(ship2);
            ship2.attack(ship1);
            //we show the info of the round
            System.out.println("INFORMATION OF THE ROUND ");
            ship1.stateInfo();
            ship2.stateInfo();
            System.out.println("");
        } while (ship1.alive == true && ship1.energy != 0 && ship2.alive == true && ship2.energy != 0); //while no one has 0 energy and are alive
        //show the winner
        if (ship1.energy == 0) {
            System.out.println(ship2.getName() + " has won.");
        } else {
            System.out.println(ship1.getName() + " has won.");
        }

    }

    /**
     * Generate the ships
     */
    private void generateShips() {
        spaceShips = new SpaceShip[5];
        spaceShips[0] = new Hunter("Hunter1");
        spaceShips[1] = new Hunter("Hunter2");
        spaceShips[2] = new Hunter("Hunter3");
        spaceShips[3] = new Cruiser(12, "Cruiser1");
        spaceShips[4] = new Cruiser(5, "Cruiser2");
    }

    /**
     * It shows a menu with all the ships and the user choose can choose a ship.
     *
     * @return the shipes choosen
     */
    private SpaceShip chooseShip() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < spaceShips.length; i++) {
            System.out.format("%d> %s: %s%n", i, spaceShips[i].getClass().getSimpleName(), spaceShips[i].getName());
        }
        boolean valid = false;
        SpaceShip ship = null;

        do {
            System.out.println("Choose a ship number: ");
            try {
                int n = sc.nextInt();
                if ((n >= 0) && (n < spaceShips.length)) {
                    ship = spaceShips[n];
                    valid = true;
                }
            } catch (InputMismatchException e) {
                valid = false;
            }
            if (!valid) {
                System.out.println("Try again.");
            }
        } while (!valid);
        return ship;
    }
}
