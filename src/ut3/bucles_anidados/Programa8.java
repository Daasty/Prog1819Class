package ut3.bucles_anidados;

import java.util.Scanner;

/**
 * Que pida un número entero entre 1 y 9 al usr para mostrar una figura como el ejemplo
 */
public class Programa8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entre el 1 y el 9: ");
        int num = Integer.parseInt(teclado.nextLine());

        for(int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= j) {
                    System.out.printf("%d ", j);
                }
                else System.out.printf("%d ", i);
            }
            System.out.println();
        }

      /*  int aux = 1;
        int[][] array = new int[num + 1][num + 1];

        for (int i = 1; i <= num; i++) {
            aux = 1;
            for (int j = 1; j <= num; j++) {
                System.out.printf("%d ", aux);
                array[i][j] = aux;
                if (aux == j - i + 1) {
                    aux++;
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                array[i][j] = array[i -1][j];
                System.out.printf("%d ", array[j][i]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf("%d ", array[j][i]);
            }
            System.out.println();
        }
        */
    }
}