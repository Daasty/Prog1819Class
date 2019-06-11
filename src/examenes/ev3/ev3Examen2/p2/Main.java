package examenes.ev3.ev3Examen2.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;

        while (sw) {

            try {

                System.out.print("Introduce una nota con un valor entre 0 y 100: ");
                double porcentaje = Double.parseDouble(teclado.nextLine());

                Nota n = new Nota(porcentaje);

                System.out.println(n);
                System.out.println("Clasificación > " + n.calificacion());

                // Interruptor
                sw = false;

            } catch (NumberFormatException e) {

                System.out.println("Error > no se ha introducido un valor númerico real");
            } catch (Exception e) {

                System.out.println("Error > " + e.getMessage());
            }
        }
    }
}
