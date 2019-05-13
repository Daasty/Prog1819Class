package ut5.POO.reloj;

public class Reloj {

    //Atributos
    private int hh = 0, mm = 0, ss = 0;

    public Reloj(int hh, int mm, int ss) {
        this.fijarHora(hh, mm, ss);
    }

    public void fijarHora(int hh, int mm, int ss) {
        this.setHh(hh);
        this.setMm(mm);
        this.setSs(ss);
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        if (hh >= 0 || hh < 24) {
            this.hh = hh;
        } else return; //Excepcion
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        if (mm < 0 || mm > 59) {
            this.mm = mm;
        }
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        if (ss < 0 || ss > 59) {
            this.ss = ss;
        }
    }

    public void avanza() {
        this.ss++;
        if (this.ss >= 60) {
            this.ss = 0;
            mm++;
            if (this.mm >= 60) {
                this.mm = 0;
                this.hh++;
                if (this.hh >= 60) {
                    this.hh = 0;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Reloj [hh=" + hh + ", mm=" + mm + ", ss=" + ss + "]";
    }
}
