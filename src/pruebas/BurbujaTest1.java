package pruebas;

public class BurbujaTest1 {
    public static void main(String[] args) {
        int datos[] = {3, 2, 23, 54, 34, 2, 43, 567, 7,6, 5, 34, 4};

        int max = datos.length - 1, aux;

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Pasada %d\n", i + 1);
            boolean sw = true;

            for (int j = 0; j < max; j++) {
                System.out.printf("¿Vector[%2d] = %3d < Vector[%2d] = %3d? ", j, datos[j], j + 1, datos[j + 1]);
                if (datos[j] > datos[j + 1]){
                    aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                    sw = false;
                }
                else System.out.println("Ok!");
            }
            max--;

            if (sw && i != datos.length - 1) {
                System.out.println("Salimos en la pasada " + (i + 1));
                break;
            }
        }

        for(int i = 0; i < datos.length; i++) {
            System.out.printf("%d, ", datos[i]);
        }
    }
}

/*
//Algoritmo de burbuja "mejorado"
        for(int i = 0; i < vector.length; i++) {
            System.out.println("Pasada "+(i+1));

            //en caso de que los numero esten ordenados de serie, usaremos esta para tras realizar la primera "pasada" y verificarlo, salir del bucle y evitar el resto de iteraciones.
            boolean sw = true;

            for (int j = 0; j < max; j++) {
                System.out.printf("¿Vector[%2d]=%3d < Vector[%2d]=%3d? ",j,vector[j],j+1,vector[j+1]);
                //si queremos invertir el orden de ordenado, basta con cambiar el ">" por "<" en el siguiente if.
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                    sw = false;
                    System.out.println(" Están mal colocados, procedemos a intercambiarlos.");
                }else{
                    System.out.println(" OK!");
                }
            }
            max--;

            //para salir del bucle cuando ya esta ordenado el vector antes de que termine de manera natural.
            if(sw && i!=vector.length-1){
                System.out.println("Salimos por el interruptor, en la pasada nº: "+(i+1));
                break;
            }
        }
 */