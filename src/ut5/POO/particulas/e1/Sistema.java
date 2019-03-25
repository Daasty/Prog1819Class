package ut5.POO.particulas.e1;

import java.awt.Graphics;
import java.util.*;

public class Sistema {

    private Particula p1;

    public Sistema(int ancho, int alto) {
        p1 = new Particula(10, 10);
    }

    public void mostrar(Graphics g) {
        p1.dibujar(g);
    }

    public void actualizar(int ancho, int alto) {
        p1.mover();
    }
}