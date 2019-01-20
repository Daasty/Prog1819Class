package ut3.bucles_anidados;

import java.util.Scanner;

/**
 * Que pida un número entero entre 1 y 9 al usr para mostrar una figura como el ejemplo
 */
public class Programa7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número entre el 1 y el 9: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}