package dominio;

public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subtotal;
    private Boolean valido;
    private Producto producto;

    public DetallePedido(Producto producto, Integer cantidad) {
        super();
        this.producto = producto;
        this.cantidad = cantidad;
        validar(producto);
    }

    private void validar(Producto producto) {
        if (producto == null) {
            this.valido = false;
            this.subtotal = 0.0;
            return;
        }

        if (producto.validarVenta(this.cantidad)) {
            this.valido = true;
            calcularSubtotal();
        } else {
            this.valido = false;
            this.subtotal = 0.0;
            System.out.println("Venta fallida: Stock insuficiente para '" + producto.getNombre() + "'.");
        }
    }

    private void calcularSubtotal() {
        if (this.valido && this.producto != null) {
            this.subtotal = this.cantidad * this.producto.getPrecio();
        } else {
            this.subtotal = 0.0;
        }
    }

    public Integer getCantidad() { return cantidad; }
    public Double getSubtotal() { return subtotal; }
    public Boolean getValido() { return valido; }
    public Producto getProducto() { return producto; }

    @Override
    public String toString() {
        return "DetallePedido{producto=" + (producto != null ? producto.getNombre() : "null") + ", cantidad=" + cantidad + ", subtotal=$" + subtotal + ", valido=" + valido + "}";
    }
}