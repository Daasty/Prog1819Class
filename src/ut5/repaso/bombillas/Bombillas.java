package ut5.repaso.bombillas;

import java.util.Scanner;

public class Bombillas {

    //Atributos
    Scanner teclado = new Scanner(System.in);
    private int[][] tablero = new int[5][5];
    private boolean game = true;
    private int x = 0, y = 0;

    public Bombillas() {
        this.iniciar();
    }

    public void iniciar() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = 0;
            }
        }
        tablero[1][1] = 1;
        tablero[1][2] = 1;
        tablero[0][1] = 1;
        tablero[1][0] = 1;
        tablero[2][1] = 1;

        mostrar();
        jugar();
    }


    private void jugar() {
        while (game) {

            System.out.println("Introduce la coordenada x: ");
            x = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce la coordenada y: ");
            y = Integer.parseInt(teclado.nextLine());


            try {
                if (x > 4 || x < 0) {
                    throw new Exception("Introduce de nuevo");
                }
                if (y > 4 || y < 0) {
                    throw new Exception("Introduce de nuevo");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error > " + e.getMessage());
            }


            try {
                //La propia seleccionada pasa de 0 a 1 y al revés
                if (tablero[x][y] == 1) {
                    tablero[x][y] = 0;
                } else tablero[x][y] = 1;

                //La derecha, si existe
                if (x != 4) {
                    if (tablero[x + 1][y] == 0) {
                        tablero[x + 1][y] = 1;
                    } else if (tablero[x + 1][y] == 1) {
                        tablero[x + 1][y] = 0;
                    }
                }


                //La inferior, si existe
                if (y != 4) {
                    if (tablero[x][y + 1] == 0) {
                        tablero[x][y + 1] = 1;
                    } else if (tablero[x][y + 1] == 1) {
                        tablero[x][y + 1] = 0;
                    }
                }

                //La Superior, si existe
                if (y != 0) {
                    if (tablero[x][y - 1] == 0) {
                        tablero[x][y - 1] = 1;
                    } else if (tablero[x][y - 1] == 1) {
                        tablero[x][y - 1] = 0;
                    }
                }

                //La izquierda, si existe
                if (x != 0) {
                    if (tablero[x - 1][y] == 0) {
                        tablero[x - 1][y] = 1;
                    } else if (tablero[x - 1][y] == 1) {
                        tablero[x - 1][y] = 0;
                    }
                }


            } catch (NumberFormatException e) {
                System.out.println("No valido");
            } catch (Exception e) {
                System.out.println("Introduce de nuevo");
            }

            mostrar();
            probar();

        }

    }

    private void mostrar() {
        for (int i = 0; i < tablero[0].length; i++) {
            System.out.printf("#---#---#---#---#---#\n");
            for (int j = 0; j < tablero.length; j++) {
                System.out.printf("| %-2d", tablero[j][i]);
                if (j == tablero[0].length - 1) {
                    System.out.printf("|");
                }
            }
            System.out.println();
        }
        System.out.printf("#---#---#---#---#---#\n");
    }

    private void probar() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 1) {
                    game = true;
                    break;
                } else game = false;
            }
        }
    }
}
