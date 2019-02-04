package ut4;

/**
 * 1. Indicar en pantalla cuántos valores osn pares y cuántos son impares
 * 2. Mostrar la suma total de los positivos y la suma de los negativos
 * 3. Sustituir los valores negativos por un 0 e indicar cuántos se han sustituido
 * 4. Mostrar cuál es el mayor valor almacenado en el array y en qué posiciones se encuentra
 */
public class Ejercicio2_0_Busquedas {
    public static void main(String[] args) {
        int datos[] = {23, 2, -43, -5, 0, 12, 23, 32, 43, -45, 76, 6, 65, 76};

        //Parte 1

        int par = 0, impar = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                par++;
            }
            else impar++;
        }

        System.out.printf("Hay %d números pares y %d impares.\n", par, impar);

        //Parte 2

        int pos = 0, neg = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] >= 0) {
                pos += datos[i];
            }
            else neg += datos[i];
        }

        System.out.printf("La suma es %d pos y %d neg.\n", pos, neg);

        //Parte 3

        int cont = 0;

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 0) {
                datos[i] = 0;
                cont++;
            }
        }

        if(cont > 0) {
            System.out.printf("Se han sustituido %d valores.\n", cont);
        }
        else System.out.println("No se han sustituido valores.");

        //Parte 4

        int max = datos[0];

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == max) {
                System.out.printf("Valor máximo %d, almacenado en la posición %d.\n", max, i);
            }
        }


    }
}
