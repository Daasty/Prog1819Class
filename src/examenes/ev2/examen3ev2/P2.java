package examenes.ev2.examen3ev2;

/**
 * 2Examen3EV2
 * Mostrar un listado de datos (operador y día) correspondiente al mauor número de llamadas atendidas en esta semana.
 * (Tener en cuanta que pueden ser varios)
 *
 * @Daasty
 */
public class P2 {
    public static void main(String[] args) {
        String[] semana = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sab", "Dom"};
        String[] operadores = {"Ana", "Antonio", "Fernando", "Javier", "Juan", "Raúl", "Silvia", "Sonia"};

        int[][] llamadas =
                //   L   M   X   J   V   S   D
                {{100, 0, 118, 187, 0, 630, 210},
                        {120, 145, 0, 118, 135, 0, 178},
                        {0, 90, 132, 133, 182, 212, 0},
                        {99, 220, 0, 630, 88, 0, 176},
                        {141, 0, 118, 166, 124, 186, 210},
                        {122, 220, 125, 0, 144, 220, 0},
                        {0, 630, 113, 205, 192, 173, 200},
                        {103, 145, 134, 202, 220, 205, 0},
                };
        int max = llamadas[0][0];

        for (int i = 0; i < llamadas.length; i++) {
            for (int j = 0; j < llamadas[0].length; j++) {
                if (llamadas[i][j] > max) {
                    max = llamadas[i][j];
                }
            }
        }

        for (int i = 0; i < llamadas.length; i++) {
            for (int j = 0; j < llamadas[0].length; j++) {
                if (llamadas[i][j] == max) {
                    System.out.printf("Operador %10s en día %3s hizo %4d llamadas atendidas.\n", operadores[j],
                            semana[i], llamadas[i][j]);
                }
            }
        }

    }
}
