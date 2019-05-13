package ut5.POO.reloj;


public class RelojMain {
    public static void Main(String[] args) {
        Reloj r = new Reloj(23,59,58);

        System.out.println(r);
        r.avanza();
        System.out.println(r);
    }
}
