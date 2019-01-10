package ut3;

import java.util.Scanner;

/**
 * Pedir al usuario tres números para indicar cuál es el menor de los 3
 */
public class E9 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime el segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime el tercer número: ");
        int num3 = Integer.parseInt(teclado.nextLine());

        if (num1 < num2 && num1 < num3) {
            System.out.printf("El menor es el primer número, %d", num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.printf("El menor es el segundo número, %d", num2);
        }
        else if (num3 < num1 && num3 < num2) {
            System.out.printf("El menor es el tercer número, %d", num3);
        }
        else System.out.println("Algo ha fallado, introduce los números de nuevo.");
    }
}
