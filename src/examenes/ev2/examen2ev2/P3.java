package examenes.ev2.examen2ev2;

import java.text.Collator;
import java.util.Scanner;

/**
 * CORREGIDO
 *
 * Listado de llamadas atendidas POR operador para un día de la semana determinado que se pedirá
 * al usuario por teclado.
 *
 * @Daasty
 */
public class P3 {
    public static void main(String[] args) {
        String[] semana = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sab", "Dom"};
        String[] operadores = {"Ana BD", "Juan ST", "Raúl NF", "Sonia FJ", "Fernando GG", "Javier RD", "Antonio TD", "Silvia FG"};

        int[][] llamadas =
                //   L   M   X   J   V   S   D
                {{100, 155, 118, 187, 0, 0, 210},
                        {120, 145, 0, 118, 135, 0, 178},
                        {0, 90, 132, 133, 182, 212, 0},
                        {99, 0, 0, 140, 88, 199, 176},
                        {141, 105, 118, 166, 124, 186, 210},
                        {122, 200, 125, 123, 144, 0, 0},
                        {0, 0, 113, 205, 192, 173, 200},
                        {103, 145, 134, 202, 0, 205, 0},
                };

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un día de la semana para mostrar");
        String dia = teclado.nextLine(); //Pedirmos el dia al usuario

        System.out.printf("%23s\n", dia); //Mostramos el día
        for (int i = 0; i < llamadas.length; i++) {
            for (int j = 0; j < llamadas[0].length; j++) {

                if (comp.compare(dia, semana[j]) == 0) {

                    System.out.printf("%-15s", operadores[i]); //Mostramos todos los operadores
                    if (llamadas[i][j] == 0) {
                        System.out.printf("%10s", "DESC\n");
                    } else {
                        System.out.printf("%8d", llamadas[i][j]);//Y mostramos las llamadas del dia
                        System.out.println();
                    }
                }
            }
        }
    }
}