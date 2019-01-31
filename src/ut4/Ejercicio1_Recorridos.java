package ut4;

/**
 * 1. Mostrar los elementos del vector en pantalla
 * 2. Mostrar los elementos a la inversa
 * 3. Mostrar los elementos almacenados en posición par incluyendo el 0
 * 4. Mostrar los elementos almacenados en la primera mitad del vector
 */
public class Ejercicio1_Recorridos {
    public static void main(String[] args) {
        int[] array = {34, 32, 35, 54, 13, 12, 21, 56, 2, 6, 87, 88};

        //1
        for (int i = 0;  i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

        System.out.println();

        //2
        for (int i = array.length - 1;  i >= 0; i--) {
            System.out.printf("%d ", array[i]);
        }

        System.out.println();

        //3
        for (int i = 0;  i < array.length; i += 2) {
            System.out.printf("%d ", array[i]);
        }

        System.out.println();

        //4
        for (int i = 0;  i < array.length / 2; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
