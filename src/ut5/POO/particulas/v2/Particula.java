package ut5.POO.particulas.v2;

import ut5.POO.particulas.dam.Punto;

import java.awt.*;
import java.util.Random;

public class Particula {

    //ATRIBUTOS

    private Punto pos = null;
    private Color color = null;
    private int tipo = 0;
    private int tamaño = 0;
    private int direccion = 0;


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
        this.tamaño = rnd.nextInt(11) + 6; //6-16
        this.direccion = rnd.nextInt(4); //0..3
        direccion = 1;
    }

    public void mover(int ancho, int alto) {
        switch (this.direccion) {
            case 0: this.pos.arriba();
                if (pos.getY() <= 0) this.direccion = 2; break;
            case 1: this.pos.derecha();
                if (pos.getX() >= ancho - 10) this.direccion = 2; break;
            case 2: this.pos.izquierda();
                if (pos.getX() <= 0) this.direccion = 1; break;
            case 3: this.pos.abajo();
                if (pos.getX() >= alto - 10) this.direccion = 0; break;
        }

    }

    public void dibujar(Graphics g) {
        g.setColor(this.color);
        if (this.tipo == 0) {
            g.fillOval(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
            g.setColor(Color.BLACK);
            g.drawOval(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
        } else {
            g.fillRect(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
            g.setColor(Color.BLACK);
            g.drawRect(pos.getX(), pos.getY(), this.tamaño, this.tamaño);
        }
    }
}