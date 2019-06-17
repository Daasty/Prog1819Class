package ut8.repaso.notas;

import java.util.Scanner;

public class BasicoNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;
        do {
            try {
                System.out.println("Dime nota: ");
                double nota = Double.parseDouble(teclado.nextLine());

                if (nota < 0 || nota > 10) {
                    throw new Exception("Entre 0 y 10");
                }

                if (nota < 5) {
                    System.out.println("Suspenso");
                }
                else if (nota < 7) {
                    System.out.println("Aprobado");
                }
                else if (nota < 9) {
                    System.out.println("Notable");
                }
                else System.out.println("Sobresaliente");
                
                sw = false;
            }catch (NumberFormatException e) {
                System.out.println("Introduce un numero.");
            }catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }

        } while (sw);
    }
}
