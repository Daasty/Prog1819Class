package ut5.repaso.entero;

public class Main {
    public static void main(String[] args) {
        Entero en = new Entero();
        Entero en2 = new Entero(1000);

        en.esNegativo();
        System.out.println(en);

        en.esCero();
        System.out.println(en);

        en.esImpar();
        System.out.println(en);

        en.esPar();
        System.out.println(en);

        en.esPositivo();
        System.out.println(en);

        en.numeroCifras();
        System.out.println(en);

        en.primeraCifra();
        System.out.println(en);

        en.ultimaCifra();
        System.out.println(en);

        System.out.println();

        en2.esNegativo();
        System.out.println(en2);

        en2.esCero();
        System.out.println(en2);

        en2.esImpar();
        System.out.println(en2);

        en2.esPar();
        System.out.println(en2);

        en2.esPositivo();
        System.out.println(en2);

        en2.numeroCifras();
        System.out.println(en2);

        en2.primeraCifra();
        System.out.println(en2);

        en2.ultimaCifra();
        System.out.println(en2);

    }
}
