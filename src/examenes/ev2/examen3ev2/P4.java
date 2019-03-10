package examenes.ev2.examen3ev2;

/**
 * 3Examen3EV2
 * <p>
 * Listado de trabajadores que han descansado dos días consecutivos.
 * (La tabla guarda un 0 para indicar que un operador ha descansado un día de la semana).
 *
 * @Daasty
 */

public class P4 {
    public static void main(String[] args) {
        String[] semana = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sab", "Dom"};
        String[] operadores = {"Ana", "Antonio", "Fernando", "Javier", "Juan", "Raúl", "Silvia", "Sonia"};

        int[][] llamadas =
                //   L   M   X   J   V   S   D
                {{100, 0, 53, 187, 0, 220, 210},
                        {120, 145, 0, 118, 135, 0, 178},
                        {0, 90, 132, 133, 182, 212, 0},
                        {99, 220, 0, 140, 53, 0, 176},
                        {141, 0, 118, 166, 124, 186, 210},
                        {122, 220, 125, 204, 0, 0, 120},
                        {0, 195, 113, 205, 192, 173, 200},
                        {103, 145, 134, 202, 220, 0, 0},
                };

        boolean sw = true;

        for (int i = 0; i < llamadas.length; i++) {
            boolean sw2 = true;
            for (int j = 0; j < llamadas[0].length - 1; j++) {
                if (llamadas[i][j] == llamadas[i][j + 1] && sw2) {
                    System.out.printf("%8s ha descansado %3s y %3s.\n", operadores[i], semana[j], semana[j + 1]);
                    sw = false;
                    sw2 = false;
                }
            }
        }

        if (sw) {
            System.out.println("Nadie ha descansado dos días seguidos");
        }
    }
}
