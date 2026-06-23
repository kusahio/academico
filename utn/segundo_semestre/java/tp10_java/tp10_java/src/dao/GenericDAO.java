package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
    void crear(T t, Connection conn) throws SQLException;
    T leer(int id, Connection conn) throws SQLException;
    void actualizar(T t, Connection conn) throws SQLException;
    void eliminar(int id, Connection conn) throws SQLException;
    List<T> listar(Connection conn) throws SQLException;
}