package examenes.ev2.examen2ev2;

/**
 * Listado de trabajadores que NO han descansado esta semana.
 *
 * @Daasty
 */

public class P4 {
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
        boolean sw = true;
        for (int i = 0; i < llamadas.length; i++) {
            sw = true; //Reiniciamos interruptor
            for (int j = 0; j < llamadas[0].length; j++) {
                if (llamadas[i][j] == 0) { //Interruptor para saber si ha descansado algún día
                    sw = false;
                }

            }
            if (sw) { //Si no ha entrado en la condición, no ha descansado
                System.out.printf("%s no ha descansado esta semana\n", operadores[i]);
            }

            //Falta si todos descansan, no tiempo
        }
    }
}