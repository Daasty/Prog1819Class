package trabajo1EV2;

/**
 * 3. Mostrar todas las frutas que algún día hayan vendido 10 o menos frutas y mostrar cada uno de los días.
 *
 * @Daasty
 */
public class Trabajo2_2 {
    public static void main(String[] args) {
        String frutas[] = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String semana[] = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        int repostStock[] = new int[7];

        int datos[][] = {
                {250, 50, 20, 32, 45, 8, 16, 20},
                {300, 10, 13, 42, 2, 12, 10, 30},
                {400, 24, 21, 34, 86, 12, 32, 35},
                {150, 9, 17, 15, 8, 9, 19, 32, 11},
                {300, 15, 19, 23, 22, 56, 21, 13},
                {200, 24, 28, 43, 21, 18, 19, 21},
                {100, 9, 4, 2, 24, 18, 15, 23},
        };

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%-10s ------>", frutas[i]);
            boolean sw = false;
            boolean sw2 = true;
            for (int j = 1; j < datos[0].length; j++) {
                if (datos[i][j] < 10 && sw == false) {
                    System.out.printf("%10s se ha vendido menos de 10 en %2s", frutas[i], semana[j]);
                    sw = true;
                    sw2 = false;
                }
                else if (datos[i][j] < 10 && sw == true) {
                    System.out.printf(" y en %2s", semana[j]);
                }
            }
            if (sw2) {
                System.out.printf("%10s no se ha vendido menos de 10 ningún día",frutas[i]);
            }

            System.out.println();
        }
    }
}
