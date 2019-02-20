package ut4.ev2Examen2;

/**
 * Dado un vector de enteros con datos DESORDENADOS, comprobar si todos los valores son positivos
 */
public class P3 {
    public static void main(String[] args) {
        int datos[] = {23, 21, 1, 16, 65, 67, 75, 32, -21, 98, 90, 46, 32, 19, 73};

        boolean sw = false;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 0) {
                sw = true;
                break;
            }
        }

        if (sw) {
            System.out.printf("No todos son positivos.");
        }
        else System.out.println("Todos son positivos.");
    }
}
