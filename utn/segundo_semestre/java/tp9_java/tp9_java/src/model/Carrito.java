package model;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Producto<?>> {
    private List<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public void eliminarProducto(T producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (T prod : productos) {
            total += prod.getPrecio();
        }
        return total;
    }

    public List<T> getProductos() {
        return productos;
    }
}