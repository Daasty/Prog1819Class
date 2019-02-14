package ut4.tablas;

/**
 * Crea una tabla de 4 filas y 4 columnas con datos desde código.
 * 1. Mostrar mayor y menor valor almacenado en la tabla
 * 2. Mostrar mayor y menor almacenado por filas
 * 3. Mayor y menor almacenado por columnas
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        int datos[][] = {
                {2, 34, 32, 14},
                {45, 56, 21, 19},
                {56, 43, 17, 71},
                {43, 29, 76, 45}
        };

        //Primer ejercicio
        System.out.println("Primer ejercicio: ");
        int max = datos[0][0], min = datos[0][0];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                if (datos[i][j] > max) {
                    max = datos[i][j];
                }
                else if (datos[i][j] < min) {
                    min = datos[i][j];
                }
            }
        }

        System.out.printf("El max es %d y el min es %d.\n", max, min);

        //Ejercicio 2 Mostrar por filas

        System.out.println("Segundo ejercicio: ");

        for (int i = 0; i < datos.length; i++) {
            int max2 = datos[i][0], min2 = datos[i][0];
            for (int j = 0; j < datos.length; j++) {
                if (datos[i][j] > max2) {
                    max2 = datos[i][j];
                }
                else if (datos[i][j] < min2) {
                    min2 = datos[i][j];
                }
            }
            System.out.printf("El máximo de la fila %d es %d, el minimo %d\n", i, max2, min2);
        }

        System.out.println();

        //Ejercicio 3 Mostrar por columnas

        System.out.println("Tercer ejercicio: ");

        for (int i = 0; i < datos.length; i++) {
            int max2 = datos[0][i], min2 = datos[0][i];
            for (int j = 0; j < datos.length; j++) {
                if (datos[j][i] > max2) {
                    max2 = datos[j][i];
                }
                else if (datos[j][i] < min2) {
                    min2 = datos[j][i];
                }
            }
            System.out.printf("El máximo de la fila %d es %d, el minimo %d\n", i, max2, min2);
        }

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.printf("%d, ", datos[i][j]);
            }
            System.out.println();
        }
    }
}
