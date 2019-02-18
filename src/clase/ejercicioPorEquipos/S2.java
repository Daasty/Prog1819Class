package clase.ejercicioPorEquipos;

import java.text.Collator;

/**
 * Listado de resultados de un determinado equipo que se debe pedir por teclado
 */
public class S2 {
    public static void main(String[] args) {
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




    }
}
