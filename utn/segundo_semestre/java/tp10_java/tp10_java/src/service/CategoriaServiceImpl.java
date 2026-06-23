package service;

import dao.CategoriaDAOImpl;
import model.Categoria;
import java.sql.Connection;
import java.sql.SQLException;

public class CategoriaServiceImpl {
    private CategoriaDAOImpl categoriaDAO = new CategoriaDAOImpl();

    public void registrarCategoria(Categoria categoria, Connection conn) throws SQLException {
        if (categoria.getNombre() == null || categoria.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("Validación fallida: El nombre de la categoría no puede estar vacío.");
        }
        if (categoriaDAO.existeNombre(categoria.getNombre(), conn)) {
            throw new IllegalArgumentException("Validación fallida: Ya existe una categoría con el nombre '" + categoria.getNombre() + "'.");
        }
        categoriaDAO.crear(categoria, conn);
    }
}