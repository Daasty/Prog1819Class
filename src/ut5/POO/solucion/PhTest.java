package ut5.POO.solucion;

public class PhTest {
    public static void main(String[] args) {
        Solucion s = new Solucion();
        System.out.println("s> " + s.getPh());
        s.setPh(10);
        System.out.println("s> " + s.getPh());
        s.setPh(8000);
        //Ahora este cambio lo vamos a ignorar
        System.out.println("s> " + s.getPh());

        System.out.println(s);
    }
}
