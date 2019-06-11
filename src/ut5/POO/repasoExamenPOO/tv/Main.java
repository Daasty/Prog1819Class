package ut5.POO.repasoExamenPOO.tv;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv(1, 2, true);
        Tv tv2 = new Tv();
        Tv tv3 = new Tv(true);

        System.out.println(tv);

        /*System.out.println(tv2);
        System.out.println(tv3);*/

        System.out.println("Subir canal");
        tv.subirCanal();
        System.out.println(tv);

        System.out.println("Subir canal");
        tv.subirCanal();
        System.out.println(tv);

        System.out.println("Seleccionar volumen a 10");
        tv.seleccionVolumen(10);
        System.out.println(tv);

        System.out.println("Seleccionar volumen al 30");
        tv.seleccionVolumen(30);
        System.out.println(tv);

        System.out.println("Bajar volumen");
        tv.bajarVolumen();
        System.out.println(tv);

        System.out.println("Apagar");
        tv.apagar();
        System.out.println(tv);

        System.out.println("Seleccionar canal");
        tv.seleccionCanal(50);
        System.out.println(tv);

        System.out.println("Seleccionar volumen");
        tv.seleccionVolumen(15);
        System.out.println(tv);

        System.out.println("Encender");
        tv.encender();
        System.out.println(tv);

        System.out.println("Seleccionar canal");
        tv.seleccionCanal(50);
        System.out.println(tv);

        System.out.println("Seleccionar volumen");
        tv.seleccionVolumen(15);
        System.out.println(tv);


    }
}
