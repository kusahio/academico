import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        System.out.print("\nIngrese el número de producto que desea modificar (1 al 5): ");
        int opcion = Integer.parseInt(sc.nextLine());

        if (opcion >= 1 && opcion <= precios.length) {

            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = Double.parseDouble(sc.nextLine());

            precios[opcion - 1] = nuevoPrecio;

            System.out.println("\nPrecios modificados:");
            for (double precio : precios) {
                System.out.println("Precio: $" + precio);
            }

        } else {
            System.out.println("Error: El número de producto debe estar entre 1 y 5.");
        }

        sc.close();
    }
}