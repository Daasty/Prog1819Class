package ut3;

import java.util.Scanner;

/**
 * Mostrar todos los enteros entre 1 y el que indique el usuario
 */
public class Modelo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el número final: ");
        int num = Integer.parseInt(teclado.nextLine());

        for(int i = 1; i <= num; i++) {
            System.out.printf("%d, ", i);
        }

    }
}
