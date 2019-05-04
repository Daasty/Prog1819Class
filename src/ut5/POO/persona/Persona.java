package ut5.POO.persona;


public class Persona {

    //Atributos
    private int edad = 18;

    //Constructores

    public Persona(int edad) {
        this.setEdad(edad); //Pendiente > Lanzar excepcion
    }
    public Persona() {}

    public Persona (Persona p) {
        this.edad = p.edad; //No vamos a comprobar, esta validado
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //validacion de datos
        if(edad < 0 || edad > 120) {
            return;
        }
        this.edad = edad;
    }

    //Metodos

    public boolean esMayorEdad() {
        return this.edad >= 18;
    }

    public String clasificar() {
        if(this.edad <= 16) {
            return "Edad escolar";
        }
        else if (this.edad <= 66) {
            return "Edad laboral";
        }
        else return "jubilacion";
    }

    @Override
    public String toString() {
        return "Persona [edad = " + edad + "]";
    }
}
