package dao;

import model.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements GenericDAO<Producto> {

    @Override
    public void crear(Producto p, Connection conn) throws SQLException {
        String sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad, id_categoria) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getCantidad());
            ps.setInt(5, p.getIdCategoria());
            ps.executeUpdate();
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) p.setId(keys.getInt(1));
            }
        }
    }

    @Override
    public Producto leer(int id, Connection conn) throws SQLException {
        String sql = "SELECT * FROM productos WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Producto p = new Producto(rs.getString("nombre"), rs.getString("descripcion"),
                            rs.getDouble("precio"), rs.getInt("cantidad"), rs.getInt("id_categoria"));
                    p.setId(rs.getInt("id"));
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public void actualizar(Producto p, Connection conn) throws SQLException {
        String sql = "UPDATE productos SET cantidad = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getCantidad());
            ps.setInt(2, p.getId());
            ps.executeUpdate();
        }
    }

    @Override public void eliminar(int id, Connection conn) throws SQLException {}
    @Override public List<Producto> listar(Connection conn) throws SQLException { return new ArrayList<>(); }

    public List<Producto> listarPorCategoria(int idCategoria, Connection conn) throws SQLException {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos WHERE id_categoria = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idCategoria);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto p = new Producto(rs.getString("nombre"), rs.getString("descripcion"),
                            rs.getDouble("precio"), rs.getInt("cantidad"), rs.getInt("id_categoria"));
                    p.setId(rs.getInt("id"));
                    lista.add(p);
                }
            }
        }
        return lista;
    }

    public boolean existeCategoria(int idCategoria, Connection conn) throws SQLException {
        String sql = "SELECT COUNT(*) FROM categorias WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idCategoria);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return rs.getInt(1) > 0;
            }
        }
        return false;
    }
}