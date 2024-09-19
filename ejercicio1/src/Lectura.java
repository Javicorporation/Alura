import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Lectura();

    }

    public static void Lectura() {
        Scanner getting = new Scanner(System.in);
        System.out.println("Introduzca el nombre de tu pelicula favorita: ");
        String nombre = getting.nextLine();
        System.out.println("Escriba la fecha de lanzamiento: ");
        String fecha = getting.nextLine();
        System.out.println("Escriba que nota le da a esta pelicula:");
        double nota = getting.nextDouble();

        System.out.println(nombre);
        System.out.println(fecha);
        System.out.println(nota);
    }
}
