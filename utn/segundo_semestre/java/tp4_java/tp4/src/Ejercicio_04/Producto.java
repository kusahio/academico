package Ejercicio_04;

public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA = 0.21;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        setPrecioBase(precioBase);
    }

    public Producto(String nombre) {
        this(nombre, 100.0);
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) this.precioBase = precioBase;
        else System.out.println("Error: Precio no puede ser negativo");
    }

    public void aplicarDescuento(double porcentaje) {
        this.precioBase -= this.precioBase * (porcentaje / 100);
    }

    public void aplicarDescuento(double porcentaje, double precioMinimo) {
        double nuevoPrecio = this.precioBase - (this.precioBase * (porcentaje / 100));
        this.precioBase = Math.max(nuevoPrecio, precioMinimo);
    }

    public double calcularPrecioFinal() {
        return precioBase * (1 + IVA);
    }

    public static void cambiarIVA(double nuevo) {
        IVA = nuevo;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre +
                "\nBase: $" + precioBase
                +"\nCon IVA: $" + calcularPrecioFinal();
    }
}
