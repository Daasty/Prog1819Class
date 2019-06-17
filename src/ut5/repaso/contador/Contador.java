package ut5.repaso.contador;

public class Contador {
    //Attrib

    private int cont = 0;
    private int valorInicial = cont;

    //Constructor

    public Contador(){}

    public Contador(int valorInicial) {
        this.cont = valorInicial;
        this.valorInicial = valorInicial;
    }

    public Contador(Contador c) {
        this(c.cont);
    }

    //Get and Set


    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    //Methods

    public void inc() {
        cont++;
    }

    public void inc(int cantidad) {
        cont += Math.abs(cantidad);
    }

    public void dec() {
        cont--;
    }

    public void dec(int cantidad) {
        cont -= Math.abs(cantidad);
    }

    public void reset() {
        this.cont = this.valorInicial;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "cont=" + cont +
                ", valorInicial=" + valorInicial +
                '}';
    }
}
