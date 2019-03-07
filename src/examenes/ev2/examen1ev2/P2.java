package examenes.ev2.examen1ev2;

import java.util.Random;

/**
 * CORREGIDO
 *
 * EV2 Examen 1.
 * Rellenar un array de 15 con num random 100-199
 * Ordenar burbuja mejorada test comprobacion.
 * @Daasty
 */
public class P2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        //Creaci�n del array con n�meros aleatorios
        int datos[] = new int[15];

        for (int i = 0; i < datos.length; i++) {
            int randNum = rnd.nextInt(100) + 100; //Desde el 100 al 199
            datos[i] = randNum;
        }

        for (int i = 0; i < datos.length; i++) { //Impresi�n del array de randoms
            System.out.printf("%d, ", datos[i]);
        }

        System.out.println();
        //Ordenaci�n por burbuja de los random

        int maxNum = datos.length;
        int temp = 0;
        boolean sw = true;

        for(int i = 0; i < maxNum; i++){
            System.out.printf("Iteracion %d.\n", i);
            sw = true;
            for(int j = 1; j < (maxNum - i); j++){
                if(datos[j - 1] > datos[j]){
                    //swap elements
                    temp = datos[j-1];
                    datos[j-1] = datos[j];
                    datos[j] = temp;
                    sw = false;
                }
            }

            if (sw) { //Break en caso de que en la primera pasada est� ordenado
                System.out.println("Est� ordenado.");
                break;
            }
        }

        for (int i = 0; i < datos.length; i++) { //Segunda impresi�n, ordenados
            System.out.printf("%d, ", datos[i]);
        }
    }
}