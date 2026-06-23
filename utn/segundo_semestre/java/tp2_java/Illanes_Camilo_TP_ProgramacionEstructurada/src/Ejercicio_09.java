import java.util.Scanner;

public class Ejercicio_09 {
    static final double COSTO_NACIONAL = 5.0;
    static final double COSTO_INTERNACIONAL = 10.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(sc.nextLine());

        String zona = "";
        boolean zonaInvalida;
        do {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = sc.nextLine();

            zonaInvalida = !zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional");

            if (zonaInvalida) {
                System.out.println("Error: Por favor escriba 'Nacional' o 'Internacional'");
            }

        } while (zonaInvalida);

        double costoEnvio = calcularCostoEnvio(peso, zona);

        double precioFinal = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioFinal);

        sc.close();
    }


    public static double calcularCostoEnvio(double peso, String zona){
        double costo = 0;
        if (zona.equalsIgnoreCase("nacional")){
            costo = peso * COSTO_NACIONAL;
        } else if (zona.equalsIgnoreCase("internacional")) {
            costo = peso * COSTO_INTERNACIONAL;
        }
        return costo;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double total = precioProducto + costoEnvio;
        return total;
    }
}
