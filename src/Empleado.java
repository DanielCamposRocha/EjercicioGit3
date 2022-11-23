public class Empleado {
    String nombre; // Ahora el campo nombre es inmutable.
    int edad;

    Empleado(String name, int edad) {
        this.nombre = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "El empleado " + nombre + " tiene " + edad + " años";
    }
}
