import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");

        /**
          CORRECCIÓN Y JUSTIFICACIÓN TEÓRICA:

         1. Error de compilación: El código original usaba `scanner.nextInt()`, un metodo
            diseñado para leer números enteros (int). Intentar asignar ese valor a una
            variable de texto (String) genera un error por incompatibilidad de tipos.

         2. Problema del buffer: Los métodos como `nextInt()` leen el dato numérico pero
            no consumen el salto de línea (\n) generado al presionar "Enter". Ese salto
            de línea queda huérfano en el buffer de entrada, lo que puede causar bugs
            graves si posteriormente se intenta leer un texto.

         3. Se cambió a `scanner.nextLine()`. Este metodo es el adecuado para leer Strings,
            ya que lee toda la línea de texto ingresada y además limpia (consumiendo) el
            carácter de salto de línea del buffer, previniendo comportamientos inesperados.
         */

        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
        scanner.close();
    }
}