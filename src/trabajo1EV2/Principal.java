package trabajo1EV2;

/**
 * 1. Se muestra la tabla y, a la derecha, está el total vendido y el stock a reponer más el restante.
 * 2. Pedir fruta al usuario para mostrar todas las ventas y stock de la semana
 * 3. Mostrar todas las frutas que algún día hayan vendido menos de 10 frutas y mostrar cada uno de los días.
 * 4. Ordenar las filas de mayor a menor stock durante la semana.
 * 5. Cuáles son las 3 frutas con menos stock
 *
 * @Daasty
 */
public class Principal {
    public static void main(String[] args) {
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
    }
}
