package clase;

/**
 * Programa basico que utiliza el algortimo de ordenacion por burbuja con un vector de datos enteros conocidos.
 * Idear una solucion para que el bucle haga el menor numero de iteraciones posibles.
 * Pon algun mensaje que indique que se está haciendo en cada momento.
 *
 * @author Cesar
 * @version 3.0
 */

public class BusquedaBinaria {
    public static void main(String[] args) {

        int [] vector = {10,24,91,32,67,4,58,1};
        //int [] vector = {1,2,4,3};

        /*cada iteracion del primer bucle deja en ultimo lugar del vector el mayor numero
        con esta variable hacemos que se salte comprobar el ultimo numero del bucle, (y en cada iteracion un numero menos a comprobar)
        debido a que estaran ordenados y es innecesario volver a comprobarlos.*/
        int max = vector.length-1;
        int aux = 0;



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

        //Imprimimos el resultado
        System.out.print("[ ");
        for(int i = 0; i < vector.length; i++){
            if(i<vector.length-1){
                System.out.print(vector[i]+", ");
            }else{
                System.out.print(vector[i]);
            }
        }
        System.out.print(" ]");
    }
}