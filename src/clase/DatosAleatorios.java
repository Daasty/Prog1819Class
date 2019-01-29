package clase;

import java.util.Random;
import java.util.Scanner;

public class DatosAleatorios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] datos = new int[200];

        //Llenado con valores aleatorios
        Random rnd = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = rnd.nextInt(101); // 0...100
        }

        //Mostrar el vector
        System.out.println("Array: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("[%3d] = %4d |", i, datos[i]);
            if ((i+1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
