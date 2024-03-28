package array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Array d'un numero determinat d'elements. Un array de numeros enters de N
 * dimensió. Bucle per anar introduint els elements de l'array. Validar: - Han
 * de ser números. InputMismatchException - No s'admeten números més petits que
 * 10. TooSmallException - No s'admeten números més grans de 100.
 * TooBigException
 *
 * @author vimago
 */
public class FillArray {

    private int[] array;

    public static void main(String[] args) {
        FillArray fa = new FillArray();
        fa.run();
    }

    private void run() {
        try {
            fillArray();
            System.out.println(Arrays.toString(array));
        } catch (InvalidValueException | InputMismatchException | InvalidArrayLengthException arrayExceptions) {
            System.out.println(arrayExceptions.getMessage());
        }
    }
//        } catch (InvalidValueException ive) {
//            System.out.println(ive.getMessage());
//        } catch (InputMismatchException ime) {
//            System.out.println(ime.getMessage());
//        } catch (InvalidArrayLengthException iale) {
//            System.out.println(iale.getMessage());
//        }

    private void fillArray() throws InvalidValueException, InvalidArrayLengthException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length: ");
        int length = sc.nextInt();
        if (length <= 0) {
            throw new InvalidArrayLengthException("Invalid length");
        }
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int value = 0;
            try {
                System.out.println("Introduce the number " + (i + 1) + ":");
                value = sc.nextInt();
                if (value < 10) {
                    throw new InvalidValueException("Too small value");
                }
                if (value > 100) {
                    throw new InvalidValueException("Too big value");
                }
                array[i] = value;
            } catch (InputMismatchException ime) {
                sc.next(); //descartem el valor que ha introduit l'usuari
                System.out.println("This digit is not allowed.");
                i--;
            }
        }
    }
}
