/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringexercicis;

import java.util.Scanner;

/**
 *
 * @author vimago
 */
public class Exercise1c {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Introdueix una cadena de text: ");
        String cadena = sc.next();
        //String cadena = sc.nextLine();
        System.out.println("La cadena que has entrat és: "+cadena);
        char esp = ' ';
        int indexPrevi = -1; //inicialitzem des de -1
        int index = 0;
        String paraula;
    }
    
    public static void primeraParaula(String text) {
        char esp = ' ';
        int indexPrevi = -1;
        int index = text.indexOf(esp, indexPrevi+1);
        String paraula;
        
        if (index < 0) {
            paraula = text.substring(0);
            System.out.println(paraula);
        } else {
            paraula = text.substring(0, index);
            primeraParaula(text.substring(index+1, esp));
            System.out.println(paraula);
        }
    }
    
}
