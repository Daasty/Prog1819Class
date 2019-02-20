package clase.ejercicioPorEquipos;

/**
 * Listado de equipos que no han ganado ninguna competición
 */

public class S5 {
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

        boolean sw2 =  true;

        for (int i = 0; i < pos.length; i++) {
            boolean sw = true;

            for (int j = 0; j < pos[0].length; j++) {
                if (pos[i][j] == 1) {
                    sw = false;
                }
            }

            if (sw) {
                System.out.printf("%s no ha ganado ninguna vez.\n", teams[i]);
                sw2 = false;
            }
        }

        if (sw2){
            System.out.println("Todos han ganado alguna vez.");
        }
    }
}
