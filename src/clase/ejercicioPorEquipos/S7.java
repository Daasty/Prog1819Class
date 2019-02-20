package clase.ejercicioPorEquipos;

import java.util.Scanner;
import java.text.Collator;

/**
 * Mostrar la posición obtenida por un determinado equipo en determinada ciudad. Se deben pedir por teclado al usr y si el equipo no está en el sistema,
 * no darle la ciudad
 */

public class S7 {
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

        boolean sw1 = false;
        int aux1 = 0, aux2 = 0;

        System.out.println("Dime un equipo: ");
        String eqUsr = teclado.nextLine();
        for (int i = 0; i < cities.length; i++) {
            if (comp.compare(eqUsr, teams[i]) == 0) {
                sw1 = true;
                aux1 = i;
            }
        }

        boolean sw2 = false;

        if (sw1) {
            System.out.println("Dime una ciudad: ");
            String ciudUsr = teclado.nextLine();

            for (int i = 0; i < cities.length; i++) {
                if (comp.compare(ciudUsr, cities[i]) == 0) {
                    sw2 = true;
                    aux2 = i;
                }
            }
            if (sw2){
                System.out.printf("La posición obtenida por el equipo %s en la ciudad %s es %d", teams[aux1], cities[aux2], pos[aux2][aux1]);

            }
            else System.out.println("La ciudad introducida no es correcta.");
        }
        else System.out.println("El equipo introducido no es correcto.");
    }
}
