package examenes.ev3.ev3Examen2.p3;

public class Rectangulo extends Figura {

    //Atributos
    private double base = 0;
    private double altura = 0;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodos
    public double area() {
        return this.base * this.altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
