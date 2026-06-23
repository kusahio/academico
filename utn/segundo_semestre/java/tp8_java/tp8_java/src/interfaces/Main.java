package interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PARTE 1: INTERFACES E-COMMERCE ===");

        Cliente cliente = new Cliente("Juan Gómez");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Teclado Mecánico", 4500));
        pedido.agregarProducto(new Producto("Monitor 24''", 35000));

        double total = pedido.calcularTotal();
        System.out.println("Total del Pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito("4512-XXXX-XXXX-8899");
        tarjeta.aplicarDescuento(15);
        tarjeta.procesarPago(total);

        pedido.cambiarEstado("En proceso de envío");
    }
}
