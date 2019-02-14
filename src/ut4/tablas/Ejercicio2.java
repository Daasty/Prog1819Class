package ut4.tablas;

import java.util.Scanner;

/**
 * Programa que pida al usuario un valor para indicar si se encuentra o no en la tabla,
 * en caso de estar, mostrar las posiciones.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int datos[][] = {
                {2, 34, 32, 14},
                {45, 56, 21, 19},
                {56, 43, 17, 71},
                {43, 29, 76, 45}
        };

        System.out.println("Dime un número a buscar: ");
        int num = teclado.nextInt();

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                if (datos[i][j] == num) {
                    System.out.printf("Encontrado en la fila %d y en la columna %d.\n", i, j);
                }
            }
        }
    }
}