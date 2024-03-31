package athlete;

import java.util.Arrays;

/**
 *
 * @author vimago
 */
public class AthleteMain {

    private Athlete[] atletes;

    public static void main(String[] args) {
        AthleteMain am = new AthleteMain();
        am.run();
    }

    private void run() {
        generateAtletes();
        competicio(atletes);
        mostrarAtletes();
        AthleteVaAClase(atletes);
        AthleteVaACorrer(atletes);
        AthleteVaANadar(atletes);
        AthleteVaASaltar(atletes);
    }

    private void generateAtletes() {
        atletes = new Athlete[5];
        atletes[0] = new Athlete("Pértiga", 0, "Luis", 28);
        atletes[1] = new Athlete("Natació", 0, "Alba", 20);
        atletes[2] = new Athlete("Triple salt", 0, "Peter", 34);
        atletes[3] = new Athlete("Judo", 0, "Juan Illo", 28);
        atletes[4] = new Athlete("Llançament de pes", 0, "Masi", 26);
    }

    private void AthleteVaAClase(Athlete[] Athlete) {
        for (Athlete Athlete1 : Athlete) {
            System.out.println(Athlete1.irClase(Athlete1.getNom()));
        }
    }

    private void AthleteVaACorrer(Athlete[] Athlete) {
        for (Athlete Athlete1 : Athlete) {
            System.out.println(Athlete1.correr(Athlete1.getNom()));
        }
    }

    private void AthleteVaANadar(Athlete[] Athlete) {
        for (Athlete Athlete1 : Athlete) {
            System.out.println(Athlete1.nadar(Athlete1.getNom()));
        }
    }

    private void AthleteVaASaltar(Athlete[] Athlete) {
        for (Athlete Athlete1 : Athlete) {
            System.out.println(Athlete1.saltar(Athlete1.getNom()));
        }
    }

    private void competicio(Athlete[] Athlete) {
        int dorsalConsecutiu = 0;
        for (int i = 0; i < Athlete.length; i++) {
            dorsalConsecutiu++;
            Athlete[i].setDorsal(dorsalConsecutiu);
        }
    }

    private void mostrarAtletes() {
        System.out.println(Arrays.toString(atletes));
    }
}
