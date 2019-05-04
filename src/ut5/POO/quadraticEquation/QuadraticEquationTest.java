package ut5.POO.quadraticEquation;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuadraticEquationTest {

    //Creamos una clase y le pasamos unos parametros de prueba y vemos si son iguales que los geters y seters:
    @Test
    public void testQuadraticEquation() {
        QuadraticEquation qe= new QuadraticEquation(3,2,1);
        assertEquals(3, qe.getA());
        assertEquals(2, qe.getB());
        assertEquals(1, qe.getC());
    }

    @Test //Creamos de nuevo, y llamamos al metodo getDiscriminant() para comprobar si realiza la ecuacion correctamente:
    //Con double lleba esta sintaxis: assertEquals (mensaje de cadena, doble esperado, doble real, doble precisi?n)
    public void testGetDiscriminant() {
        QuadraticEquation qe= new QuadraticEquation(3,2,1);
        assertEquals("Discriminant",-8.0, qe.getDiscriminant(),0.1);
        QuadraticEquation qe2= new QuadraticEquation(1,5,2);
        assertEquals("Discriminant",17.0, qe2.getDiscriminant(),0.1);
    }

    @Test //Hacemos la prueba con dos diferentes: ?1 Root1
    public void testGetRoot1() {
        QuadraticEquation qe= new QuadraticEquation(3,2,1);
        assertEquals("Root1",0.0, qe.getRoot1(),0.1);
        QuadraticEquation qe2= new QuadraticEquation(1,5,2);
        assertEquals("Root1",-0.4, qe2.getRoot1(),0.1);
    }

    @Test//Hacemos la prueba con dos diferentes: ?1 Root2
    public void testGetRoot2() {
        QuadraticEquation qe= new QuadraticEquation(3,2,1);
        assertEquals("Root2",0.0, qe.getRoot2(),0.1);
        QuadraticEquation qe2= new QuadraticEquation(1,5,2);
        assertEquals("Root2",-4.5, qe2.getRoot2(),0.1);
    }

}