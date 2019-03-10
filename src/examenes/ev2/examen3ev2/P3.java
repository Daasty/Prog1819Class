package examenes.ev2.examen3ev2;

import java.text.Collator;
import java.util.Scanner;

/**
 * 3Examen3EV2
 *
 * Listado de llamadas atendidas por un operador determinado cuyo nombre se pedirá al usuario por teclado.
 * Para el proceso de búqueda se deberá implementar el algoritmo de búqueda binaria.
 * Nota: Para simplificar el problema, se supone que el nombre de los operadores es único.
 */
public class P3 {
    public static void main(String[] args) {
        String [] semana = { "Lun","Mar","Mié","Jue", "Vie", "Sab", "Dom"};
        String [] operadores = { "Ana","Antonio","Fernando","Javier","Juan","Raúl","Silvia","Sonia"};

        int [][] llamadas =
                //   L   M   X   J   V   S   D
                { { 100,  0,118,187,  0,220,210 },
                        { 120,145,  0,118,135,  0,178 },
                        {   0, 90,132,133,182,212,  0 },
                        {  99,220,  0,140, 88,  0,176 },
                        { 141,  0,118,166,124,186,210 },
                        { 122,220,125,0  ,144,220,  0 },
                        {   0,195,113,205,192,173,200 },
                        { 103,145,134,202,220,205,  0 },
                };

        Scanner teclado = new Scanner(System.in);

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        System.out.println("Dime un nombre a buscar: ");
        String nom = teclado.nextLine();

        int izq = 0;
        int der = operadores.length;
        boolean sw = true;

        while (izq <= der) {
            int centro = (der + izq) / 2;

            if (comp.compare(nom, operadores[centro]) == 0) {
                sw = false;

                System.out.printf("Encontrado %s en posición %d. \n", operadores[centro], centro + 1);

                System.out.printf("%-12s", "");
                for (int i = 0; i < semana.length; i++) {
                    System.out.printf("%6s", semana[i]);
                }

                System.out.printf("\n%-12s", operadores[centro]);
                for (int i = 0; i < semana.length; i++) {
                    System.out.printf("%6d", llamadas[centro][i]);
                }
                break;
            }
            else if(comp.compare(nom, operadores[centro]) < 0) {
                der = centro - 1;
            }
            else {
                izq = centro + 1;
            }
        }

        if (sw) {
            System.out.println("Nombre no encontrado.");
        }
    }
}
