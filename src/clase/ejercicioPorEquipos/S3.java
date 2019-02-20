package clase.ejercicioPorEquipos;

/**
 * Listado de quipos que han ganado por ciudades
 */

public class S3 {
    public static void main(String[] args) {

        String cities[] = {"Leeds", "Madrid", "Bilbao", "Lisboa", "Oporto", "París"};
        String teams[] = {"Black door", "Blizzard", "D&D Robotics", "Renegades", "Steel tigers", "TK raptors"};

        int[][] pos = {{1, 3, 5, 1, 1, 5},
                {4, 2, 1, 4, 5, 4},
                {2, 1, 2, 3, 6, 1},
                {6, 5, 3, 5, 2, 3},
                {5, 6, 6, 6, 4, 6},
                {3, 4, 4, 2, 3, 2}};

        System.out.println("Equipo ganador en cada ciudad:");

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < teams.length; j++) {
                if (pos[i][j] == 1) {
                    System.out.printf("%-8s  :  %s \n", cities[j], teams[i]);
                }
            }
        }
    }
}
