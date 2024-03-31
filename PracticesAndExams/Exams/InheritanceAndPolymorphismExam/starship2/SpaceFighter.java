package starship2;

/**
 * Interface with two parameters that allows spaceships to be fighters
 *
 * @author vima2670
 */
public interface SpaceFighter {

    public void attack(SpaceShip enemy);

    public void receiveAttack(double force);
}
