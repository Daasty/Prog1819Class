package ut3;
import java.util.Scanner;

/**
 * Pedir un número al usuario para indicar si es par o no
 */
public class Modelo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num % 2 == 0) {
            System.out.println("Sí es par");
        }
        else System.out.println("No es par");
    }
}
