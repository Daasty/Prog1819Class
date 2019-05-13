package ut5.POO.punto;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PuntoParametrosTestArriba {

    //Atributos:
    private int x,y,expX,expY ;

    //Constructor:
    public PuntoParametrosTestArriba(int x, int y, int expX, int expY) {
        this.x=x;
        this.y=y;
        this.expX=expX;
        this.expY=expY;
    }

    @Parameters
    public static Collection<Object[]> pruebas(){
        return Arrays.asList(new Object[][] {
                {3,2,3,1},
                {2,3,2,2},
                {5,7,5,6}
        });
    }

    @Test
    public void testarriba() {
        Punto p = new Punto(this.x,this.y);
        assertEquals(this.x,p.getX());
        assertEquals(this.y,p.getY());
        p.arriba();
        assertEquals(expX,p.getX());
        assertEquals(expY,p.getY());
    }


}