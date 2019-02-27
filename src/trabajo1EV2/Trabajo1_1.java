package trabajo1EV2;

import java.util.Scanner;

/**
 * 1. Se muestra la tabla y, a la derecha, está el total vendido y el stock a reponer más el restante.
 */
public class Trabajo1_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frutas[] = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String semana[] = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        int repostStock[] = new int[7];

        int datos[][] = {
                {250, 50, 20, 32, 45, 10, 16, 20},
                {300, 10, 13, 42, 32, 12, 10, 30},
                {400, 24, 21, 34, 86, 12, 32, 35},
                {150, 9, 17, 15, 8, 9, 19, 32, 11},
                {300, 15, 19, 23, 22, 56, 21, 13},
                {200, 24, 28, 43, 21, 18, 19, 21},
                {100, 9, 4, 2, 24, 18, 15, 23},
        };

        char resp = ' ';
        System.out.println("Quieres reponer stock? (s/n)");
        resp = teclado.nextLine().trim().toLowerCase().charAt(0);


        if (resp == 's') {
            for (int i = 0; i < repostStock.length; i++) {
                System.out.printf("Dime stock para reponer el %s:  ", semana[i + 1]);
                repostStock[i] = Integer.parseInt(teclado.nextLine());
            }
        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {

            }
        }

        System.out.printf("%15s", "");
        for (int i = 0; i < datos[0].length; i++) {
            System.out.printf("%8s", semana[i]);
        }
        System.out.println();
        for (int i = 0; i < datos.length; i++) {
            int total = 0;
            System.out.printf("%-15s", frutas[i]);
            for (int j = 0; j < datos[0].length; j++) {
                total += datos[i][j];
                if (datos[i][j] == 0) {
                    System.out.printf("%8s", "DESC");
                }
                else {
                    System.out.printf("%8d", datos[i][j]);
                }
            }
            System.out.printf("%8s %8d", "Total:", total);
            System.out.println();
        }


}
}
