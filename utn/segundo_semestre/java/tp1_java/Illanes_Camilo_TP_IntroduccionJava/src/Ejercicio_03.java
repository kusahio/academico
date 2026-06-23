import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
