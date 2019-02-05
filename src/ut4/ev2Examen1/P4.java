import java.util.Random;

public class P4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Random rnd= new Random();

        int[][] tabla= new int[5][8];

        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[0].length; col++) {
                tabla[fila][col]=rnd.nextInt(101);
            }
        }

        for (int fila = 0; fila < tabla.length; fila++) {
            for (int col = 0; col < tabla[0].length; col++) {
                System.out.printf("%4d",tabla[fila][col]);
            }
            System.out.println();
        }
        System.out.println();


        for (int col = 0; col < tabla[0].length; col++) {
            int min=tabla[0][0];
            int max=tabla[0][0];
            for (int fila = 0; fila < tabla.length; fila++) {
                if(tabla[fila][col]<min) {
                    min=tabla[fila][col];
                }
                else if (max<tabla[fila][col]){
                    max=tabla[fila][col];
                }
            }
            System.out.println("MAYOR numero de la columna "+col+" es el "+max);
            System.out.println("MENOR numero de la columna "+col+" es el "+min);
            System.out.println();
        }

    }

}
