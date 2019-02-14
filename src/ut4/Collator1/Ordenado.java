package ut4.Collator1;

import java.text.Collator;
//import java.util.Scanner;

public class Ordenado {
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

        //Scanner teclado = new Scanner(System.in);

        Collator comp = Collator.getInstance();
        comp.setStrength(Collator.PRIMARY);

        verDatosSistema("Antes de ordenar", nombres, mods, notas);

        for (int tope = nombres.length-1; tope >= 1; tope--) {
            boolean swOrd = true;
            for (int i = 1; i <= tope; i++) {
                if(comp.compare(nombres[i-1], nombres[i])>0) {
                    String t = nombres[i-1];
                    nombres[i-1]=nombres[i];
                    nombres[i]= t;

                    //nombres ordenados, falta ordenar las notas.

                    int [] temp = notas [i-1];
                    notas[i-1] = notas[i];
                    notas[i] = temp;

                    swOrd=false;
                }
            }
            if(swOrd) break;
        }


        verDatosSistema("Después de ordenar por nombres y notas", nombres, mods, notas);

        for (int tope = mods.length-1; tope >= 1; tope--) {
            boolean swOrd = true;
            for (int i = 1; i <= tope; i++) {
                if(comp.compare(mods[i-1], mods[i])>0) {
                    String t = mods[i-1];
                    mods[i-1]=mods[i];
                    mods[i]= t;

                    //nombres ordenados, falta ordenar las notas.

                    for (int fila = 0; fila < notas.length; fila++) {
                        int t2 = notas[fila][i-1];
                        notas[fila][i-1] = notas[fila][i];
                        notas[fila][i] = t2;
                    }
                }
            }
            if(swOrd) break;
        }


        verDatosSistema("Después de ordenar por modulos", nombres, mods, notas);
    }

    private static void verDatosSistema(String mens, String[] nombres, String[] mods, int[][] notas) {
        float notaMat = 0;
        float notaLeng = 0;
        float notaSoc = 0;

        System.out.println("=============================================================");
        System.out.println(mens);
        System.out.println("=============================================================");

    /*


    System.out.println("Introduce la opcion deseada: \n 1. Todo\n 2. Notas de un determinado modulo.\n 3. Notas de un determinado alumno\n 4. Alumnos suspensos por módulo.");
    System.out.print("opción: ");
    int opcion = Integer.parseInt(teclado.nextLine());
    */
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

        System.out.printf("%4s Nota media %4.2f %4.2f %4.2f\n\n", "", notaMat/(notas.length), notaLeng/notas.length, notaSoc/notas.length);
    }
}
