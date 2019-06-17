package ut8.repaso.ph;

import java.util.Scanner;

public class Phbasico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean sw = true;
        do {
            try {
                System.out.println("Di ph:");
                double ph = Double.parseDouble(teclado.nextLine());
                if (ph < 0 || ph > 15) {
                    throw new Exception("Entre 0 y 15");
                }
                if (ph < 3) {
                    System.out.println("Muy acida");
                }
                else if (ph < 6) {
                    System.out.println("Acida");
                }
                else if (ph < 8) {
                    System.out.println("Neutra");
                }
                else if (ph < 10) {
                    System.out.println("Alcalina");
                }
                else System.out.println("Muy alcalina");
                sw = false;
            }catch (NumberFormatException e) {
                System.out.println("Introduce un numero");
            } catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }

        } while (sw);
    }
}
