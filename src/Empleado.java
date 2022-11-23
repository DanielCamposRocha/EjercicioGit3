public class Empleado {
    private String nombre; // Ahora el campo nombre es inmutable.
    private int edad;

    Empleado(String name, int edad) {
        this.nombre = name;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El empleado " + nombre + " tiene " + edad + " años";
    }
}
