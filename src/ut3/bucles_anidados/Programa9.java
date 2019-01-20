package ut3.bucles_anidados;

import java.util.Scanner;

/**
 * Pedir al usuario un número del 1 al 9 y mostrar una figura con asteriscos
 */

public class Programa9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 9");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || i == 1 || j == num || i == num) {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
