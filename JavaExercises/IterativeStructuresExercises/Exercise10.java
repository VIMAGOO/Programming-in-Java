import java.util.Scanner;
/**
 * Aquest programa rebrà de l'usuari dos nombres,
 * d'aquests dos nombres calcularà els nombres parells i imparells
 * que hi ha entre tots dos.
 * @author vimago
 */
public class Exercise10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar i llegir los valors de M i N
        System.out.print("Introdueix el valor de M: ");
        int M = sc.nextInt();
        System.out.print("Introdueix el valor de N: ");
        int N = sc.nextInt();

    
        int sumaParell = 0;
        int sumaImparell = 0;

        // Verificar que M sigui  menor o igual que N
        if (M <= N) {
            // Iterar desde M fins N
            for (int i = M; i <= N; i++) {
                if (i % 2 == 0) {
                    // Sumar números parells
                    sumaParell += i;
                } else {
                    // Sumar números imparells
                    sumaImparell += i;
                }
            }

            // Mostrar las sumes
            System.out.println("Suma de números parells: " + sumaParell);
            System.out.println("Suma de números imparells: " + sumaImparell);
        } else {
            for (int i = N; i <= M; i++) {
                if (i % 2 == 0) {
                    // Sumar números parells
                    sumaParell += i;
                } else {
                    // Sumar números imparells
                    sumaImparell += i;
                }      
    }
            System.out.println("Suma de números parells: " + sumaParell);
            System.out.println("Suma de números imparells: " + sumaImparell);
}
    }
}