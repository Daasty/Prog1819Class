package ut3.bucles_anidados;

public class Programa12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 11; i++) {
            //Bucle de impresión de la tabla
            for (int j = 1; j <= 11; j++) {
                System.out.print("#=====");
                if (j == 11) {
                    System.out.print("#");
                }
                else if (j == 11) {
                    System.out.print("|");
                }
            }
            System.out.println();

            //Bucle de rellenado de la tabla
            if (i != 11) {
                int e = 1;
                for (int k = 1; k < 12; k++) {
                    //Impresión de la primera celda vacía
                    if (i == 1 && k == 1) {
                        System.out.print("|     ");
                    }
                    //Impresión de la primera línea
                    else if (i == 1) {
                        System.out.printf("|%5d", k - 1 );
                    }
                    else if (i == 2) {
                        System.out.printf("|%5d",k - 1);
                    }

                    else {
                        System.out.printf("|%5d", e = e + k);
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
