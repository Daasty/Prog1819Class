package examenes.ev2.examen1ev2;

import java.util.Random;

/**
 * EV2 Examen 1.
 * Rellenar un array de 15 con num random 100-199
 * Ordenar burbuja mejorada test comprobacion.
 * @Daasty
 */
public class P2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        //Creación del array con números aleatorios
        int datos[] = new int[14];

        for (int i = 0; i < datos.length; i++) {
            int randNum = rnd.nextInt(101) + 99; //Desde el 100 al 199
            datos[i] = randNum;
        }

        for (int i = 0; i < datos.length; i++) { //Impresión del array de randoms
            System.out.printf("%d, ", datos[i]);
        }

        System.out.println();
        //Ordenación por burbuja de los random

        int maxNum = datos.length;
        int temp = 0;
        boolean sw = true;

        for(int i = 0; i < maxNum; i++){
            System.out.printf("Iteracion %d.", i);
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

            if (sw) { //Break en caso de que en la primera pasada esté ordenado
                System.out.println("Está ordenado.");
                break;
            }
        }

        for (int i = 0; i < datos.length; i++) { //Segunda impresión, ordenados
            System.out.printf("%d, ", datos[i]);
        }
    }
}