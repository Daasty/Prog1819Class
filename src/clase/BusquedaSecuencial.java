package clase;

/**
 * haz un programa que busque de manera secuencial en un vector el numero 42.
 * Ordenada previamente ese vector con el metodo burbuja.
 *
 * @author cesar
 * @version 1.0
 */



public class BusquedaSecuencial {
    public static void main(String[] args) {
        int [] datos = {3,56,21,42,653,1};
        boolean sw = false;

        burbuja(datos);

        for (int i = 0; i < datos.length; i++){
            if(datos[i] == 42){
                System.out.println("Hemos encontrado el valor 42 en la posicion: "+i);
                sw= true;
            }
        }
        if(!sw){
            System.out.println("No hemos encontrado el numero 42.");
        }
    }

    public static void burbuja(int[] vector){
        int max = vector.length-1;
        int aux = 0;



        //Algoritmo de burbuja "mejorado"
        for(int i = 0; i < vector.length; i++) {
            //en caso de que los numero esten ordenados de serie, usaremos esta para tras realizar la primera "pasada" y verificarlo, salir del bucle y evitar el resto de iteraciones.
            boolean sw = true;

            for (int j = 0; j < max; j++) {
                //si queremos invertir el orden de ordenado, basta con cambiar el ">" por "<" en el siguiente if.
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                    sw = false;
                }
            }
            max--;

            //para salir del bucle cuando ya esta ordenado el vector antes de que termine de manera natural.
            if(sw && i!=vector.length-1){
                break;
            }
        }
    }
}