package ut3;

import java.util.Scanner;

/**
 * Pedir un número al usuario para indicar si es positivo, negativo o es el 0
 */

public class Modelo6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré lo que es: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num == 0) {
            System.out.println("Es el 0.");
        }
        else if (num > 0) {
            System.out.println("Es positivo.");
        }
        else System.out.println("Es negativo.");
    }

}
