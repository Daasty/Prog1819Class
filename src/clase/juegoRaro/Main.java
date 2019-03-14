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

        boolean sw = true;

        while (sw) {
            System.out.println("Introduce las coordenadas donde deseas rellenar: ");
            System.out.println("Para X: ");
            int y = Integer.parseInt(teclado.nextLine());

            if (y < 1 || y > 7) {
                System.out.println("Posición no válida.");
                y = 1;
            }
            System.out.println("Para Y: ");
            int x = Integer.parseInt(teclado.nextLine());

            if (x < 1 || x > 7) {
                System.out.println("Posición no válida.");
                x = 1;
            }

            x = x - 1;
            y = y - 1;

            boolean top = false, bot = false, right = false, left = false, center = false;
            for (int i = 0; i < array.length; i++) {
                boolean on = true;
                for (int j = 0; j < array[0].length; j++) {
                    if (x == i && y == j) {


                        Margenes margenes = new Margenes(array, y, x, top, bot, right, left, center, i, j).invoke();
                        top = margenes.isTop();
                        bot = margenes.isBot();
                        right = margenes.isRight();
                        left = margenes.isLeft();
                        center = margenes.isCenter();
                        mostrar(array);
                    }
                }
            }

            sw = false;

            for (int[] z : array) {
                for (int a : z) {
                    if (a == 0) {
                        sw = true;
                        break;
                    }
                }
                if (sw) break;
            }
        }

        if (!sw) {
            System.out.println("Has ganado!");
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
        System.out.printf("#===#===#===#===#===#===#===#\n");
    }

    private static void mostrar(int[][] array) {
        for (int[] z : array) {
            System.out.printf("#===#===#===#===#===#===#===#\n");
            for (int a : z) {
                System.out.printf("| %-2d", a);
            }
            System.out.printf("|\n");
        }
        System.out.printf("#===#===#===#===#===#===#===#\n");
    }


    private static class Margenes {
        private int[][] array;
        private int y;
        private int x;
        private boolean top;
        private boolean bot;
        private boolean right;
        private boolean left;
        private boolean center;
        private int i;
        private int j;

        public Margenes(int[][] array, int y, int x, boolean top, boolean bot, boolean right, boolean left, boolean center, int i, int j) {
            this.array = array;
            this.y = y;
            this.x = x;
            this.top = top;
            this.bot = bot;
            this.right = right;
            this.left = left;
            this.center = center;
            this.i = i;
            this.j = j;
        }

        public boolean isTop() {
            return top;
        }

        public boolean isBot() {
            return bot;
        }

        public boolean isRight() {
            return right;
        }

        public boolean isLeft() {
            return left;
        }

        public boolean isCenter() {
            return center;
        }

        public Margenes invoke() {
            if (array[i][j] == 1) {
                center = true;
                array[i][j] = 0;
            }
            if (array[i][j] == 0 && !center) {
                array[i][j] = 1;
            }

            if (x != 0) {

                if (array[i - 1][j] == 1) {
                    top = true;
                    array[i - 1][j] = 0;
                }
                if (array[i - 1][j] == 0 && !top) {
                    array[i - 1][j] = 1;
                }
            }

            if (y != 0) {
                if (array[i][j - 1] == 1) {
                    left = true;
                    array[i][j - 1] = 0;
                }
                if (array[i][j - 1] == 0 && !left) {
                    array[i][j - 1] = 1;
                }
            }

            if (y != array[0].length - 1) {
                if (array[i][j + 1] == 1) {
                    right = true;
                    array[i][j + 1] = 0;
                }
                if (array[i][j + 1] == 0 && !right) {
                    array[i][j + 1] = 1;
                }
            }
            if (x != array.length - 1) {
                if (array[i + 1][j] == 1) {
                    bot = true;
                    array[i + 1][j] = 0;
                }
                if (array[i + 1][j] == 0 && !bot) {
                    array[i + 1][j] = 1;
                }
            }
            return this;
        }
    }
}
