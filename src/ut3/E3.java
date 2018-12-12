package ut3;

import java.util.Scanner;

/**
 * Pedir un número al usuario para decir varios mensajes:
 * Soy mayor que 100
 * Soy mayor que 1000
 * Soy mayor que 10000
 * Soy otro número
 */
public class E3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num > 100) {
            System.out.println("Soy mayor que 100.");

            if (num > 1000) {
                System.out.println("Soy mayor que 1000.");

                if (num > 10000) {
                    System.out.println("Soy mayor que 10000.");
                }
            }
        }
        else System.out.println("Soy otro número.");
    }
}
