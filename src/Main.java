import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            Empleado p = new Empleado(sc.nextLine(),sc.nextInt());
            System.out.println(p);

/*
        p.nombre = "Otro nombre";  // Si intentamos cambiar el campo nombre, nos da un error de compilación
        System.out.println(p);

        se crean los metodos get y set
*/

    }
}