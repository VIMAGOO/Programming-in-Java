import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari un X nombres de persones sèniors,
 * adults, júniors i discapacitats.
 * Amb aquestes dades, el programa agruparà a totes les persones,
 * segons la quantitat de persones aplicarà un descompte del 20% o/i d'entrades,
 * finalment el programa mostrarà 
 * la composició del grup
 * els descomptes aplicats
 * i el preu total de les entrades.
 * @author vima2670
 */
public class PracticaExercici3 {

    public static void main(String[] args) {
        //scanner.
        Scanner scanner = new Scanner(System.in);
        //Establim els missatges de sortida que rebrà l'usuari.
        //Establim les variables i que el programa pogui llegir les dades introduïdes.
        System.out.println("ENTRADES:");
        System.out.println("Introdueix el nombre de sèniors (60> anys):");
        int senior = scanner.nextInt();
        System.out.println("Introdueix el nombre d'adults (11-59 anys):");
        int adult = scanner.nextInt();
        System.out.println("Introdueix el nombre de júniors (4-10 anys):");
        int junior = scanner.nextInt();
        System.out.println("Introdueix el nombre de persones amb discapacitat:");
        int disc = scanner.nextInt();
        
        //Establim dues variables més: el preu i el grup.
        double preu = 40*adult + 35*(junior + senior) + 29*disc;
        int grup = adult+junior+senior+disc;
        
        //if
        //Si el grup té més o és igual 10 persones.
        if (grup>=10){
            //Si el grup té més de 10 persones o igual, i te menys de 25.
            if (grup>=10 && grup<25){
            preu = preu - (preu*0.2);
            System.out.println("GRUP: "+grup+"(Sènior= "+senior+", adults= "+adult+", júnior= "+junior+", discapacitats= "+disc+").");
            System.out.println("Com el grup té més de 10 persones (però menys de 25), s'ha afegit un descompte del 20%. Preu:"+preu+" €");    
            }
            //Si el grup té més o igual que 25 persones.
            if (grup>=25){
        //Afegim la variable entradadescompte, ja que cada 25 persones es restarà una entrada a l'entrada més cara.
        int entradadescompte = grup/25;
        //Si el nombre d'adults és superior al nombre de sèniors es descomptara l'entrada als adults.      
        if (adult>senior){
                preu = (40*(adult-entradadescompte) + 35*(junior + senior) + 29*disc)-((40*(adult-entradadescompte) + 35*(junior + senior) + 29*disc)*0.2);
                System.out.println("GRUP: "+grup+"(Sènior= "+senior+", adults= "+adult+", júnior= "+junior+", discapacitats= "+disc+").");
                System.out.println("Com el grup té més de 25 persones, s'ha descomptat "+entradadescompte+" entrades d'adults i s'ha fet un descompte del 20%.");
                System.out.println("El preu a pagar és "+preu+" €.");    
               
        } else {
        //Si no als sènior.
        if (senior>junior){
                preu = (40*adult + 35*((junior + senior)-entradadescompte) + 29*disc)-((40*adult + 35*((junior + senior)-entradadescompte) + 29*disc)*0.2);
                System.out.println("GRUP: "+grup+"(Sènior= "+senior+", adults= "+adult+", júnior= "+junior+", discapacitats= "+disc+").");
                System.out.println("Com el grup té més de 25 persones, s'ha descomptat "+entradadescompte+" entrades sènior i s'ha fet un descompte del 20% .");
                System.out.println("El preu a pagar és "+preu+" €.");    
                
                
        } else {
        //Si no als júnior.
        if (junior>disc){
                preu = (0*adult + 35*((junior + senior)-entradadescompte) + 29*disc)-((0*adult + 35*((junior + senior)-entradadescompte) + 29*disc)*0.2);
                System.out.println("GRUP: "+grup+"(Sènior= "+senior+", adults= "+adult+", júnior= "+junior+", discapacitats= "+disc+").");
                System.out.println("Com el grup té més de 25 persones, s'ha descomptat "+entradadescompte+" entrades júnior i s'ha fet un descompte del 20%.");
                System.out.println("El preu a pagar és "+preu+" €.");    
                
               
        } else {
        //Si no, i finalment, als discapacitats.
        if (disc>=1)
                preu = (40*adult + 35*(junior + senior) + 29*(disc-entradadescompte))-((40*adult + 35*(junior + senior) + 29*(disc-entradadescompte))*0.2);
                System.out.println("GRUP: "+grup+"(Sènior= "+senior+", adults= "+adult+", júnior= "+junior+", discapacitats= "+disc+").");
                System.out.println("Com el grup té més de 25 persones, s'ha descomptat "+entradadescompte+" entrades de discapacitats i s'ha fet un descompte del 20%.");
                System.out.println("El preu a pagar és "+preu+" €.");    
                
                }
                }
            }
        }
    
        //Si el grup no és superior a 10 persones, es mostrarà aquest missatge.    
        } else { 
            System.out.println("GRUP: "+grup+"(Sènior= "+senior+", adults= "+adult+", júnior= "+junior+", discapacitats= "+disc+").");
            System.out.println("El grup no té més de 10 persones, per tant, no s'ha aplicat cap descompte.");
            System.out.println("El preu a pagar és "+preu+" €.");
        }  
}
}