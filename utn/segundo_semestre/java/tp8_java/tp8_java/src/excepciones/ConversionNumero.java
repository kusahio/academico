package excepciones;

import java.util.Scanner;

public class ConversionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto para convertirlo a número entero: ");
        String entrada = scanner.nextLine();

        try {
            int numeroConvertido = Integer.parseInt(entrada);
            System.out.println("🎉 ¡Conversión exitosa! El número es: " + numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto '" + entrada + "' no tiene un formato numérico entero válido.");
        } finally {
            scanner.close();
        }
    }
}