package ut3;

import java.util.Scanner;

/**
 * Pedir 6 números enteros para mostrar la suma
 */
public class Modelo4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 6 números y te diré su suma.");

        System.out.println("Número 1: ");
        int num = Integer.parseInt(teclado.nextLine());
        int suma = num;
        for (int i = 2; i <= 6; i++) {
            System.out.println("Número " + i + ": ");
            num = Integer.parseInt(teclado.nextLine());
            suma += num;
        }

        System.out.printf("La suma total es %d",  suma);
    }
}
