package excepciones;

import java.util.Scanner;

public class ExcepcionPersonalizada {

    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad (" + edad + ") está fuera del rango biológico aceptable (0 - 120).");
        }
        System.out.println("Edad registrada con éxito: " + edad + " años.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edadInput = scanner.nextInt();

        try {
            verificarEdad(edadInput);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción de Negocio Detectada: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
