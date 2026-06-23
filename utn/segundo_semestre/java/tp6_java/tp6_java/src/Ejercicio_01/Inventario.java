package Ejercicio_01;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>(); // Inicialización para evitar NullPointerException
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null; // Devuelve null si no lo encuentra
    }

    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto " + id + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para: " + p.getNombre());
        } else {
            System.out.println("No se encontró el producto para actualizar stock.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("--- Productos en la categoría " + categoria + " ---");
        boolean f = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                f = true;
            }
        }
        if (!f) System.out.println("No hay productos en esta categoría.");
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;

        Producto maxProd = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > maxProd.getCantidad()) {
                maxProd = p;
            }
        }
        return maxProd;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("--- Productos con precio entre $" + min + " y $" + max + " ---");
        boolean f = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                f = true;
            }
        }
        if (!f) System.out.println("No se encontraron productos en ese rango de precios.");
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías Disponibles en el Sistema ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat + ": " + cat.getDescripcion());
        }
    }
}