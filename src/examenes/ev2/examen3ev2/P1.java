package examenes.ev2.examen3ev2;

/**
 * 1Examen3EV2
 * Mostrar el número total de llamadas atendidas por día de la semana.
 *
 *
 * @Daasty
 */
public class P1 {
    public static void main(String[] args) {
        String[] semana = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sab", "Dom"};
        String[] operadores = {"Ana", "Antonio", "Fernando", "Javier", "Juan", "Raúl", "Silvia", "Sonia"};

        int[][] llamadas =
                //   L   M   X   J   V   S   D
                {{100, 0, 118, 187, 0, 220, 210},
                        {120, 145, 0, 118, 135, 0, 178},
                        {0, 90, 132, 133, 182, 212, 0},
                        {99, 220, 0, 140, 88, 0, 176},
                        {141, 0, 118, 166, 124, 186, 210},
                        {122, 220, 125, 0, 144, 220, 0},
                        {0, 195, 113, 205, 192, 173, 200},
                        {103, 145, 134, 202, 220, 205, 0},
                };

        for (int j = 0; j < llamadas[0].length; j++) {
            int total = 0;
            System.out.printf("%-6s ---> ", semana[j]);
            for (int i = 0; i < llamadas.length; i++) {
                System.out.printf("| %3d ", llamadas[i][j]);
                total += llamadas[i][j];
            }
            System.out.printf("||%8s %-5s : %4d", "Total", semana[j], total);
            System.out.println();
        }
    }
}
