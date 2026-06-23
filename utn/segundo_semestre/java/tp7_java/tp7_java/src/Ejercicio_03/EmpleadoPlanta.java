package Ejercicio_03;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bono;

    public EmpleadoPlanta(String nombre, double sueldoBase, double bono) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + bono;
    }
}