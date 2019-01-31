package ut4;

/**
 * Proceso que desplaza todos los valores a la derecha añadiendo un 0 por la izquierda
 */
public class Ejercicio1_2_Recorridos {
    public static void main(String[] args) {
        int[] datos = {10, 21, -4, 18, 5, 9};
        int aux;

        for (int i = datos.length - 1; i > 0; i--) {
            datos[i] = datos[i - 1];
        }

        datos[0] = 0;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%d ", datos[i]);
        }
    }
}
