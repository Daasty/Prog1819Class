package ut4;

import java.util.Scanner;

/**
 * 1. Ordenar edades grupo de alumnos, cargar los datos con valores de teclado y mostrarlos
 * 2. Edad máxima, mínima y media del grupo de alumnos
 * 3. Mostrar el número de alumnos menores de 25 años y el total de alumnos con 25 o más
 * 4. Mostrar las posiciones del array de todos los que tengan 18 años, si no hay, hay que decirlo.
 */
public class EdadesGrupoAlumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Punto uno
        int[] alumnos = {18, 20, 22, 21, 23, 25, 26, 24, 22, 19, 17, 26, 32}; //Cargamos el array con datos

        for (int i = 0; i < alumnos.length; i++) { //Pedimos las edades por teclado
            System.out.println("Dime edades de alumnos: ");
            int edad = Integer.parseInt(teclado.nextLine());
            alumnos[i] = edad;
        }

        for (int i = 0; i < alumnos.length; i++) { //Mostramos las edades
            System.out.printf("Edades[%d] = %d\n", i, alumnos[i]);
        }

        //Punto dos
        int max = alumnos[0], min = alumnos[0], media = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] > max) {
                max = alumnos[i];
            }
            else if (alumnos[i] < min) {
                min = alumnos[i];
            }

            media += alumnos[i];
        }

        System.out.printf("El máximo es %d, el mínimo %d y la media es %d.\n", max, min, media / alumnos.length);

        //Punto tres
        int contmay = 0, contmen = 0;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] < 25) {
                contmen++;
            }
            else contmay++;
        }

        System.out.printf("Hay %d alumnos mayores de 25 años y %d alumnos menores.\n", contmay, contmen);

        //Paso cuatro
        boolean sw = true;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == 18) {
                System.out.printf("Alumno de 18 años encontrado en la posición %d\n", i);
                sw = false;
            }
        }
        if (sw) {
            System.out.println("No se han encontrado alumnos con 18 años");
        }
    }
}