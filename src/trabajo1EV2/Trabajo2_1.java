package trabajo1EV2;

import java.text.Collator;
import java.util.Scanner;

/**
 * 2. Pedir fruta al usuario para mostrar todas las ventas y stock de la semana
 *
 * @Daasty
 */
public class Trabajo2_1 {
    public static void main(String[] args) {
        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

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

        System.out.println("Pide una fruta para mostrar: ");
        String frutaUsr = teclado.nextLine();

        System.out.printf("%15s", ""); //Días de la semana
        for (int i = 0; i < datos[0].length; i++) {
            System.out.printf("%8s", semana[i]);
        }
        System.out.println();

        boolean sw = true;

        for (int i = 0; i < datos.length; i++) {
            if (comp.compare(frutaUsr, frutas[i]) == 0) { //Comparación de la fruta
                sw = false;
                int total = 0;
                System.out.printf("%-14s", frutaUsr);

                for (int j = 0; j < datos[0].length; j++) {
                    if (j == 0) {
                        total = datos[i][j];
                    }

                    else {
                        total -= datos[i][j];
                    }

                    System.out.printf("%8d", datos[i][j]);
                }

                System.out.printf("   Stock: %4d || Reponer = %4d || Semana siguiente: %4d", total, repostStock[i], total + repostStock[i]);
                System.out.println();
            }

            else if (!sw) {
                break;
            }
        }
    }
}