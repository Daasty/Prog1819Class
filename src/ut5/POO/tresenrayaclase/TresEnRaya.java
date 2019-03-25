package ut5.POO.tresenrayaclase;

import java.util.Scanner;

public class TresEnRaya {

    //atributos de clase
    private int [][] tablero = new int [3][3];
    private int jugador = 1;

    //auxiliares
    private Scanner teclado = new Scanner(System.in);

    //constructor
    public TresEnRaya(){

        this.iniciar();
    }

    //Métodos
    private void iniciar(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] =0;
            }
        }
        this.jugador = 1;
    }

    public void mostrar(){
        System.out.println(" * -  -  - *");
        for (int i = 0; i < tablero.length; i++) {
            System.out.printf(" |");
            for (int j = 0; j < tablero[0].length; j++) {
                char car = ' ';
                switch(tablero[i][j]){
                    case 1: car = 'X'; break;
                    case 2: car = '0'; break;
                }
                System.out.printf(" %c ",car);
            }
            System.out.println("|");
        }
        System.out.println(" * -  -  - *");
    }

    public void jugar(){
        this.iniciar();
        boolean swVictory = false;
        for (int i = 1; i <= 9; i++) {
            if(turnoJugador(i)){
                //jugador gana
                this.mostrar();
                System.out.println();
                System.out.println(">>>Jugador "+this.jugador+"  ¡¡GANASTE!!");
                swVictory = true;
                break;
            }else{
                cambiarTurno();
            }
            this.mostrar();
        }
        if(!swVictory) System.out.println("No quedan posiciones libres... ¡¡ES UN EMPATE!!");

    }

    private void cambiarTurno() {
        if(jugador == 1){
            jugador = 2;
        }else{
            jugador = 1;
        }

    }

    private boolean turnoJugador(int turno) {

        int fila = -1;
        int col = -1;
        boolean swOk = false;
        int ficha = 0;

        do {
            swOk = false;
            do {
                System.out.printf("> Jugador %d ¿fila (1..3)?", this.jugador);
                fila = Integer.parseInt(teclado.nextLine()) - 1;

            } while (!esValida(fila));

            do {
                System.out.printf("> Jugador %d ¿columna (1..3)?", this.jugador);
                col = Integer.parseInt(teclado.nextLine()) - 1;

            } while (!esValida(col));

            if(tablero[fila][col]!=0){
                System.out.println("[ERROR] CASILLA OCUPADA");
                swOk = true;
            }

        }while(swOk);

        if(turno%2==0){
            ficha = 2;
        }else{
            ficha = 1;
        }
        tablero[fila][col] = ficha;

        //si alguien gana
        if(turno >= 5){
            if(horizontal(fila)) return true;
            if(vertical(col)) return true;
            if(diagonalIzq()) return true;
            if(diagonalDer()) return true;
        }

        return false; //seguimos jugando
    }

    private boolean diagonalDer() {
        if(tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && tablero[0][2]!=0) return true;

        return false;
    }

    private boolean diagonalIzq() {
        if(tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] != 0) return true;

        return false;
    }

    private boolean vertical(int col) {
        for (int i = 0; i < tablero.length; i++) {
            if(tablero[i][col] != this.jugador) return false;
        }
        return true;
    }

    private boolean horizontal(int fila) {
        for (int i = 0; i < tablero[fila].length; i++) {
            if(tablero[fila][i] != this.jugador) return  false;
        }
        return true;
    }

    private boolean esValida(int num) {
        if(num < 0 || num >= 3){
            return false;
        }
        return true;
    }
}