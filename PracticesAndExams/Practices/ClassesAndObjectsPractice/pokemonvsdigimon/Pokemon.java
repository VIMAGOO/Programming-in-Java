package pokemonvsdigimon;

import java.util.Objects;
import java.util.Random;

/**
 * Aquesta clase té el nom i les estadístiques del Pokemon
 *
 * @author vima2670
 */
public class Pokemon {

    //creem ran per utilitzar-lo més endevant.
    Random ran = new Random();
    //atributs
    //el nom del Pokemon
    private final String name;
    //els punts de vida del Pokemon
    private int lifePoints;
    //els punts de força d'atac en combat
    private int combatPoints;

    //constructor
    /**
     * Aquest mètode inicialitza els atributs
     *
     * @param name el nom del pokemon que esculli l'usuari
     * @param lifePoints els punts de vida que esculli l'usuari per al seu
     * pokemon
     */
    public Pokemon(String name, int lifePoints) {
        //establim el nom que introdueixi l'usuari
        this.name = name;
        //si els lifePoints que introdueix l'usuari són majors a 1000, l'establim a 1000
        //si no, establim els que introdueixi l'usuari
        if (lifePoints > 1000) {
            this.lifePoints = 1000;
        } else {
            this.lifePoints = lifePoints;
        }
        //inicialitzem combatPoints amb un valor entre 100 i 200
        combatPoints = ran.nextInt(100, 201);
    }

    /**
     * Per poder saber quin és el nom d'un Pokemon
     *
     * @return el nom del Pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * Per poder saber la vida del Pokemon
     *
     * @return la vida del Pokemon
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * Per poder saber el dany que fa un Pokemon
     *
     * @return els dany que farà
     */
    public int getCombatPoints() {
        return combatPoints;
    }

    /**
     * Per canviar els punts de dany que fa un Pokemon
     *
     * @param combatPoints els punts de dany que l'usuari escollirà que tingui
     * el Pokemon
     */
    public void setCombatPoints(int combatPoints) {
        this.combatPoints = combatPoints;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     * Retorna true si els dos objects són iguals ignorant cases.
     *
     * @param obj el nom del pokemon
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
        final Pokemon other = (Pokemon) obj;
        return Objects.equals(this.name.toLowerCase(), other.name.toLowerCase());
    }

    /**
     * Imprimeix un missatge
     *
     * @return un missatge amb el nom del Pokemon i cuanta vida li resta.
     */
    @Override
    public String toString() {
        return "Your Pokemon named " + name + " has " + lifePoints + " life points.";
    }

    /**
     * Imprimeix un missatge de la força amb la qual el Pokemon ataca
     *
     * @param enter la força
     */
    private void combatScream(int enter) {
        System.out.println("Pokemon " + name + " attacks with force " + enter);
    }

    /**
     * Resta vida perquè el Pokemon a rebut un atac
     *
     * @param enter la força del atac que reb
     */
    public void receiveAttack(int enter) {
        lifePoints -= enter;
        if (lifePoints < 0) {
            lifePoints = 0;
        }
    }

    /**
     * La força d'atac amb la que ataca el nostre Pokemon, si te menys de 100 de
     * vida ataca el doble de fort.
     *
     * @param digimon el digimon al qual ataca
     */
    public void attack(Digimon digimon) {
        int enter = 0;
        if (lifePoints < 100) {
            enter = combatPoints * 2;
        } else {
            enter = combatPoints;
        }
        //missatge de quant d'any fa el Pokemon
        combatScream(enter);
        //el Digimon reb l'atac
        digimon.receiveAttack(enter);
    }

    /**
     * Informació sobre si el Pokemon està viu o no
     *
     * @return true si està viu, false si no
     */
    public boolean isAlive() {
        boolean isAlive = false;
        if (lifePoints > 0) {
            isAlive = true;
        }
        return isAlive;
    }

}
