package ut3.bucles_anidados;

import java.util.Scanner;

/**
 * Programa que muestre diferentes dibujos de salida
 */

public class Programa10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 4");
        int num = Integer.parseInt(teclado.nextLine());

        if (num == 1) {
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 7; j++) {
                    if (i == 0 || i == 7){
                        System.out.print("* ");
                    }
                    else if (i == j) {
                        for (int k = 0; k <= i; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }


        else if (num == 2) {
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 7; j++) {
                    if (i == 0 || i == 7){
                        System.out.print("* ");
                    }
                    else {
                        if (i + j == 7) {
                            System.out.print("*");
                        }
                        else System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }


        else if (num == 3) {
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 7; j++) {

                    if (i == 0 || i == 7){
                        System.out.print("*");
                    }

                    else {
                        if(i == j || i + j == 7) {
                            System.out.print("*");
                        }

                        else System.out.print(" ");
                    }

                }
                System.out.println();

            }
        }

        else if (num == 4) {
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 7; j++) {

                    if (i == 0 || i == 7 || j == 0 || j == 7){
                        System.out.print("*");
                    }

                    else {
                        if(i == j || i + j == 7) {
                            System.out.print("*");
                        }

                        else System.out.print(" ");
                    }

                }
                System.out.println();

            }
        }



        else if (num == 5) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i == 0 || i == 8-1) {
                        System.out.print("*");
                    } else {
                        if(i+j==8-1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}