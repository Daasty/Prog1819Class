package ut5.POO.particulas.v2;

import ut5.POO.particulas.dam.Punto;

import java.awt.*;
import java.util.Random;

public class Particula {

    //ATRIBUTOS

    private Punto pos = null;
    private Color color = null;
    private int tipo = 0;
    private int tama�o = 0;
    private int direccion = 0;
    private int velocidad = 1;


    //CONSTRUCTOR

    public Particula(int x, int y) {
        Random rnd = new Random();
        pos = new Punto(x, y);
        switch (rnd.nextInt(4)) {
            case 0:
                this.color = Color.RED;
                break;
            case 1:
                this.color = Color.BLUE;
                break;
            case 2:
                this.color = Color.GREEN;
                break;
            case 3:
                this.color = Color.ORANGE;
                break;
        }
        this.tipo = rnd.nextInt(2); //0-> circulo / 1-> cuadrado
        this.tama�o = rnd.nextInt(11) + 6; //6-16
        this.direccion = rnd.nextInt(8); //0..3
        this.velocidad = rnd.nextInt(5) + 1;

    }

    public void mover(int ancho, int alto) {
        switch (this.direccion) {
            case 0:
                this.pos.arriba(velocidad);
                if (pos.getY() <= 0) this.direccion = 3;
                break;
            case 1:
                this.pos.derecha(velocidad);
                if (pos.getX() >= ancho - tama�o) this.direccion = 2;
                break;
            case 2:
                this.pos.izquierda(velocidad);
                if (pos.getX() <= 0) this.direccion = 1;
                break;
            case 3:
                this.pos.abajo(velocidad);
                if (pos.getY() >= alto - tama�o) this.direccion = 0;
                break;
            case 4:
                this.pos.diagonalRightTop(velocidad, velocidad);
                if (pos.getX() >= ancho - tama�o) this.direccion = 5;
                else if (pos.getY() <= 0) this.direccion = 6;
                break;
            case 5:
                this.pos.diagonalLeftTop(velocidad, velocidad);
                if (pos.getX() <= 0) this.direccion = 4;
                else if (pos.getY() <= 0) this.direccion = 7;
                break;
            case 6:
                this.pos.diagonalRightbot(velocidad, velocidad);
                if (pos.getX() >= ancho - tama�o) this.direccion = 7;
                else if (pos.getY() >= alto - tama�o) this.direccion = 4;
                break;
            case 7:
                this.pos.diagonalLeftBot(velocidad, velocidad);
                if (pos.getX() <= 0) this.direccion = 6;
                else if (pos.getY() >= alto - tama�o) this.direccion = 5;
                break;
        }

    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        if (this.tipo == 0) {
            g.fillOval(pos.getX(), pos.getY(), this.tama�o, this.tama�o);
            g.setColor(Color.BLACK);
            g.drawOval(pos.getX(), pos.getY(), this.tama�o, this.tama�o);
        } else {
            g.fillRect(pos.getX(), pos.getY(), this.tama�o, this.tama�o);
            g.setColor(Color.BLACK);
            g.drawRect(pos.getX(), pos.getY(), this.tama�o, this.tama�o);
        }
    }
}