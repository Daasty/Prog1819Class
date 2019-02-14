package pruebas;

import java.util.Scanner;

public class programaRambo {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        //System.out.println("Cuantos dias has trabajado?");

        System.out.println("Cuanto cobras a la hora 'normal'?");
        double horaNormal = Double.parseDouble(leer.nextLine());

        System.out.println("Cuanto cobras a la hora 'extra'?");
        double horaExtra = Double.parseDouble(leer.nextLine());

        System.out.print("Cuantas semanas diferentes has trabajado?");
        int numSemanas = Integer.parseInt(leer.nextLine());
        int total = 0;
        int extras = 0;
        for(int i = 0; i < numSemanas; i++){
            System.out.println("semana "+(i+1));
            System.out.print("Dias trabajados esta semana: ");
            int dias = Integer.parseInt(leer.nextLine());
            for(int j = 0; j < dias; j++){
                System.out.println("Dia "+(j+1));
                System.out.print("Horas trabajadas: ");
                int horas = Integer.parseInt(leer.nextLine());
                if(horas > 4) {
                    extras = horas - 4;
                }
                total += horas;
            }
        }
        total -= extras;

        System.out.println("Total de horas trabajadas: "+total);
        System.out.println("Total de horas extras: "+extras);
        System.out.printf("Por las %d horas curradas mas las %d horas extras deberias cobrar %.2f",total, extras, (total*horaNormal + extras*horaExtra));
    }
}
