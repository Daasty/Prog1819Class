package clase.ejercicioPorEquipos;

/**
 * Listado de recompensas por cada uno de los equipos en funcion de la tabla siguiente:
 * 1 = 100000
 * 2 = 50000
 * 3 = 25000
 * 4 = 10000
 */
public class S1 {
    public static void main(String[] args) {
        String cities[] = {"Leeds", "Madrid", "Bilbao", "Lisboa", "Oporto", "París"};
        String teams[] = {"Black door", "Blizzard", "D&D Robotics", "Renegades", "Steel tigers", "TK raptors"};

        int[][] pos = { { 1,3,5,1,1,5},
                { 4,2,1,4,5,4},
                { 2,1,2,3,6,1},
                { 6,5,3,5,2,3},
                { 5,6,6,6,4,6},
                { 3,4,4,2,3,2}};

        for(int i = 0; i < teams.length; i++) {
            int sumaTotal = 0;
            System.out.printf("%15s: ", teams[i]);

            for (int j = 0; j < pos[0].length; j++) {
                switch (pos[i][j]) {
                    case 1: sumaTotal += 100000;
                    break;
                    case 2: sumaTotal += 50000;
                    break;
                    case 3: sumaTotal += 25000;
                    break;
                    default: sumaTotal += 10000;
                }
            }

            System.out.printf("Recompensa total: %7d \n", sumaTotal);
        }
    }
}
