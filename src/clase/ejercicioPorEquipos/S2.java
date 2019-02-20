package clase.ejercicioPorEquipos;

import java.text.Collator;
import java.util.Scanner;

/**
 * Listado de resultados de un determinado equipo que se debe pedir por teclado
 */
public class S2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cities[] = {"Leeds", "Madrid", "Bilbao", "Lisboa", "Oporto", "París"};
        String teams[] = {"Black door", "Blizzard", "D&D Robotics", "Renegades", "Steel tigers", "TK raptors"};

        int[][] pos = {{1, 3, 5, 1, 1, 5},
                {4, 2, 1, 4, 5, 4},
                {2, 1, 2, 3, 6, 1},
                {6, 5, 3, 5, 2, 3},
                {5, 6, 6, 6, 4, 6},
                {3, 4, 4, 2, 3, 2}};

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        System.out.println("Dime el equipo del que quieres saber los resultados: ");

        String equipo =  teclado.nextLine().trim();
        int posicion = -1;

        for (int i = 0; i < teams.length; i++) {
                if (comp.compare(teams[i], equipo) == 0) {
                    posicion = i;
                    break;
            }
        }

        if (posicion < 0) {
            System.out.println("No encontrado.");
        }

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-12s  :  %d\n", cities[posicion], pos[posicion][i]);
        }

    }
}
