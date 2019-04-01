package ut5.POO.particulas.v2;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalEjer02 extends Applet implements ActionListener {

    private static final long serialVersionUID = 1L;
    Sistema sis = null;

    @Override
    public void init() {
        super.init();

        this.setSize(600, 600); // Tamaño de la ventana

        sis = new Sistema(this.getWidth(), this.getHeight());

        Timer t = new Timer(1000 / 60, this);
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        // Dibujamos la pantalla en un buffer
        Image img = this.createImage(this.getWidth(), this.getHeight());
        Graphics dd = img.getGraphics();

        // Mensaje central
        String s = "DAM1 CMA> Ejercicio 2 (500 en todas direcciones)";
        int width = g.getFontMetrics().stringWidth(s);
        dd.drawString(s, this.getWidth() / 2 - width / 2, this.getHeight() / 2);

        // Sistema de partículas
        sis.mostrar(dd);

        // Volcamos el buffer en el applet
        g.drawImage(img, 0, 0, null);
        dd.dispose();
    }

    @Override
    public void update(Graphics g) {
        // Mostramos el sistema
        this.paint(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Cambios en el sistema cada cierto tiempo
        sis.actualizar(this.getWidth(), this.getHeight());
        this.repaint();
    }

}