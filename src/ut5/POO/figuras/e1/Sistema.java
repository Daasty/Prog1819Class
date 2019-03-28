package ut5.POO.figuras.e1;

import ut5.POO.figuras.dam.Punto;

import java.awt.*;
import java.util.ArrayList;

public class Sistema {

    private ArrayList<Linea> lista = new ArrayList<Linea>();

    public Sistema(int ancho, int alto) {
        lista.add(new Linea());

        lista.add(new Linea(new Punto(50, 50), new Punto(500, 50)));

        lista.add(new Linea(33, 333, 70, 70));

        lista.add(new Linea(lista.get(0)));
    }

    public void mostrar(Graphics g) {
        for (Linea l : lista)
            l.escribir(g);
    }


    public void actualizar(int ancho, int alto) {

    }

}