package ut5.POO.particulas.dam;

import java.awt.*;

public class Punto {

    //ATRIBUTOS//
    private int x = 0, y = 0;

    //CONSTRUCTOR//
    public Punto(int x, int y) {
        mover(x, y);
    }

    //sobrecarga
    //valor por defecto (0,0)
    public Punto() {
    }

    //valores iguales a un punto ya creado
    public Punto(Punto p) {
        this(p.x, p.y);

        /*Es lo mismo que
         *
         * this.x = p.x;
         * this.y = p.y;
         */
    }


    //METODOS DE ACCESO / CONSULTA DE INFORMACION

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    //METODOS GENERALES

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //mover hacia abajo

    public void abajo(int desp) {
        this.y += Math.abs(desp);
    }

    //sobrecarga
    public void abajo() {
        this.abajo(1);
    }



    //mover hacia arriba

    public void arriba(int desp) {
        this.y -= Math.abs(desp);
    }

    //sobrecarga
    public void arriba() {
        this.arriba(1);
    }

    //mover hacia derecha

    public void derecha(int desp) {
        this.x += Math.abs(desp);
    }

    //sobrecarga
    public void derecha() {
        this.derecha(1);
    }

    //mover hacia izquierda

    public void izquierda(int desp) {
        this.x -= Math.abs(desp);
    }

    //sobrecarga

    public void izquierda() {
        this.izquierda(1);
    }


    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
