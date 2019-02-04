package ut4;

/**
 * 1. Sustituir todos los valoreses negativos por un 0.
 * 2. Mostrar cuál es el mayor almacenado(puede estar en varias posiciones)
 */
public class Ejercicio3_1_Busquedas{
    public static void main(String[] args) {
        int datos[] = {23, 2, -43, -5, 0, 12, 23, 32, 43, -45, 76, 6, 65, 76};
        int cont = 0, max = datos[0];
        boolean sw = true;

        for(int i = 0; i < datos.length; i++) {
            if (datos[i] < 0) {
                datos[i] = 0;
                cont++;
                sw = false;
            }
            if (datos[i] > max) {
                max = datos[i];
            }

        }

        System.out.printf("El valor máximo es %d.\n", max);
        for(int i = 0; i < datos.length; i++) {
            if (datos[i] == max) {
                System.out.printf("Valor máximo en la posición %d\n", i);
            }
        }

        if (sw) {
            System.out.println("No se han encontrado valores negativos para sustituir");
        }
        else System.out.printf("Se han sustituido %d valores negativos.\n", cont);
    }
}

