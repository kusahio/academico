package model;

import java.time.LocalDate;

public class Pedido implements Identificable<String>, Comparable<Pedido> {
    private String id;
    private double total;
    private LocalDate fecha;

    public Pedido(String id, double total, LocalDate fecha) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
    }

    @Override
    public String getID() { return id; }

    @Override
    public void setID(String id) { this.id = id; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.total, otro.total);
    }

    @Override
    public String toString() {
        return "Pedido [ID=" + id + ", Total=$" + total + ", Fecha=" + fecha + "]";
    }
}