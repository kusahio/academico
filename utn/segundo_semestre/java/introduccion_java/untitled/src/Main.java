import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Lectura de nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        //Lectura edad
        System.out.print("Ingresa edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        //Lectura de sueldo
        System.out.print("Ingresa sueldo: ");
        double sueldo = Double.parseDouble(sc.nextLine());

        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("sueldo: " + sueldo);
        sc.close();
    }
}
