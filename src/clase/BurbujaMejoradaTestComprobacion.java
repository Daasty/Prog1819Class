package clase;

public class BurbujaMejoradaTestComprobacion {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            // El algoritmo de burbuja recorre un array alterando las posiciónes de sus valores por parejas. Compara cada pareja y, en función de
            // de lo desado, los ordena de menor a mayor o viceversa. Tras comparar el primero con el segundo, compara el segundo con el tercero
            // y así hasta el final. Tras terminar una pasada comienza otra y así hasta que todos los valores del array queden ordenados.

            int[] datos = {23,45,16,81,99,56};


            System.out.println("Array antes del algoritmo de burbuja: ");

            for (int n: datos) {
                System.out.print(n+" ");
            }


            for (int tope = datos.length-1; tope >= 1; tope--) {
                boolean sw = true;							// Interruptor encendido, asumimos que todos los números estan bien ordenados
                for (int i = 1; i <= tope; i++) {
                    if (datos[i-1] > datos[i]) {
                        sw = false;							// Si al comprobar vemos que los números no estan ordenados, se desactiva el interruptor
                        int temp = datos [i];
                        datos[i] = datos[i-1];
                        datos[i-1] = temp;
                    }
                }
                if (sw) {									// Si todos los números estan ordenados, se rompe el bucle para minimizar pasadas
                    break;
                }
            }

            System.out.println();

            System.out.println("Array tras el algoritmo de burbuja: ");

            for (int n: datos) {
                System.out.print(n+" ");
            }

        }

    }
