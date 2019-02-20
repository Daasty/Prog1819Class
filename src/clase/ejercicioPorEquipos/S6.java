package clase.ejercicioPorEquipos;

/**
 * Mostrar la tabla bien tabulada.
 */

public class S6 {
    public static void main(String[] args) {

        String cities[] = {"Leeds", "Madrid", "Bilbao", "Lisboa", "Oporto", "París"};
        String teams[] = {"Black door", "Blizzard", "D&D Robotics", "Renegades", "Steel tigers", "TK raptors"};

        int[][] pos = {{1, 3, 5, 1, 1, 5},
                {4, 2, 1, 4, 5, 4},
                {2, 1, 2, 3, 6, 1},
                {6, 5, 3, 5, 2, 3},
                {5, 6, 6, 6, 4, 6},
                {3, 4, 4, 2, 3, 2}
        };

        System.out.printf("%12s", "");
        for (int i = 0; i < pos.length; i++) {
            if (i == 0) {
                for (int j = 0; j < pos[0].length; j++) {
                    System.out.printf("%8s", cities[j]);
                }

            }

            System.out.println();
            System.out.printf("%-12s", teams[i]);

            for (int j = 0; j < pos[0].length; j++) {
                System.out.printf("%8d", pos[i][j]);
            }


        }
    }
}
