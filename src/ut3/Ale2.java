package ut3;

import java.util.Scanner;

/**
 * Pide un número al usuario para mostrar la tabla de multiplicar.
 */
public class Ale2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te diré la tabla de multiplicar: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i <= 10; i++) {
            System.out.printf("[%2d] x [%2d] = [%3d]\n", num, i, (num*i));
        }
    }
}
