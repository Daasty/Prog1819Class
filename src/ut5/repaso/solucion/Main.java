package ut5.repaso.solucion;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            Solucion s = new Solucion(12);
            Solucion s1 = new Solucion(s);
            Solucion s2 = new Solucion(15);
            Solucion s3 = new Solucion(10);
            Solucion s4 = new Solucion(7);
            Solucion s5 = new Solucion(6);
            Solucion s6 = new Solucion(-1);
            Solucion s7 = new Solucion(0);
            Solucion s8 = new Solucion(10);
            Solucion s9 = new Solucion(s6);

            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            System.out.println(s6);
            System.out.println(s7);
            System.out.println(s8);
            System.out.println(s9);
        } catch (Exception e) {
            System.out.println("Error > " + e.getMessage());
        }

        System.out.println();

        try {
            Solucion s = new Solucion(20);
            System.out.println(s);

        } catch (Exception e) {
            System.out.println("Error > " + e.getMessage());
        }

    }
}
