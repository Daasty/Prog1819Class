package ut3;

import java.util.Scanner;

/**
 * Programa que pida al usuario un número y que muestre todos los números de 1 al N
 */
public class Ale1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 1 número: ");
        int num = Integer.parseInt(teclado.nextLine());
        System.out.print("1");
        for (int i = 2; i <= num; i ++) {
            System.out.printf(", %d", i);
        }
    }
}
