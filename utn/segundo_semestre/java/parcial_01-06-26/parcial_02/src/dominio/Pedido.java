package dominio;

import interfaces.Calculable;
import enumerables.Estado;
import enumerables.FormaPago;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Base implements Calculable {
    private LocalDate fecha;
    private Estado estado;
    private Double total;
    private FormaPago formaPago;
    private List<DetallePedido> detallesPedido;

    public Pedido(FormaPago formaPago) {
        super();
        this.fecha = LocalDate.now();
        this.formaPago = formaPago;
        this.estado = Estado.INVALIDO;
        this.total = 0.0;
        this.detallesPedido = new ArrayList<>();
    }

    public void addDetallePedido(Integer cantidad, Producto producto) {
        if (producto == null) return;

        for (DetallePedido detalle : detallesPedido) {
            if (detalle.getProducto().equals(producto)) {
                System.out.println("Producto duplicado detectado: '" + producto.getNombre() + "'. No se agregará de nuevo.");
                return;
            }
        }

        DetallePedido nuevoDetalle = new DetallePedido(producto, cantidad);

        if (nuevoDetalle.getValido()) {
            this.detallesPedido.add(nuevoDetalle);
            this.estado = Estado.PENDIENTE;
            calcularTotal();
        }
    }

    @Override
    public void calcularTotal() {
        this.total = 0.0;
        for (DetallePedido detalle : detallesPedido) {
            if (detalle.getValido()) {
                this.total += detalle.getSubtotal();
            }
        }
    }

    public void deleteDetallePedidoByProducto(Producto producto) {
        if (producto == null) return;

        boolean removido = detallesPedido.removeIf(detalle -> detalle.getProducto().equals(producto));

        if (removido) {
            if (detallesPedido.isEmpty()) {
                this.estado = Estado.INVALIDO;
            }
            calcularTotal();
        }
    }

    public LocalDate getFecha() { return fecha; }
    public Estado getEstado() { return estado; }
    public Double getTotal() { return total; }
    public FormaPago getFormaPago() { return formaPago; }
    public List<DetallePedido> getDetallesPedido() { return detallesPedido; }

    @Override
    public String toString() {
        return "Pedido{id=" + getId() + ", fecha=" + fecha + ", estado=" + estado + ", total=$" + total + ", detalles=" + detallesPedido + "}";
    }
}