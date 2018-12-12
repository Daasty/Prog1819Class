package ut3;

import java.util.Scanner;

/**
 * Pedir un número al usuario para decir varios mensajes:
 * Soy negativo
 * Soy el 0
 * Estoy entre el 1 y el 100
 * Soy mayor que 100
 */
public class E2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num < 0) {
            System.out.println("Soy negativo.");
        }
        else if (num == 0) {
            System.out.println("Soy el 0.");
        }
        else if (num <= 100) {
            System.out.println("Estoy entre el 1 y el 100.");
        }
        else System.out.println("Soy mayor que 100.");

    }
}
