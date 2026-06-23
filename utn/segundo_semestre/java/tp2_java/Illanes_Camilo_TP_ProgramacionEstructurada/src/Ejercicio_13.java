import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        System.out.print("\nIngrese el número de producto que desea modificar (1 al 5): ");
        int opcion = Integer.parseInt(sc.nextLine());

        if (opcion >= 1 && opcion <= 5) {
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = Double.parseDouble(sc.nextLine());

            precios[opcion - 1] = nuevoPrecio;

            System.out.println("\nPrecios modificados:");
            mostrarPreciosRecursivo(precios, 0);

        } else {
            System.out.println("Error: El número de producto debe estar entre 1 y 5.");
        }
    }

    public static void mostrarPreciosRecursivo(double[] arr, int indice) {
        if (indice == arr.length) {
            return;
        }

        System.out.println("Precio: $" + arr[indice]);

        mostrarPreciosRecursivo(arr, indice + 1);
    }
}