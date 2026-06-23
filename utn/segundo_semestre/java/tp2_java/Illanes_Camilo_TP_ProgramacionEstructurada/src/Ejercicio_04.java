import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int porcentaje = 0;

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = sc.nextLine().toUpperCase();

        switch (categoria) {
            case "A":
                porcentaje = 10;
                break;
            case "B":
                porcentaje = 15;
                break;
            case "C":
                porcentaje = 20;
                break;
            default:
                System.out.println("No es una categoría con descuento");
        }

        double descuento = precioOriginal * (porcentaje / 100.0);
        double precioFinal = precioOriginal - descuento;

        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}