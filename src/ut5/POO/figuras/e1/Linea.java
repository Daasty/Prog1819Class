package ut5.POO.figuras.e1;
import ut5.POO.figuras.dam.Punto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

public class Linea {
    //Atributos
    private Punto inicio = new Punto(1,1);
    private Punto fin = new Punto(100,100);

    //Constructores
    public Linea(Punto p1, Punto p2) {
        this.inicio = new Punto(p1);
        this.fin = new Punto(p2);
    }

    public Linea (int x1, int y1, int x2, int y2) {
        this(new Punto(x1,y1), new Punto(x2,y2));
    }

    public Linea() {}  //Admite los valores por defecto

    public Linea(Linea linea) {
        this(linea.inicio, linea.fin);
    }

    //Metodos

    public void dibujar(Graphics g, Color color) {
        g.setColor(color);
        g.drawLine(inicio.getX(), inicio.getY(),fin.getX(), fin.getY());
    }

    //sobrecarga
    public void dibujar(Graphics g) {
        this.dibujar(g, Color.BLACK);
    }

    public void escribir(Graphics g) {
        this.dibujar(g);
        this.inicio.escribir(g);
        this.fin.escribir(g);

        this.puntoMedio().escribir(g);

    }

    //M�todo que nos devuelve la longitud de la l�nea

    public double longitud() {
        double distancia = Math.sqrt(Math.pow(fin.getX() - inicio.getX(), 2) + Math.pow(fin.getY() - inicio.getY(), 2));
        return distancia;
    }

    //M�todo que nos devuelve la pendiente de la l�nea

    public double pendient() {
        return ((double)fin.getY() - inicio.getY()) / (fin.getX() - inicio.getX());
    }
    //M�todo que nos devuelve el punto medio

    public Punto puntoMedio() {
        int xn = (inicio.getX() + fin.getY()) / 2;
        int yn = (inicio.getY() + fin.getY()) / 2;
        return new Punto(xn, yn);
    }

    @Override
    public String toString() {
        return inicio + ">----<" + fin;
    }
}
