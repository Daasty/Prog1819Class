package examenes.ev3.ev3Examen2.v2_01_15.p3;

public class Main {
    public static void main(String[] args) throws Exception{
        Nota n = new Nota(90);
        System.out.println(n);

        n.setPorcentaje(95);
        System.out.println(n);

        n.setPorcentaje(85);
        System.out.println(n);

        n.setPorcentaje(75);
        System.out.println(n);

        n.setPorcentaje(65);
        System.out.println(n);

        n.setPorcentaje(05);
        System.out.println(n);

        n.setPorcentaje(-95);
        System.out.println(n);

    }
}
