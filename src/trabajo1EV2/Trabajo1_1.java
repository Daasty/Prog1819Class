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
        System.out.println("Quieres reponer stock? (s/n)");  // Preguntar al usuario si quiere reponer stock
        resp = teclado.nextLine().trim().toLowerCase().charAt(0);


        if (resp == 's') {
            for (int i = 0; i < repostStock.length; i++) {
                System.out.printf("Dime stock para reponer el %s:  ", semana[i + 1]); //Pregunta día por día
                int temp = Integer.parseInt(teclado.nextLine());
                if (temp < 500) {
                    repostStock[i] = temp;
                }
                else {
                    System.out.println("Error, demasiado stock. Se ha establecido 100 de stock por precaución."); //En caso de ser demasiado stock
                    repostStock[i] = 100;
                }
            }
        }

        System.out.printf("%15s", ""); //Formateo de los días de la semana
        for (int i = 0; i < datos[0].length; i++) {
            System.out.printf("%8s", semana[i]);
        }

        System.out.println();

        for (int i = 0; i < datos.length; i++) { //Formateo de la tabla completa
            int total = 0;
            System.out.printf("%-14s", frutas[i]);
            for (int j = 0; j < datos[0].length; j++) {
                if (j == 0) {
                    total = datos[i][j];

                }
                else total -= datos[i][j];
                    System.out.printf("%8d", datos[i][j]);
            }
            System.out.printf("   Stock: %4d || Reponer = %4d || Semana siguiente: %4d", total, repostStock[i], total + repostStock[i]);
            System.out.println();

            datos[i][0] = total + repostStock[i]; //Establecemos el stock para la siguiente semana
        }
}
}
