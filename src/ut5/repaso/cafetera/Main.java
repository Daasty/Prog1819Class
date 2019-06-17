package ut5.repaso.cafetera;

public class Main {
    public static void main(String[] args) {
        Cafetera c = new Cafetera();
        System.out.println(c);

        c.getNivelActual();
        System.out.println(c);

        c.llenar();
        System.out.println(c);

        c.servirTaza(130);
        System.out.println(c);

        c.servirTaza(400);
        System.out.println(c);

        c.agregarCafe(200);
        System.out.println(c);

        c.vaciar();
        System.out.println(c);

        c.agregarCafe(200);
        System.out.println(c);

        c.servirTaza(300);
        System.out.println(c);

        c.agregarCafe(1200);
        System.out.println(c);
    }
}
