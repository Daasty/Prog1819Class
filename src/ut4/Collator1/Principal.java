package ut4.Collator1;


import java.text.Collator;
import java.util.Scanner;

/**
 * Hacer un programa que tenga 3 vectores/arrays, con los nombres de los modulos, nombres de los alumnos, y notas de cada alumno en cada modulo
 *
 * hacer las operaciones que se piden en el resto de comentarios.
 *
 * @author cesar
 * @version 1.0
 *
 */
public class Principal {

    public static void main(String[] args) {
        String [] nombres = {"Ana", "Daniel", "Guillermo", "Ana", "Sara", "Sonia"};
        String [] mods = {"mat", "leng", "soc"};
        int [][] notas = {
                {6,8,9},
                {4,5,7},
                {6,6,8},
                {9,9,7},
                {4,3,4},
                {5,4,4}};

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        float notaMat = 0;
        float notaLeng = 0;
        float notaSoc = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la opcion deseada: \n 1. Todo\n 2. Notas de un determinado modulo.\n 3. Notas de un determinado alumno\n " +
                "4. Alumnos suspensos por módulo.");
        System.out.print("Opción: ");
        int opcion = Integer.parseInt(teclado.nextLine());

        switch(opcion) {
            case 1:
                //1. Mostrar la tabla completa de notas

                //encabezado
                System.out.printf("%15s",""); //hueco de la primera fila donde no hay nombre de alumno
                for (int i = 0; i < mods.length; i++) {
                    System.out.printf("%5s",mods[i]);
                }
                System.out.println();

                //cuerpo
                for (int i = 0; i < notas.length; i++) {
                    int aprobados = 0;
                    int suspensos = 0;
                    for(int j = 0; j < notas[0].length; j++) {
                        if(notas[i][j]<5) {
                            suspensos++;
                        }else {
                            aprobados++;
                        }
                        if(j==0) {
                            System.out.printf("%2d %12s %4d",i+1, nombres[i],notas[i][j]);
                            notaMat+=notas[i][j];
                        }else {

                            if(j==1) {
                                notaLeng += notas[i][j];
                                System.out.printf(" %4d",notas[i][j]);
                            }else {
                                if(j==2) {
                                    notaSoc += notas[i][j];
                                    System.out.printf(" %4d   Aprobados: %2d  Suspensos: %2d",notas[i][j], aprobados, suspensos); //3. Total de aprobados y suspensos por alumno
                                }
                            }

                        }
                    }
                    System.out.println();
                }

                //2. Calcula la nota media de cada modulo

                System.out.println();

                System.out.printf("%4s Nota media %4.2f %4.2f %4.2f", "", notaMat/(notas.length), notaLeng/notas.length, notaSoc/notas.length);
                break;
            case 2: //4. Notas de un determinado modulo


                System.out.print("Módulo: ");
                String buscar = teclado.nextLine().trim();
                int swPos = -1;
                for (int i = 0; i < mods.length; i++) {
                    int res = comp.compare(mods[i], buscar);
                    if(res == 0) {
                        swPos = i;
                        break;
                    }
                }
                if(swPos<0) {
                    System.out.println("Módulo no encontrado.");
                }else {
                    for (int i = 0; i < notas.length; i++) {
                        System.out.printf("%-12s : %2d\n", nombres[i], notas[i][swPos]);
                    }
                }

                break;
            case 3://6. Mostrar datos de un determinado alumno
                System.out.print("Alumno: ");
                String buscarAlumno = teclado.nextLine().trim();
                int swPosFila = -1;

                System.out.printf("%12s ",""); //hueco de la primera fila donde no hay nombre de alumno
                for (int k = 0; k < mods.length; k++) {
                    System.out.printf("%5s",mods[k]);
                }
                System.out.println();

                for (int i = 0; i < nombres.length; i++) {
                    int res = comp.compare(nombres[i], buscarAlumno);
                    if(res == 0) {
                        swPosFila = i;
                        for (int j = 0; j < notas[0].length; j++) {
                            if(j==0) {

                                System.out.printf("%-12s : %-4d ", nombres[swPosFila], notas[swPosFila][j]);
                            }else {
                                System.out.printf("%-4d ", notas[swPosFila][j]);
                            }
                        }
                        System.out.println();
                    }
                }
                if(swPosFila<0) {
                    System.out.println("Alumno no encontrado.");
                }
                break;
            case 4: //mostrar alumnos suspensos por modulo.
                for (int i = 0; i < notas[0].length; i++) {
                    for (int j = 0; j < notas.length; j++) {

                    }
                }
                break;
            default:
                System.out.println("introduce una opción válida la proxima vez ;)");

        }
    }
}