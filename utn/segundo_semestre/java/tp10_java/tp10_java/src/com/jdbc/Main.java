package com.jdbc;

import database.DatabaseConnectionPool;
import model.Categoria;
import model.Producto;
import model.Pedido;
import model.ItemPedido;
import service.CategoriaServiceImpl;
import service.ProductoServiceImpl;
import service.PedidoServiceImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try (Connection conn = DatabaseConnectionPool.getConnection()) {

            CategoriaServiceImpl categoriaService = new CategoriaServiceImpl();
            ProductoServiceImpl productoService = new ProductoServiceImpl();
            PedidoServiceImpl pedidoService = new PedidoServiceImpl();

            // Cargar Categoría
            Categoria catHardware = new Categoria("Hardware", "Componentes internos de PC");
            categoriaService.registrarCategoria(catHardware, conn);

            // Cargar Múltiples Productos asociados
            Producto monitor = new Producto("Monitor 24'", "Monitor IPS 144Hz", 185000.0, 5, catHardware.getId());
            Producto teclado = new Producto("Teclado Mecánico", "Teclado RGB Switch Red", 45000.0, 10, catHardware.getId());

            productoService.registrarProducto(monitor, conn);
            productoService.registrarProducto(teclado, conn);

            // Compra correcta
            System.out.println("Pedido 1");
            Pedido p1 = new Pedido();
            p1.agregarItem(new ItemPedido(monitor.getId(), 2, monitor.getPrecio()));
            p1.agregarItem(new ItemPedido(teclado.getId(), 3, teclado.getPrecio()));

            try {
                pedidoService.crearPedido(p1, conn);
                pedidoService.mostrarDetallePedido(p1.getId(), conn);
            } catch (SQLException e) {
                System.out.println("No fue posible procesar el Pedido 1: " + e.getMessage());
            }

            // Compra fallida por falta de stock
            System.out.println("\nPedido 2");
            Pedido p2 = new Pedido();
            p2.agregarItem(new ItemPedido(teclado.getId(), 1, teclado.getPrecio()));
            p2.agregarItem(new ItemPedido(monitor.getId(), 50, monitor.getPrecio()));

            try {
                pedidoService.crearPedido(p2, conn);
            } catch (SQLException e) {
                System.out.println("Pedido 2 rechazado. Motivo: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}