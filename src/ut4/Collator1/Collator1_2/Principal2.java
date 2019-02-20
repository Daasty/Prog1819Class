package ut4.Collator1.Collator1_2;

import java.text.Collator;
import java.util.Scanner;

/**
 * Hacer un programa que tenga 3 vectores/arrays, con los nombres de los modulos, nombres de los alumnos, y notas de cada alumno en cada modulo
 *
 * hacer las operaciones que se piden en el resto de comentarios.
 *
 * @author cesar
 * @version 1.1
 *
 */
public class Principal2 {

    public static void main(String[] args) {
        String [] nombres = {"Ana", "Daniel", "Guillermo", "Ana", "Sara", "Sonia"};
        String [] mods = {"mat", "leng", "soc"};
        int [][] notas = {
                {6,8,9},
                {4,5,7},
                {6,6,8},
                {9,9,2},
                {4,3,9},
                {5,4,4}};

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

    /*
    float notaMat = 0;
    float notaLeng = 0;
    float notaSoc = 0;
    */

        float [] notasMods = {0,0,0};

    /*
    int numSuspensosMat = 0;
    int numSuspensosLeng = 0;
    int numSuspensosSoc = 0;
    */

        int opcion = -1;
        Scanner teclado = new Scanner(System.in);

        while(opcion!=0) {


            System.out.println("\n\nIntroduce la opcion deseada: \n 1. Todo\n 2. Notas de un determinado modulo.\n 3. Notas de un determinado alumno\n"
                    + " 4. Alumnos suspensos por módulo.\n 5. Nota máxima de cada módulo.\n 6. Alumnos que tienen todo aprobado.\n\n 0. Salir");
            System.out.print("\nOpción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            System.out.println();
            switch(opcion) {
                case 1:
                    mostrarTodo(nombres, mods, notas, notasMods);
                    break;
                case 2: //4. Notas de un determinado modulo
                    
                    notaModulo(nombres, mods, notas, comp, teclado);
                    break;
                case 3: //6. Mostrar datos de un determinado alumno
                    notaAlumno(nombres, mods, notas, comp, teclado);
                    break;
                case 4: //7. Mostrar alumnos suspensos por modulo.
                    suspensosModulo(mods, notas);
                    break;
                case 5: //quienes sacaron la mejor nota por modulo.
                    notaMaxima(nombres, mods, notas);
                    break;
                case 6: //listado de todos los alumnos que tienen todo aprobado
                    todoAprobado(nombres, mods, notas);
                    break;
                case 0:
                    System.out.println("Hasta luego Lucas! :)");
                    break;
                default:
                    System.out.println("introduce una opción válida la proxima vez ;)");

            }
        }
    }

    private static void todoAprobado(String[] nombres, String[] mods, int[][] notas) {
        System.out.println("Lista de todos los alumnos con todo aprobado:");
        for(int i = 0; i < notas.length; i++) {
            boolean swAprobado = true;
            for(int j = 0; j < mods.length; j++) {
                if(notas[i][j]<5) {
                    swAprobado = false;
                    break;
                }
            }
            if(swAprobado)   System.out.println(nombres[i]);
        }
    }

    private static void notaMaxima(String[] nombres, String[] mods, int[][] notas) {
        for(int i = 0; i < mods.length; i++) {
            int max = -1;
            System.out.println(mods[i]);
            for(int j = 0; j < notas.length; j++) {
                if(max<notas[j][i])  max = notas[j][i];
            }
            for(int j = 0; j < notas.length; j++) {
                if(notas[j][i]==max) System.out.printf(" %12s : %2d\n",nombres[j],notas[j][i]);
            }
        }
    }

    private static void suspensosModulo(String[] mods, int[][] notas) {
        for (int i = 0; i < notas[0].length; i++) {//columnas
            int numSuspensos = 0;
            for (int j = 0; j < notas.length; j++) {//filas
        /*switch(i) {
          case 0:
            if(notas[j][i]<5) numSuspensosMat++;
            break;
          case 1:
            if(notas[j][i]<5) numSuspensosLeng++;
            break;
          case 2:
            if(notas[j][i]<5) numSuspensosSoc++;
            break;
        }*/
                if(notas[j][i]<5) numSuspensos++;
            }
            System.out.printf("En el módulo de %-5s hay un total de %2d suspensos.\n",mods[i],numSuspensos);
        }
    /*System.out.printf("Numero de suspensos en %-5s: %2d\nNumero de suspensos en %-5s: %2d\nNumero de suspensos en %-5s: %2d",mods[0],numSuspensosMat,
        mods[1],numSuspensosLeng,mods[2],numSuspensosSoc);
    */
    }

    private static void notaAlumno(String[] nombres, String[] mods, int[][] notas, Collator comp, Scanner teclado) {
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
    }

    private static void notaModulo(String[] nombres, String[] mods, int[][] notas, Collator comp, Scanner teclado) {
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
    }

    private static void mostrarTodo(String[] nombres, String[] mods, int[][] notas, float[] notasMods) {
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
                    notasMods[j] += notas[i][j];
                }else {

                    if(j==1) {
                        notasMods[j] += notas[i][j];
                        System.out.printf(" %4d",notas[i][j]);
                    }else {
                        if(j==2) {
                            notasMods[j] += notas[i][j];
                            System.out.printf(" %4d   Aprobados: %2d  Suspensos: %2d",notas[i][j], aprobados, suspensos); //3. Total de aprobados y suspensos por alumno
                        }
                    }

                }
            }
            System.out.println();
        }

        //2. Calcula la nota media de cada modulo

        System.out.println();

        System.out.printf("%4s Nota media %4.2f %4.2f %4.2f", "", notasMods[0]/(notas.length), notasMods[1]/notas.length, notasMods[2]/notas.length);
    }
}