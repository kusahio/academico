package dao;

import model.Pedido;
import model.ItemPedido;
import java.sql.*;

public class PedidoDAOImpl {

    public void guardar(Pedido p, Connection conn) throws SQLException {
        String sqlPedido = "INSERT INTO pedidos (fecha, total) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS)) {
            ps.setDate(1, Date.valueOf(p.getFecha()));
            ps.setDouble(2, p.getTotal());
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) p.setId(keys.getInt(1));
            }
        }

        String sqlItem = "INSERT INTO items_pedido (pedido_id, producto_id, cantidad, subtotal) VALUES (?, ?, ?, ?)";
        for (ItemPedido item : p.getItems()) {
            try (PreparedStatement ps = conn.prepareStatement(sqlItem)) {
                ps.setInt(1, p.getId());
                ps.setInt(2, item.getProductoId());
                ps.setInt(3, item.getCantidad());
                ps.setDouble(4, item.getSubtotal());
                ps.executeUpdate();
            }
        }
    }
}