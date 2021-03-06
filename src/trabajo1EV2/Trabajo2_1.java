package trabajo1EV2;

import java.text.Collator;
import java.util.Scanner;

/**
 * 2. Muestra todas las ventas por días y stocks de una fruta la cuál se debe pedir al usuario.
 *
 * @Daasty v1.0
 */
public class Trabajo2_1 {
    public static void main(String[] args) {
        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        Scanner teclado = new Scanner(System.in);

        String[] frutas = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String[] semana = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

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

        System.out.println("Pide una fruta para mostrar: ");
        String frutaUsr = teclado.nextLine();

        boolean sw = true, sw2 = true;

        for (int i = 0; i < datos.length; i++) {


            if (comp.compare(frutaUsr, frutas[i]) == 0) { //Comparación de la fruta

                if (sw2) { //Sw para que sólo se muestre una vez si se ha introducido una fruta correcta
                    System.out.printf("%15s", ""); //Días de la semana
                    for (int j = 0; j < datos[0].length; j++) {
                        System.out.printf("%8s", semana[j]);
                    }
                    System.out.println();
                    sw2 = false; //Para que no vuelva a entrar
                }

                //Formateo de la fruta con el stock y lo vendido
                sw = false;
                int total = 0;
                System.out.printf("%-14s", frutaUsr);

                for (int j = 0; j < datos[0].length; j++) {
                    if (j == 0) {
                        total = datos[i][j];
                    } else {
                        total -= datos[i][j];
                    }

                    System.out.printf("%8d", datos[i][j]);
                }

                System.out.printf("   Stock: %4d || Reponer = %4d || Semana siguiente: %4d", total, repostStock[i], total + repostStock[i]);
                System.out.println();

                break; //Tras encontrar la fruta, sale del bucle
            }
        }
        if (sw2) System.out.println("No has introducido una fruta válida."); //Avisa al usr de una mala introducción
    }
}