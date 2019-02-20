package clase.ejercicioPorEquipos;

import java.util.Scanner;
import java.text.Collator;

/**
 * Mostrar un listado con el nombre de los equipos que consiguieron al menos una vez el mismo puesto de forma consecutiva en las competiciones de dos ciudades.
 */

public class S8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        String cities[] = {"Leeds", "Madrid", "Bilbao", "Lisboa", "Oporto", "París"};
        String teams[] = {"Black door", "Blizzard", "D&D Robotics", "Renegades", "Steel tigers", "TK raptors"};

        int[][] pos = {{1, 3, 5, 1, 1, 5},
                {4, 2, 1, 4, 5, 4},
                {2, 1, 2, 3, 6, 1},
                {6, 5, 3, 5, 2, 3},
                {5, 6, 6, 6, 4, 6},
                {3, 4, 4, 2, 3, 2}
        };


        for (int i = 0; i < pos.length; i++) {
            for (int j = 0; j < pos[0].length - 1; j++) {
                if (pos[i][j] == pos[i][j + 1]) {
                    System.out.printf("%s consiguió el %d puesto en: %s", teams[i], pos[i][j], cities[j]);
                    if (pos[i][j] == pos[i][j + 2]) {
                        System.out.printf(", %s y %s\n", cities[j + 1], cities[j + 2]);
                        break;
                    }
                    else System.out.printf(" y %s\n", cities[j + 1]);
                }
            }
        }
    }
}