package clase.ejercicioPorEquipos;

/**
 * Listado por equipos en el que se muestra su mejor posición y el lugar o lugares donde se produjo dicho resultado
 */
public class S4 {
    public static void main(String[] args) {

        String cities[] = {"Leeds", "Madrid", "Bilbao", "Lisboa", "Oporto", "París"};
        String teams[] = {"Black door", "Blizzard", "D&D Robotics", "Renegades", "Steel tigers", "TK raptors"};

        int[][] pos = {{1, 3, 5, 1, 1, 5},
                {4, 2, 1, 4, 5, 4},
                {2, 1, 2, 3, 6, 1},
                {6, 5, 3, 5, 2, 3},
                {5, 6, 6, 6, 4, 6},
                {3, 4, 4, 2, 3, 2}};


        for (int i = 0; i < pos.length; i++) {
            int min = pos[i][0];

            for (int j = 0; j < pos[0].length; j++) {
                if(pos[i][j] < min) {
                    min = pos[i][j];
                }
            }
            System.out.printf("%-12s \n", teams[i]);
            for (int j = 0; j < pos[0].length; j++) {
                if (pos[i][j] == min) {
                    System.out.printf(">> %-8s  :  %d\n", cities[j], pos[i][j]);
                }
            }
        }
    }
}
