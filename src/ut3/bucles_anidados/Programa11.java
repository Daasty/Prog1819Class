package ut3.bucles_anidados;

import java.util.Scanner;

/**
 * Que pida un número entero entre 1 y 9 al usr para mostrar una figura como el ejemplo
 */
public class Programa11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número entre el 1 y el 9: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = num; i >= 1; i--) {
            for (int j = num; j >= 1; j--) {
                if(i >= j || i == j) {
                    System.out.print(j + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}