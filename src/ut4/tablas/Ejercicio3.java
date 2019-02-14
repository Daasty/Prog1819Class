package ut4.tablas;

/**
 * Mostrar todos los valores cuya suma de posiciones es igual al valor almacenado en dicha posición.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int datos[][] = {{4, 5, 2, 10, 4},
                        {6, 8, 3, 9, 7},
                        {40, 21, 4, 10}
                    };

        boolean sw = false;

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if (i + j == datos[i][j]) {
                    System.out.printf("La suma de %d y %d coincide con el valor %d\n", i, j, datos[i][j]);
                    sw = true;
                }
            }
        }
        if (!sw) {
            System.out.println("No encontrado");
        }
    }
}
