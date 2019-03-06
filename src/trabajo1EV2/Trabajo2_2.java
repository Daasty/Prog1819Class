package trabajo1EV2;

import java.util.Scanner;

/**
 * 3. Muestra cada día que no se hayan vendido más de x unidades de una misma fruta, siendo x una cantidad que se debe pedir al usuario.
 *
 * @Daasty v1.1
 */
public class Trabajo2_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] frutas = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String[] semana = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        int[] repostStock = new int[frutas.length];

        int[][] datos = {
                {250, 50, 20, 32, 45, 8, 16, 20},
                {300, 10, 13, 42, 2, 12, 10, 30},
                {400, 24, 21, 34, 86, 12, 32, 35},
                {150, 9, 17, 15, 8, 9, 19, 32, 11},
                {300, 15, 19, 23, 22, 56, 21, 13},
                {200, 24, 28, 43, 21, 18, 19, 21},
                {100, 9, 4, 2, 24, 18, 15, 23},
        };

        System.out.println("Dime qué cantidad deseas mostrar: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%-10s ------>", frutas[i]);
            boolean sw = false;
            boolean sw2 = true;
            for (int j = 1; j < datos[0].length; j++) {
                if (datos[i][j] < num && sw == false) {
                    System.out.printf("%3s Menos de %d en %2s", "", num, semana[j]);
                    sw = true;
                    sw2 = false;
                } else if (datos[i][j] < num && sw == true) {
                    System.out.printf(" y en %2s", semana[j]);
                }
            }
            if (sw2) {
                System.out.printf("%3s Ningún día", "");
            }

            System.out.println();
        }
    }
}
