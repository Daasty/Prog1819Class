package examenes.ev3.p2;

/*
 * Main Nota
 *
 * @author daast
 */
public class Main {

    public static void main(String[] args) {
        Nota n = new Nota();
        Nota s = new Nota(110);
        Nota a = new Nota(100);
        Nota b = new Nota(80);
        Nota c = new Nota(70);
        Nota f = new Nota(20);
        Nota g = new Nota(-10);
        System.out.println(n);
        System.out.println(s);


        System.out.println("Mostrar nota:");

        System.out.println("Es 0");
        System.out.println(n.calificacion());

        System.out.println("Es 110");
        System.out.println(s.calificacion());

        System.out.println("Es 100");
        System.out.println(a.calificacion());

        System.out.println("Es 80");
        System.out.println(b.calificacion());

        System.out.println("Es 70");
        System.out.println(c.calificacion());

        System.out.println("Es 20");
        System.out.println(f.calificacion());

        System.out.println("Es -10");
        System.out.println(g.calificacion());

    }

}