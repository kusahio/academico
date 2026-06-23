import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(sc.nextLine());

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){

        impuesto /= 100;
        descuento /= 100;

        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}