package ut5.repaso.entero;

import org.junit.Test;
import ut5.POO.entero.Entero;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class EnteroTest {

    @Test
    public void testEntero() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero();
        assertEquals(0, e.getNumero());
    }

    @Test
    public void testEnteroInt() {
        int[] pruebas = {-1, 0, 1};
        for (int i = 0; i < pruebas.length; i++) {
            ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(pruebas[i]);
            assertEquals(pruebas[i], e.getNumero());
        }
    }

    @Test
    public void testEnteroEntero() {
        ut5.POO.entero.Entero e1 = new ut5.POO.entero.Entero(123);
        ut5.POO.entero.Entero e2 = new ut5.POO.entero.Entero(e1);

        assertEquals(e1.getNumero(), e2.getNumero());
    }

    @Test
    public void testEsPar() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(-1);
        assertFalse(e.esPar());
        e.setNumero(2);
        assertTrue(e.esPar());
    }

    @Test
    public void testEsImpar() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(2);
        assertFalse(e.esImpar());
        e.setNumero(1);
        assertTrue(e.esImpar());
    }

    @Test
    public void testEsPositivo() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(1);
        assertTrue(e.esPositivo());
        e.setNumero(0);
        assertFalse(e.esPositivo());
        e.setNumero(-1);
        assertFalse(e.esPositivo());
    }

    @Test
    public void testEsNegativo() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(-1);
        assertTrue(e.esNegativo());
        e.setNumero(0);
        assertFalse(e.esNegativo());
        e.setNumero(1);
        assertFalse(e.esNegativo());
    }

    @Test
    public void testEsCero() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(-1);
        assertFalse(e.esCero());
        e.setNumero(0);
        assertTrue(e.esCero());
        e.setNumero(1);
        assertFalse(e.esCero());
    }

    @Test
    public void testUltimaCifra() {
        for (int valor = 0; valor <= 999; valor++) {
            ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(valor);
            assertEquals(valor % 10, e.ultimaCifra());
        }
    }

    @Test
    public void testPrimeraCifra() {
        ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(123);
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
            ut5.POO.entero.Entero e = new ut5.POO.entero.Entero(valor);
            assertEquals(cifra, e.numeroCifras());
            valor *= 10;
        }
    }

    @Test
    public void testToString() {
        ut5.POO.entero.Entero e = new Entero(-123456);
        assertEquals("-123456", e.toString());
        e.setNumero(123);
        assertEquals("123", e.toString());
    }


}