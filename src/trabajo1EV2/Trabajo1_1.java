package trabajo1EV2;

import java.util.Scanner;

/**
 * 1. Muestra un listado de las frutas vendidas durante la semana, junto a su stock total, restante,
 * a reponer y disponible para la siguiente semana. Se debe pedir por teclado al usuario las frutas que se deben
 * reponer, siendo como máximo 500 unidades. También se deberá mostrar el total de frutas vendidas cada día.
 * Los datos deben aparecer en consola con éste formato.
 *
 * @Daasty 1.4
 */
public class Trabajo1_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] frutas = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String[] semana = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        int[] ventasDiarias = new int[semana.length];
        int[] repostStock = new int[frutas.length];

        int[][] datos = {
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
                System.out.printf("Dime stock para reponer de %s:  ", frutas[i]); //Pregunta fruta por fruta
                int temp = Integer.parseInt(teclado.nextLine());
                if (temp < 500 && temp > 0) {
                    repostStock[i] = temp;
                } else if (temp < 0) {
                    System.out.println("Error, Introduce un valor positivo: "); //En caso de ser poco stock
                    temp = Integer.parseInt(teclado.nextLine());
                    if (temp < 0) {
                        System.out.println("Pues nada, te saco del bucle.\n"); //En caso de que vuelva a introducir demasiado
                        break;
                    } else repostStock[i] = temp;
                } else {
                    System.out.println("Error, demasiado stock. Vuelve a introducir una cantidad, y ésta vez, menor que 500: "); //En caso de ser demasiado stock
                    temp = Integer.parseInt(teclado.nextLine());
                    if (temp > 500) {
                        System.out.println("Pues nada, te saco del bucle.\n"); //En caso de que vuelva a introducir demasiado
                        break;
                    } else repostStock[i] = temp;
                }
            }
        } else if (resp == 'n') ;
        else System.out.println("Debes introducir 's' o 'n'");

        System.out.printf("%13s %-5s", "", "|"); //Formateo de los días de la semana

        for (int i = 0; i < datos[0].length; i++) {
            System.out.printf("%5s %2s", semana[i], "|");
        }

        System.out.printf("\n--------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------");

        System.out.println();

        for (int i = 0; i < datos.length; i++) { //Formateo de la tabla completa
            int total = 0;
            System.out.printf("%-10s %4s", frutas[i], "|");
            for (int j = 0; j < datos[0].length; j++) {
                if (j == 0) {
                    total = datos[i][j];
                } else total -= datos[i][j];
                System.out.printf("%8d", datos[i][j]);
                ventasDiarias[j] += datos[i][j]; //Contador de las ventas diarias
            }

            System.out.printf("%4s %1s Stock: %4d || Reponer = %4d || Stock semana siguiente: %4d\n", "|", "", total, repostStock[i], total + repostStock[i]);

            datos[i][0] = total + repostStock[i]; //Establecemos el stock para la siguiente semana
        }

        System.out.printf("--------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------\n");

        System.out.printf("%-13s %-5s", "Stock diario", "|"); //Formateo Stock Diario

        for (int z : ventasDiarias) { //Muestra el stock diario
            System.out.printf("%5d %2s", z, "|");
        }

    }
}
