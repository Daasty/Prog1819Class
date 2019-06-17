package ut5.repaso.solucion;

public class Solucion {
    //Atributos
    private double ph = 0;

    //Constructores

    public Solucion() throws Exception{}

    public Solucion(double ph) throws Exception {
        this.setPh(ph);
    }

    public Solucion(Solucion s) throws Exception{
        this.ph = s.ph;
    }

    //Get and set
    public double getPh() {
        return ph;
    }

    public void setPh(double ph) throws Exception{
        if (ph >= 0 && ph <= 15) {
            this.ph = ph;
        }
        else throw new Exception("Valor no valido");
    }

    //Methods

    public String tipo() {
        if (this.ph >= 10 && this.ph < 15) {
            return "Muy alcalina";
        }
        else if (this.ph >= 8) {
            return "Alcalina";
        }
        else if (this.ph >= 6) {
            return "Neutra";
        }
        else if (this.ph >= 3) {
            return "Acida";
        }
        else return "Muy acida";
    }

    @Override
    public String toString() {
        return "Solucion{" + "ph = " + ph + " | tipo = " + tipo();
    }
}
