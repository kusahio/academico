package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private LocalDate fecha;
    private double total;
    private List<ItemPedido> items;

    public Pedido() {
        this.fecha = LocalDate.now();
        this.total = 0.0;
        this.items = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    public List<ItemPedido> getItems() { return items; }

    public void agregarItem(ItemPedido item) {
        this.items.add(item);
        this.total += item.getSubtotal();
    }
}