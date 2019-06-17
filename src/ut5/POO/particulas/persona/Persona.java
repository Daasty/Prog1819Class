package ut5.POO.particulas.persona;

public class Persona {
    //Atributos
    private int edad = 18;

    public Persona(int edad) { //Pendiente > Lanzar excepci�n
        this.edad = edad;
    }

    public Persona() {}

    public Persona(Persona p) {
        this.edad = p.edad; //No vamos a comprobar (Ya est� validado)
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //Validaci�n de los datos
        if (edad < 0 || edad > 120) {
            return; //Pendiente > Lanzar excepci�n
        }
        this.edad = edad;
    }

    //Metodos

    public boolean esMayorEdad() {
        return this.edad >= 18;
    }

    public String Clasificar() {
        if (this.edad <= 16) {
            return "Edad escolar";
        }
        else if (this.edad >= 18) {
            return "Mayor de Edad";
        }
        else if (this.edad >=65) {
            return "Anciano";
        }
        return null;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Edad=" + edad +
                '}';
    }
}
