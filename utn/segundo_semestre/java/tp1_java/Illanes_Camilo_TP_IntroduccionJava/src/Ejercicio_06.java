import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(sc.nextLine());

        int division1 = num1 / num2;
        double division2 = (double) num1 / num2;

        System.out.println("División 1 enteros: "+division1);
        System.out.println("División 2 double: "+division2);

    }
}
