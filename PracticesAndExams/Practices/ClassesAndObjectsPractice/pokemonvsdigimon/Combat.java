package pokemonvsdigimon;

import java.util.Scanner;

/**
 *
 * @author vima2670
 */
public class Combat {

    //creem scanner
    Scanner sc = new Scanner(System.in);
    //instanciem pokemon i digimon 
    Pokemon pokemon;
    Digimon digimon;

    public static void main(String[] args) {
        //creem l'objecte combat per a fer el codi en un apartat no static
        Combat combat = new Combat();
        combat.run();
    }

    private void run() {
        //dades pokemon + creció
        String namePokemon = readString("How is your Pokemon named?:");
        int lifePointsPokemon = readInt("How many life points does your Pokemon has?");
        pokemon = new Pokemon(namePokemon, lifePointsPokemon);
        //dades digimon + creació
        String nameDigimon = readString("How is your Digimon named?:");
        digimon = new Digimon(nameDigimon);
        //missatge inicial de les característiques de cada criatura
        System.out.println("==COMBAT INFORMATION==");
        System.out.println("Pokemon:");
        System.out.println(pokemon.toString());
        System.out.println("Digimon:");
        System.out.println(digimon.toString());
        //comptador per rondes
        int round = 0;
        //missatge per contextualitzar que el combat comença
        System.out.println("==THE FIGHT STARTS==");
        //bucle de les rondes del combat
        do {
            //el comptador
            round++;
            //pokemon comença atacant a digimon
            pokemon.attack(digimon);
            //si digimon es viu, ataca
            if (digimon.isAlive()) {
                digimon.attack(pokemon);
            }
            //missatge de la ronda + caracterísitques de cada criatura després d'aquesta
            System.out.println("ROUND " + round + ":");
            System.out.println("Pokemon:");
            System.out.println(pokemon.toString());
            System.out.println("Digimon:");
            System.out.println(digimon.toString());
        } while (pokemon.isAlive() && digimon.isAlive());//el bucle continuarà si tots dos són vius

        //si el pokemon es el que hi és viu mostra missatge de que ha guanyat
        if (pokemon.isAlive()) {
            System.out.println("Pokemon has won the combat!");
            //si no el digimon
        } else {
            System.out.println("Digimon has won the combat!");
        }
    }

    /**
     * Aquest mètode llegeix Strings
     *
     * @param message el missatge
     * @return la resposta (String) al missatge
     */
    private String readString(String message) {
        System.out.println(message);
        return sc.next();
    }

    /**
     * Aquest mètode llegeix ints
     *
     * @param message el missatge
     * @return la resposta (int) al missatge
     */
    private int readInt(String message) {
        System.out.println(message);
        return sc.nextInt();
    }
}
