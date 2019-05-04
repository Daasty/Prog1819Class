package ut5.POO.quadraticEquation;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Pedimos los numeros al usuario y los guardamos en variables:
        Scanner teclado= new Scanner (System.in);
        System.out.print("Dame el valor a: ");
        int a=Integer.parseInt(teclado.nextLine());
        System.out.print("Dame el valor b: ");
        int b=Integer.parseInt(teclado.nextLine());
        System.out.print("Dame el valor c: ");
        int c=Integer.parseInt(teclado.nextLine());

        //Creamos una nueva clase QuadraticEquation y le pasamos los numeros que a decidido el usuario:
        QuadraticEquation qe= new QuadraticEquation(a,b,c);

        //Hacemos las discriminaciones, para que salga los dos getRoots, cero, o "The equatlon has no roots".

        //Positivo:
        if(qe.getDiscriminant() > 0) {
            System.out.println(qe.getRoot1());
            System.out.println(qe.getRoot2());
            //Es Cero:
        }else if(qe.getDiscriminant() == 0) {
            System.out.println(qe.getRoot1());
            //Es negativo:
        }else {
            System.out.println("The equatlon has no roots");
        }





    }

}
