import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockInicial = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int ventas = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int nuevoIngreso = Integer.parseInt(sc.nextLine());

        int stockFinal = actualizarInventario(stockInicial, ventas, nuevoIngreso);

        System.out.println("El nuevo stock del producto es:: " + stockFinal);

        sc.close();
    }

    public static int actualizarInventario(int stock, int ventas, int ingresos) {
        return (stock - ventas) + ingresos;
    }
}