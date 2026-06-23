package dominio;

import java.util.Objects;

public class Producto extends Base {
    private String nombre;
    private Double precio;
    private String descripcion;
    private Integer stock;
    private String imagen;
    private Boolean disponible;
    private Categoria categoria;

    public Producto(
            String nombre,
            Double precio,
            String descripcion,
            Integer stock,
            String imagen,
            Categoria categoria
    ) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.imagen = imagen;
        this.categoria = categoria;
        validarDisponibilidad();

        if (this.categoria != null) {
            this.categoria.agregarProducto(this);
        }
    }

    private void validarDisponibilidad() {
        this.disponible = this.stock > 0;
    }

    private void reducirStock(Integer cantidad) {
        this.stock -= cantidad;
        if (this.stock == 0) {
            this.disponible = false;
            System.out.println("El producto '" + this.nombre + "' se ha quedado SIN STOCK.");
        }
    }

    public Boolean validarVenta(Integer cantidad) {
        if (this.stock >= cantidad) {
            reducirStock(cantidad);
            return true;
        }
        return false;
    }

    public String getNombre() { return nombre; }
    public Double getPrecio() { return precio; }
    public Integer getStock() { return stock; }
    public Boolean getDisponible() { return disponible; }
    public Categoria getCategoria() { return categoria; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Producto{id=" + getId() + ", nombre='" + nombre + "'}";
    }
}