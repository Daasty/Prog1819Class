package ut5.repaso.tresEnRaya;

public class TresEnRaya {

    //Atributos
    private int[][] tablero = new int[3][3];
    private int jugador = 1;

    public TresEnRaya() {

    }

    private void iniciar() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = 0;
            }
        }
        this.jugador = 1;
    }

    public void mostrar() {
        for (int i = 0; i < tablero.length; i++) {
            System.out.printf("#---#---#---#");
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 0) {
                    System.out.printf("| %2s", " ");
                } else if (tablero[i][j] == 0) {
                    System.out.printf("| %2s", "X");
                } else
                    System.out.printf("| %2s", "O");
            }

            System.out.printf("|\n");
        }
    }

    public void jugar() {
        boolean sw = false;
        this.iniciar();

    }
}

