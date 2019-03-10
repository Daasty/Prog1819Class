package clase.juegoRaro;

import java.util.Scanner;

/**
 * NOTA: PSV + CTRL + ESPACIO = main
 * <p>
 * Juego que trata celdas 7x7 en las que cuando rellenas una casilla se rellenan automáticamente las inmediatamente contiguas arriba y abajo.
 * <p>
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 * |  |  |  |  |  |  |  |
 * #==#==#==#==#==#==#==#
 */
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[7][7];

        Scanner teclado = new Scanner(System.in);

        fill(array);

        boolean sw = false;

        while (!sw) {
            System.out.println("Introduce las coordenadas donde deseas rellenar: ");
            System.out.println("Para X: ");
            int x = Integer.parseInt(teclado.nextLine());
            System.out.println("Para Y: ");
            int y = Integer.parseInt(teclado.nextLine());

            boolean top = false, bot = false, right = false, left = false, center = false;
            for (int i = 0; i < array.length; i++) {
                boolean on = true;
                for (int j = 0; j < array[0].length; j++) {
                    if (x == i && y == j) {
                        if (x >= 1 || y >= 1) {
                            if (array[i][j] == 1) {center = true; array[i][j] = 0;}
                            if (array[i + 1][j] == 1) {top = true; array[i + 1][j] = 0;}
                            if (array[i - 1][j] == 1) {bot = true; array[i - 1][j] = 0;}
                            if (array[i][j + 1] == 1) {right = true; array[i][j + 1] = 0;}
                            if (array[i][j - 1] == 1) {left = true; array[i][j - 1] = 0;}

                            if (array[i][j] == 0 && !center) {array[i][j] = 1;}
                            if (array[i + 1][j] == 0 && !top) {array[i + 1][j] = 1;}
                            if (array[i - 1][j] == 0 && !bot) {array[i - 1][j] = 1;}
                            if (array[i][j + 1] == 0 && !right) {array[i][j + 1] = 1;}
                            if (array[i][j - 1] == 0 && !left) {array[i][j - 1] = 1;}

                            mostrar(array);

                        }
                        else if (x == 0) {

                        }

                    }
                }
            }
        }


    }

    private static void fill(int[][] array) {
        for (int[] z : array) {
            System.out.printf("#===#===#===#===#===#===#===#\n");
            for (int a : z) {
                a = 0;
                System.out.printf("| %-2d", a);
            }
            System.out.printf("|\n");
        }
    }

    private static void mostrar(int[][] array) {
        for (int[] z : array) {
            System.out.printf("#===#===#===#===#===#===#===#\n");
            for (int a : z) {
                System.out.printf("| %-2d", a);
            }
            System.out.printf("|\n");
        }
    }


    public static void change() {

    }
}
