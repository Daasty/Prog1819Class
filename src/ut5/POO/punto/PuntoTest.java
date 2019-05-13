package ut5.POO.punto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PuntoTest {

    private Punto p= null;
    private final int COORX =10;
    private final int COORY = 5;

    @Before
    public void iniciar() {
        p= new Punto(this.COORX,this.COORY);
    }
    @After
    public void fin() {
        System.out.println("Fin de las pruebas\n\n");
    }
    @Test
    public void testPunto() {
        Punto p = new Punto();
        assertEquals(0,p.getX());
        assertEquals(0,p.getY());
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(this.COORX,p.getX());
        assertEquals(this.COORY,p.getY());
    }

    @Test
    public void testArriba() {
        p.arriba();
        assertEquals(this.COORX,p.getX());
        assertEquals(this.COORY-1,p.getY());

    }

    @Test
    public void testDerecha() {
        p.derecha();
        assertEquals(this.COORX+1,p.getX());
        assertEquals(this.COORY,p.getY());
    }

    @Test
    public void testAbajo() {
        p.abajo();
        assertEquals(this.COORX,p.getX());
        assertEquals(this.COORY+1,p.getY());
    }

    @Test
    public void testIzquierda() {
        p.izquierda();
        assertEquals(this.COORX-1,p.getX());
        assertEquals(this.COORY,p.getY());
    }


}