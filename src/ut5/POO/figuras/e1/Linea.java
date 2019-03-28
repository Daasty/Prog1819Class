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
    }


}
