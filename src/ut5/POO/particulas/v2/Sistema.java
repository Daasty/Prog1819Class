package ut5.POO.particulas.v2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Sistema {

    private ArrayList<Particula> lista = new ArrayList<Particula>();

    public Sistema(int ancho, int alto) {
        Random rnd = new Random();
        for (int i = 1; i <= 500; i++) {
            int x = rnd.nextInt(ancho - 20);
            int y = rnd.nextInt(alto - 20);
            Particula p = new Particula(x,y);
            lista.add(p);
        }
    }

    public void mostrar(Graphics g) {
        for (Particula p : lista) {
            p.dibujar(g);
        }
    }

    public void actualizar(int ancho, int alto) {
    for (Particula p: lista)
        p.mover(ancho, alto);
    }
}