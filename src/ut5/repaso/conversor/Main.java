package ut5.repaso.conversor;

public class Main {
    public static void main(String[] args) {
        Conversor c = new Conversor(1000);
        System.out.println(c);
        c.toBin();
        System.out.println(c.toBin());
        c.toOct();
        System.out.println(c.toOct());
        c.toHex();
        System.out.println(c.toHex());
    }
}
