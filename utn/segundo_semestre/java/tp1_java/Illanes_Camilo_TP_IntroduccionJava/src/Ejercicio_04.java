import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingresa el segundo número:");
        int num2 = Integer.parseInt(sc.nextLine());

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División: "+division);

    }
}
