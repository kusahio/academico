package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Laptop Gamer", 1500000);
        Producto prod2 = new Producto("Mouse Pad");

        // Probar aplicarDescuento [cite: 192]
        prod1.aplicarDescuento(10.0);
        prod2.aplicarDescuento(50.0, 80.0);

        // Probar precios negativos
        Producto prodError = new Producto("Teclado", -5000);

        System.out.println(prod1);
        System.out.println(prod2);

        // Cambiar IVA global
        Producto.cambiarIVA(0.105); // [cite: 188]

        System.out.println(prod1);
        System.out.println(prod2);
    }
}