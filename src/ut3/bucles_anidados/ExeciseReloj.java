package ut3.bucles_anidados;

/**
 * Escribe un programa que muestre todas las horas que se pueden ver en un reloj de 24 horas
 */
public class ExeciseReloj {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.printf("%02d:%02d\n", i, j);
            }
        }
    }
}
