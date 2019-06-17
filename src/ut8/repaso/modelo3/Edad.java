package ut8.repaso.modelo3;

/**
 * Clase que implemente lo de los anteriores modelos
 */
public class Edad {
    private int edad = 0;

    public Edad(int edad) throws Exception{
        this.setEdad(edad);
    }



    public int getEdad() throws Exception {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >=0 && edad <= 120) {
            this.edad = edad;
        }
        else throw new Exception("Introduce una Edad entre 0 y 120");
    }

    public boolean esMayorEdad() {
        return this.edad >= 18;
    }

    @Override
    public String toString() {
        return "Edad: " + this.edad;
    }
}
