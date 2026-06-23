package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("P001", "Leche Entera", 1200.0, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P002", "Smart TV 50'", 450000.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P003", "Remera Algodón", 2500.0, 85, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Auriculares Bluetooth", 1800.0, 40, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P005", "Sartén Antiadherente", 3500.0, 15, CategoriaProducto.HOGAR));

        System.out.println("\n=== 2. Listado Inicial de Productos ===");
        inventario.listarProductos();

        System.out.println("\n=== 3. Buscando Producto P002 ===");
        Producto buscado = inventario.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n=== 4. Filtrar por Electrónica ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n=== 5. Eliminando Producto P001 ===");
        inventario.eliminarProducto("P001");
        System.out.println("--- Lista Restante ---");
        inventario.listarProductos();

        System.out.println("\n=== 6. Actualizando Stock de P003 ===");
        inventario.actualizarStock("P003", 100);

        System.out.println("\n=== 7. Total de Unidades en Stock ===");
        System.out.println("Total: " + inventario.obtenerTotalStock() + " unidades.");

        System.out.println("\n=== 8. Producto con Mayor Cantidad de Stock ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto estrella es: " + mayorStock.getNombre() + " con " + mayorStock.getCantidad() + " unidades.");
        }

        System.out.println("\n=== 9. Filtrando Precios entre $1000 y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        System.out.println("\n=== 10. Reporte de Categorías ===");
        inventario.mostrarCategoriasDisponibles();
    }
}