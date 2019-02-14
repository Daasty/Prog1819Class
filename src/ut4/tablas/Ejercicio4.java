package ut4.tablas;

/**
 * Programa que compruebe si la tabla tiene o no filas que estén repetidas
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int datos[][] = {{4, 5, 2, 10, 4, 4},
                    {6, 8, 3, 9, 7, 7},
                    {40, 21, 4, 10, 10}
        };

        boolean sw = true;
        int cont = 0;
        int hola = 0;

        for (int i = 0; i < datos.length; i++) {
            cont = 0;
            for (int j = 0;  j < datos[i].length - 1; j++) {
                if (datos[i][j] == datos[i][j + 1]){
                    sw = false;
                    cont++;
                }
                if (cont == i) {
                    System.out.printf("Las columnas %d y %d son iguales.\n", j, j + 1);
                }
            }
        }

        if (sw) {
            System.out.println("No encontrado.");
        }
    }
}
