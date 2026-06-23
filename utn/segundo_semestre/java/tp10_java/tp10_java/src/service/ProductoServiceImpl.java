package service;

import dao.ProductoDAOImpl;
import model.Producto;
import java.sql.Connection;
import java.sql.SQLException;

public class ProductoServiceImpl {
    private ProductoDAOImpl productoDAO = new ProductoDAOImpl();

    public void registrarProducto(Producto producto, Connection conn) throws SQLException {
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (producto.getPrecio() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0.");
        }
        if (producto.getCantidad() <= 0) {
            throw new IllegalArgumentException("La cantidad inicial en stock debe ser mayor a 0.");
        }
        if (!productoDAO.existeCategoria(producto.getIdCategoria(), conn)) {
            throw new IllegalArgumentException("La categoría asociada no es válida.");
        }
        productoDAO.crear(producto, conn);
    }
}