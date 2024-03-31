package pokemonvsdigimon;

import java.util.Objects;
import java.util.Random;

/**
 * Aquesta clase té el nom i les estadístiques del Digimon
 *
 * @author vima2670
 */
public class Digimon {

    //creem ran per utilitzar-lo més endevant.
    Random ran = new Random();
    //el nom del Digimon
    private String name;
    //els punts de vida del Digimon
    private int lifePoints;
    //si té escut protector o no
    private boolean shield;

    //constructor
    /**
     * Aquest mètode inicialitza els atributs
     *
     * @param name el nom que introdueixi l'usuari
     */
    public Digimon(String name) {
        this.name = name;
        //per defecte tindrà 600 punts de vida
        this.lifePoints = 600;
        //per defecte tindrà l'escut activat
        this.shield = true;
    }

    /**
     * Mètode per rebre el nom
     *
     * @return el nom del Digimon
     */
    public String getName() {
        return name;
    }

    /**
     * Mètode per canviar el nom
     *
     * @param name el nou nom del Digimon
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mètode per rebre els punts de vida del Digimon
     *
     * @return els punts de vida
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * Mètode per rebre l'estat de l'escut(activat o no)
     *
     * @return true si està activat; false si no
     */
    public boolean isShield() {
        return shield;
    }

    /**
     * Mètode per imprimir el nom i la vida que té el digimon. Si té menys de
     * 100 de vida mostrà altre missatge
     *
     * @return el missatge que es mostra
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Your Digimon named ").append(name).append(" has ").append(lifePoints).append(" life points.\n");
        if (lifePoints < 100) {
            sb.append("About to die.\n");
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     * Retorna true si els dos objects són iguals ignorant cases.
     *
     * @param obj el nom del digimon
     * @return true si son iguals, false si son diferents
     */
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
        final Digimon other = (Digimon) obj;
        return Objects.equals(this.name.toLowerCase(), other.name.toLowerCase());
    }

    /**
     * Missatge del nom i el dany que fa el digimon
     *
     * @param enter el dany que fa el digimon
     */
    private void combatScream(int enter) {
        System.out.println("Digimon " + name + " attacks with force " + enter);
    }

    /**
     * Mètode per quan reb dany
     *
     * @param enter el dany que reb
     */
    public void receiveAttack(int enter) {
        if (!shield) {
            lifePoints -= enter;
            if (lifePoints < 0) {
                lifePoints = 0;
            }
        } else {
            shield = false;
            System.out.println("Digimon shield disabled.");
        }
    }

    /**
     * Mètode per quan ataca al Pokemon, s'imprimeix el combatScream, se li
     * resta el dany al Pokemon
     *
     * @param pokemon el pokemon al qual ataca
     */
    public void attack(Pokemon pokemon) {
        int enter = ran.nextInt(30, 201);
        combatScream(enter);
        pokemon.receiveAttack(enter);
    }

    /**
     * Mètode per saber-ne si el Pokemon està viu o no.
     *
     * @return true està viu; false no
     */
    public boolean isAlive() {
        boolean isAlive = false;
        if (lifePoints > 0) {
            isAlive = true;
        }
        return isAlive;
    }

}
