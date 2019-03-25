package ut5.POO.particulas.consola;


import ut5.POO.particulas.dam.Punto;

public class PruebaPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(10, 10);
        System.out.println(p1);
        p1.mover(90, 5);
        System.out.println(p1);
    }

}