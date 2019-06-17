package examenes.ev3.ev3Examen2.v2_01_15.p2;

public class Rectangulo extends Figura {
    //Atributos
    private double base = 0, altura = 0;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Methods

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + " | Area -> " + area();
    }
}
