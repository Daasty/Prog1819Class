package ut5.repaso.contador;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println(c);

        Contador c2 = new Contador(c);
        System.out.println(c2);

        Contador c3 = new Contador(10);
        System.out.println(c3);

        c.inc();
        System.out.println(c);

        c.dec();
        System.out.println(c);

        c.inc(10);
        System.out.println(c);

        c.dec(5);
        System.out.println(c);

        System.out.println();
        System.out.println();

        int[] datos = {10, -3, 0, 5, 8, -19, 21, 10};

        Contador negativos = new Contador();
        for (Contador i = new Contador(); i.getCont() < datos.length; i.inc()) {
            System.out.println(datos[i.getCont()] + " ");
            if (datos[i.getCont()] < 0) {
                negativos.inc();
            }
        }

        System.out.printf("\nNegativos: %d", negativos.getCont());
    }
}
