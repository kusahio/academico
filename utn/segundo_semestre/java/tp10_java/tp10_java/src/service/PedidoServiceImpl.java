package service;

import dao.PedidoDAOImpl;
import dao.ProductoDAOImpl;
import model.Pedido;
import model.ItemPedido;
import model.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoServiceImpl {
    private PedidoDAOImpl pedidoDAO = new PedidoDAOImpl();
    private ProductoDAOImpl productoDAO = new ProductoDAOImpl();

    public void crearPedido(Pedido pedido, Connection conn) throws SQLException {
        try {
            conn.setAutoCommit(false);

            for (ItemPedido item : pedido.getItems()) {
                Producto prod = productoDAO.leer(item.getProductoId(), conn);

                if (prod == null || prod.getCantidad() < item.getCantidad()) {
                    throw new RuntimeException("Stock insuficiente para el Producto ID: " + item.getProductoId());
                }

                prod.setCantidad(prod.getCantidad() - item.getCantidad());
                productoDAO.actualizar(prod, conn);
            }

            pedidoDAO.guardar(pedido, conn);
            conn.commit();
            System.out.println("Pedido registrado con éxito.");

        } catch (Exception e) {
            conn.rollback();
            System.err.println("Transacción abortada debido a: " + e.getMessage());
            throw new SQLException(e);
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public void mostrarDetallePedido(int pedidoId, Connection conn) throws SQLException {
        String sql = "SELECT p.id AS pedido_id, p.fecha, p.total AS total_pedido, " +
                "ip.cantidad, ip.subtotal, prod.nombre AS producto_nombre, c.nombre AS categoria_nombre " +
                "FROM pedidos p " +
                "JOIN items_pedido ip ON p.id = ip.pedido_id " +
                "JOIN productos prod ON ip.producto_id = prod.id " +
                "JOIN categorias c ON prod.id_categoria = c.id " +
                "WHERE p.id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, pedidoId);
            try (ResultSet rs = ps.executeQuery()) {
                boolean tieneCabecera = false;
                while (rs.next()) {
                    if (!tieneCabecera) {
                        System.out.println("\n=======================================================");
                        System.out.println("DETALLE DEL PEDIDO N°: " + rs.getInt("pedido_id"));
                        System.out.println("Fecha: " + rs.getDate("fecha") + " | Total acumulado: $" + rs.getDouble("total_pedido"));
                        System.out.println("-------------------------------------------------------");
                        tieneCabecera = true;
                    }
                    System.out.println(" - " + rs.getString("producto_nombre") +
                            " [" + rs.getString("categoria_nombre") + "] x" +
                            rs.getInt("cantidad") + " | Subtotal: $" + rs.getDouble("subtotal"));
                }
                if (!tieneCabecera) {
                    System.out.println("No se encontró ningún pedido con el ID: " + pedidoId);
                }
                System.out.println("=======================================================");
            }
        }
    }
}