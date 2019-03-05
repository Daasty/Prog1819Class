package trabajo1EV2;

/**
 * 4. Ordenar las filas de mayor a menor stock durante la semana.
 *
 * @Daasty
 */
public class Trabajo3_1 {

    public static void main(String[] args) {
        String frutas[] = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String semana[] = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        int[] ventasDiarias = new int[8];
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


        int max = datos.length - 1;

        for (int a = 1; a < datos.length - 1; a++) {
            boolean sw = true;

            for (int i = 0; i < max; i++) {
                if (datos[i][0] < datos[i + 1][0]) {
                    //Cambiamos los nombres de las frutas
                    String auxStr = frutas[i];
                    frutas[i] = frutas[i + 1];
                    frutas[i + 1] = auxStr;

                    //Cambiamos toda la fila
                    int[] aux = datos[i + 1];
                    datos[i + 1] = datos[i];
                    datos[i] = aux;
                }
            }
            max--;
        }

        System.out.printf("%15s", ""); //Formateo de los días de la semana
        for (int i = 0; i < datos[0].length; i++) {
            System.out.printf("%8s", semana[i]);
        }

        System.out.println();

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

            System.out.printf("%4s %1s Stock: %4d || Reponer = %4d || Stock semana siguiente: %4d", "|", "", total, repostStock[i], total + repostStock[i]);
            System.out.println();

            datos[i][0] = total + repostStock[i]; //Establecemos el stock para la siguiente semana
        }

        System.out.printf("--------------------------------------------------------------------------------------" +
                "-------------------------------------------------------------\n");

        System.out.printf("%-13s %-5s", "Stock diario", "|"); //Formateo Stock Diario

        for (int i = 0; i < ventasDiarias.length; i++) { //Muestra el stock diario
            System.out.printf("%5s %2s", ventasDiarias[i], "|");
        }
    }
}