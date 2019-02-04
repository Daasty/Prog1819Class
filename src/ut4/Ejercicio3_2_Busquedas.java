package ut4;

/**
 * 1. Sustituir todos los valoreses negativos por un 0.
 * 2. Mostrar cuál es el mayor almacenado(puede estar en varias posiciones)
 */
public class Ejercicio3_2_Busquedas{
    public static void main(String[] args) {
        int datos[] = {1, 5, 2, 5, 3, 4, 5, 3};
        int cont = 0, max = datos[0];
        boolean sw = true;

        for(int i = 0; i < datos.length; i++) {
            if (datos[i] < 1 || datos[i] > 5) {
                sw = false;
            }
        }

        if (sw) {
            System.out.println("Sí contiene valores SÓLO entre 1 y 5");
        }
        else System.out.println("No SÓLO contiene valores entre 1 y 5");
    }
}

