package excepciones;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            int num = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int div = scanner.nextInt();

            int resultado = num / div;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No es posible realizar una división por cero.");
        } finally {
            scanner.close();
        }
    }
}