package trabajo1EV2;

/**
 * 1. Muestra un listado de las frutas vendidas durante la semana, junto a su stock total, restante,
 * a reponer y disponible para la siguiente semana. Se debe pedir por teclado al usuario las frutas que se deben
 * reponer, siendo como máximo 500 unidades. También se deberá mostrar el total de frutas vendidas cada día.
 * Los datos deben aparecer en consola con éste formato
 * <p>
 * 2. Muestra todas las ventas por días y stocks de una fruta la cuál se debe pedir al usuario.
 * <p>
 * 3. Muestra cada día que no se hayan vendido más de x unidades de una misma fruta, siendo x una cantidad que se debe pedir al usuario.
 * <p>
 * 4. Muestra los datos ordenados de forma decreciente por el stock inicial de la semana.
 * <p>
 * 5. Muestra las frutas que tienen un intervalo de stock que se debe pedir al usuario.
 *
 * @Daasty
 */
public class Principal {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Pera", "Melocotón", "Piña", "Uvas", "Plátanos", "Sandía"};

        String[] semana = {"Stock", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        int[] repostStock = new int[7];

        int[][] datos = {
                {250, 50, 20, 32, 45, 10, 16, 20},
                {300, 10, 13, 42, 32, 12, 10, 30},
                {400, 24, 21, 34, 86, 12, 32, 35},
                {150, 9, 17, 15, 8, 9, 19, 32, 11},
                {300, 15, 19, 23, 22, 56, 21, 13},
                {200, 24, 28, 43, 21, 18, 19, 21},
                {100, 9, 4, 2, 24, 18, 15, 23},
        };
    }
}
