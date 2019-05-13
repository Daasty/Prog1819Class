package ut5.POO.reloj;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RelojTest {

    @Test
    public void testReloj() {
        Reloj r = new Reloj(10, 30, 50);
        assertEquals(10, r.getHh());
        assertEquals(30, r.getMm());
        assertEquals(50, r.getSs());
    }

    @Test
    public void testFijarHora() {
        Reloj r = new Reloj(10, 30, 50);
        r.fijarHora(11, 31, 51);
        assertEquals(11, r.getHh());
        assertEquals(31, r.getMm());
        assertEquals(51, r.getSs());
    }

    @Test
    public void testFijarHoraNoValida() {
        Reloj r = new Reloj(1234, 30, 50);
        assertNotEquals(1234, r.getHh());
        assertEquals(11, r.getHh());
        assertEquals(31, r.getMm());
        assertEquals(51, r.getSs());
    }

    @Test
    public void testSetHhNegativo() {
        Reloj r = new Reloj(-1, 0, 0);
        assertEquals(0, r.getHh());
        assertNotEquals(-1, r.getHh());
    }

    @Test
    public void testSetHhPositivo() {
        Reloj r = new Reloj(70, 0, 0);
        assertEquals(0, r.getHh());
        assertNotEquals(70, r.getHh());
    }

    @Test
    public void testSetMmNegativo() {
        Reloj r = new Reloj(0, -1, 0);
        assertEquals(0, r.getMm());
        assertNotEquals(-1, r.getMm());
    }

    @Test
    public void testSetMmPositivo() {
        Reloj r = new Reloj(0, 70, 0);
        assertEquals(0, r.getMm());
        assertNotEquals(70, r.getMm());
    }

    @Test
    public void testSetSsNegativo() {
        Reloj r = new Reloj(0, -1, 0);
        assertEquals(0, r.getSs());
        assertNotEquals(-1, r.getSs());
    }



}
