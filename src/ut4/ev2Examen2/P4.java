package ut4.ev2Examen2;

import java.util.Random;

/**
 * Escribir un programa que rellene 5 filas y 8 columnas con números aleatorios entre 0 y 100 para mostrar el mayor y el menor en cada una de las COLUMNAS
 */
public class P4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int datos[][] = new int[5][8];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                datos[i][j] = rnd.nextInt(100) + 100;
            }
        }

        for (int i = 0; i < datos[0].length; i++) {
            int max = datos[0][0];
            int min = datos[0][0];

            for (int j = 0; j < datos.length; j++) {
                if (datos[j][i] > max) {
                    max = datos[j][i];
                }
                else if (datos[j][i] < min) {
                    min = datos[j][i];
                }
            }
            System.out.printf("Max de la columna %d es %d y el min %d\n", i, max, min);

        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                System.out.printf("%d, ", datos[i][j]);
            }
            System.out.println();
        }
    }
}
