package ut5.repaso.persona;

public class Persona {
    //Attrib
    private int edad = 0;

    //Constr

    public Persona() {
        this.edad = 18;
    }

    public Persona(int edad) throws Exception{
        this.setEdad(edad);
    }

    public Persona(Persona p) {
        this.edad = p.edad;
    }

    //Get and set

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        }
        else throw new Exception("Edad entre 0 y 120");
    }

    //Metodos publicos

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        }
        else return false;
    }

    public String clasificar() {
        if (this.edad <= 16) {
            return "Edad escolar";
        }
        else if (this.edad <= 66) {
            return "Edad laboral";
        }
        else return "Jubilacion";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Edad=" + edad +
                '}';
    }
}
