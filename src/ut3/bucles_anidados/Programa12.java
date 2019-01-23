package ut3.bucles_anidados;

public class Programa12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("#=====");
                if (j == 10) {
                    System.out.print("#");
                }
                else if (j == 10) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != 11) {
                for (int k = 1; k <= 10; k++) {
                    if (i == 1 && k == 1) {
                        System.out.print("|     ");
                    }

                    else if (i == 1) {
                        System.out.printf("|%5d", k);
                    }

                    else {
                        System.out.printf("|%5d", i);
                    }

                    if (k == 10) {
                        System.out.print("|");
                    }
                }
            }

            System.out.println();
        }
    }
}
