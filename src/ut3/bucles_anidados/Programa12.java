package ut3.bucles_anidados;

public class Programa12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("#=====");
                if (j == 11) {
                    System.out.print("#");
                }
            }
            System.out.println();
            if (i != 11) {
                for (int k = 1; k <= 10; k++) {
                    if (i == 1 && k == 1)
                    System.out.print("|     ");
                    else if (i == 1) {
                        System.out.printf("|    %d", k);
                    }
                    else {
                        System.out.printf("|    %d", i);
                    }
                    if (k == 11) {
                        System.out.print("|");
                    }
                }
            }

            System.out.println();
        }
    }
}
