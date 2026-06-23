public class Main {
    public static void main(String[] args){

        Producto.mostrarCategorias();

        Producto prod1 = new Producto(10, "Arena de gato", "Indumentaria", 40 , 18000.0);
        Producto prod2 = new Producto("Bolsa de deschechos", "Indumentaria", 100);
        Producto prod3 = new Producto("Pelota automatica", "Indumentaria", 10);

        //aplicar descuentos
        prod1.aplicarDescuento(10.6);
        prod1.aplicarDescuento(5);
        prod2.aplicarDescuento(10.0);
        prod2.aplicarDescuento(5);
        prod3.aplicarDescuento(10.0);
        prod3.aplicarDescuento(5);

        //mostrar prod
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);

        Producto.mostrarTotalProductos();

        Producto prod4 = new Producto(-10, "   ", "", -10, -50000);

        System.out.println(prod4);
    }
}
