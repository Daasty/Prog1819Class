package ut5.POO.entero;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnteroTest {

    @Test
    public void testEntero() {
        Entero e = new Entero();
        assertEquals(0, e.getNumero());
    }

    @Test
    public void testEnteroInt() {
        int[] pruebas = {-1, 0, 1};
        for (int i = 0; i < pruebas.length; i++) {
            Entero e = new Entero(pruebas[i]);
            assertEquals(pruebas[i], e.getNumero());
        }
    }

    @Test
    public void testEnteroEntero() {
        Entero e1 = new Entero(123);
        Entero e2 = new Entero(e1);

        assertEquals(e1.getNumero(), e2.getNumero());
    }

    @Test
    public void testEsPar() {
        Entero e = new Entero(-1);
        assertFalse(e.esPar());
        e.setNumero(2);
        assertTrue(e.esPar());
    }

    @Test
    public void testEsImpar() {
        Entero e = new Entero(2);
        assertFalse(e.esImpar());
        e.setNumero(1);
        assertTrue(e.esImpar());
    }

    @Test
    public void testEsPositivo() {
        Entero e = new Entero(1);
        assertTrue(e.esPositivo());
        e.setNumero(0);
        assertFalse(e.esPositivo());
        e.setNumero(-1);
        assertFalse(e.esPositivo());
    }

    @Test
    public void testEsNegativo() {
        Entero e = new Entero(-1);
        assertTrue(e.esNegativo());
        e.setNumero(0);
        assertFalse(e.esNegativo());
        e.setNumero(1);
        assertFalse(e.esNegativo());
    }

    @Test
    public void testEsCero() {
        Entero e = new Entero(-1);
        assertFalse(e.esCero());
        e.setNumero(0);
        assertTrue(e.esCero());
        e.setNumero(1);
        assertFalse(e.esCero());
    }

    @Test
    public void testUltimaCifra() {
        for (int valor = 0; valor <= 999; valor++) {
            Entero e = new Entero(valor);
            assertEquals(valor % 10, e.ultimaCifra());
        }
    }

    @Test
    public void testPrimeraCifra() {
        Entero e = new Entero(123);
        assertEquals(1, e.primeraCifra());
        e.setNumero(1);
        assertEquals(1, e.primeraCifra());
        e.setNumero(-98765);
        assertEquals(9, e.primeraCifra());

    }

    @Test
    public void testNumeroCifras() {
        int valor = 1;
        for (int cifra = 1; cifra <= 5; cifra++) {
            Entero e = new Entero(valor);
            assertEquals(cifra, e.numeroCifras());
            valor *= 10;
        }
    }

    @Test
    public void testToString() {
        Entero e = new Entero(-123456);
        assertEquals("-123456", e.toString());
        e.setNumero(123);
        assertEquals("123", e.toString());
    }


}