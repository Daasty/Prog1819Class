package examenes.ev2.examen2ev2;

import java.text.Collator;

/**
 * CORREGIDO
 * <p>
 * Ordenar las estructuras de datos por el nombre del operador utilizando el algoritmo de burbuja mejorado con test
 * de comprobaci�n CRECIENTE
 * CRECIENTE
 *
 * @Daasty
 */
public class P2 {
    public static void main(String[] args) {
        String[] semana = {"Lun", "Mar", "Mi�", "Jue", "Vie", "Sab", "Dom"};
        String[] operadores = {"Ana BD", "Juan ST", "Ra�l NF", "Sonia FJ", "Fernando GG", "Javier RD", "Antonio TD", "Silvia FG"};

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


        //ORDENACI�N

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        int max = llamadas.length - 1;
        String aux = "";


        for (int i = 0; i < operadores.length; i++) {
            boolean sw = true;
            for (int j = 0; j < max; j++) {
                if (comp.compare(operadores[j], operadores[j + 1]) > 0) {
                    aux = operadores[j];
                    operadores[j] = operadores[j + 1];
                    operadores[j + 1] = aux;
                    sw = false;

                    int[] aux2 = llamadas[j + 1];
                    llamadas[j + 1] = llamadas[j];
                    llamadas[j] = aux2;
                }
            }
            max--;
        }

        // Tabla a mostrar
        System.out.printf("%15s", "");
        for (int i = 0; i < llamadas.length; i++) {
            for (int j = 0; j < llamadas.length - 1; j++)
                if (i == 0) {
                    System.out.printf("%8s", semana[j]);
                }
        }

        System.out.println();


        for (int i = 0; i < llamadas.length; i++) {
            int total = 0;
            System.out.printf("%-15s", operadores[i]);
            for (int j = 0; j < llamadas[0].length; j++) {
                total += llamadas[i][j];
                if (llamadas[i][j] == 0) {
                    System.out.printf("%8s", "DESC");
                } else {
                    System.out.printf("%8d", llamadas[i][j]);
                }
            }
            System.out.printf("%8s %8d", "Total:", total);
            System.out.println();
        }


    }
}

