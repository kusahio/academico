import model.Producto;
import model.Carrito;
import model.Pedido;
import service.ComparadorPorFecha;
import service.Buscador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. PRUEBAS DE PRODUCTO Y CARRITO ===");
        // Crear instancias de Producto con IDs de tipo String (puede ser Integer también)
        Producto<String> p1 = new Producto<>("PROD01", "Teclado Mecánico", 45000.0);
        Producto<String> p2 = new Producto<>("PROD02", "Mouse Ergonómico", 25000.0);
        Producto<String> p3 = new Producto<>("PROD03", "Monitor 24' IPS", 185000.0);

        // Instanciar carrito y añadir productos
        Carrito<Producto<String>> carrito = new Carrito<>();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        System.out.println("Total inicial del carrito: $" + carrito.calcularTotal());

        // Eliminar un producto y recalcular
        System.out.println("\n-> Eliminando " + p2.getNombre() + " del carrito...");
        carrito.eliminarProducto(p2);
        System.out.println("Total actualizado del carrito: $" + carrito.calcularTotal());


        System.out.println("\n=== 2. PRUEBAS DE PEDIDOS (SORT, COMPARABLE Y COMPARATOR) ===");
        List<Pedido> listaPedidos = new ArrayList<>();
        listaPedidos.add(new Pedido("PED-99", 230000.0, LocalDate.of(2026, 5, 15)));
        listaPedidos.add(new Pedido("PED-12", 45000.0, LocalDate.of(2026, 2, 10)));
        listaPedidos.add(new Pedido("PED-45", 110000.0, LocalDate.of(2026, 6, 20)));

        System.out.println("Lista original de pedidos:");
        listaPedidos.forEach(System.out::println);

        // Ordenar por total usando Comparable (natural)
        Collections.sort(listaPedidos);
        System.out.println("\nPedidos ordenados por TOTAL (Comparable):");
        listaPedidos.forEach(System.out::println);

        // Ordenar por fecha usando Comparator externo
        Collections.sort(listaPedidos, new ComparadorPorFecha());
        System.out.println("\nPedidos ordenados por FECHA (Comparator):");
        listaPedidos.forEach(System.out::println);


        System.out.println("\n=== 3. PRUEBAS DE BUSCADOR GENÉRICO ===");
        Buscador<Pedido, String> buscadorPedidos = new Buscador<>();

        String idABuscar = "PED-45";
        System.out.println("Buscando pedido con ID: " + idABuscar);
        Optional<Pedido> resultado = buscadorPedidos.buscarPorId(listaPedidos, idABuscar);

        if (resultado.isPresent()) {
            System.out.println("¡Elemento encontrado!: " + resultado.get());
        } else {
            System.out.println("El elemento con ID " + idABuscar + " no existe.");
        }

        // Búsqueda fallida
        String idErroneo = "PED-00";
        System.out.println("\nBuscando pedido con ID: " + idErroneo);
        Optional<Pedido> resultadoFallido = buscadorPedidos.buscarPorId(listaPedidos, idErroneo);

        resultadoFallido.ifPresentOrElse(
                p -> System.out.println("Encontrado: " + p),
                () -> System.out.println("Error: El elemento no existe.")
        );
    }
}