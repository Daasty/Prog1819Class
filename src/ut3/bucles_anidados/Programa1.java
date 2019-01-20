package ut3.bucles_anidados;

public class Programa1 {
    public static void main(String[] args) {

        for (int i = -1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == -1) {
                    System.out.print(" <TABLA DEL " + j + ">\t");
                }
                else {
                    if (i == 0) {
                        System.out.print(" ------------\t");
                    }
                    else {
                        System.out.printf("%2d x %2d = %3d\t", j, i, j * i);
                    }
                }
            }
            System.out.println();
        }
    }
}
