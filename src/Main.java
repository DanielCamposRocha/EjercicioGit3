import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre=sc.nextLine();
            Empleado p = new Empleado(nombre, 30);
            System.out.println(p);

/*
        p.nombre = "Otro nombre";  // Si intentamos cambiar el campo nombre, nos da un error de compilación
        System.out.println(p);

        se elimina el private de nombre para dar acceso y se genera la posibilidad de cambiarlo
*/


    }
}