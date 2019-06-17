package examenes.ev3.ev3Examen1.v2_16_30.p2;

public class Solucion {
    private double valor = 5.5;

    public Solucion() { }

    public Solucion(double valor) {
            setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0 && valor <= 15) {
            this.valor = valor;
        }
    }

    public String tipo() {
        if (this.valor >= 10 && this.valor < 15) {
            return "Muy alcalina";
        }
        else if (this.valor >= 8) {
            return "Alcalina";
        }
        else if (this.valor >= 6) {
            return "Neutra";
        }
        else if (this.valor >= 3) {
            return "Acida";
        }
        else return "Muy acida";
    }

    @Override
    public String toString() {
        return "Solucion{" +
                "valor=" + valor +
                '}' + " Tipo -> " + tipo();
    }
}
