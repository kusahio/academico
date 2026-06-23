package Ejercicio_05;

public class NaveEspacial {
    private String nombre;
    private double combustible;
    private final int capacidadMaxima = 100;

    //setters
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
        }
    }

    public void setCombustible(double cantidad){
        if (cantidad >= 0 && cantidad <= capacidadMaxima){
            this.combustible = cantidad;
        } else {
            System.out.println("Error: El combustible no puede ser menor a 0");
        }
    }

    //getters
    public String getNombre(){ return nombre; }
    public double getCombustible(){ return combustible; }

    public void despegar(){
        final double usoCombustible = 4.0;
        boolean verificarCombustible = (combustible - usoCombustible) > 0;

        if (verificarCombustible){
            double nuevoTotal = combustible - usoCombustible;
            this.combustible = (double) Math.round(nuevoTotal * 100) / 100;
            System.out.println("Despegue exitoso!\nCombustible actual: "+combustible);
        } else {
            System.out.println("Error: No hay suficiente combustible");
        }
    }

    public void avanzar(double distancia){
        final double usoPorKm = 2;
        final double combustibleNecesario = distancia * usoPorKm;

        if (combustibleNecesario <= combustible){
            double nuevoTotal = combustible - combustibleNecesario;
            this.combustible = (double) Math.round(nuevoTotal * 100) / 100;
            System.out.println("Has avanzado "+distancia+" Km");
            System.out.println("Combustible restante: "+combustible);
        } else {
            System.out.println("Error: No tienes suficiente combustible");
        }
    }

    public void recargarCombustible(double cantidad){
        final boolean verificarExceso = (combustible + cantidad) <= capacidadMaxima;
        if ((cantidad > 0) && verificarExceso){
            double nuevoTotal = combustible + cantidad;
            this.combustible = (double) Math.round(nuevoTotal * 100) / 100 ;
            System.out.println("Has recargado: "+cantidad+" de combustible.\nCombustible actual: "+combustible);
        } else {
            System.out.println("Error: La cantidad a recargar debe ser mayor a 0 y no superar la capcidad de "+capacidadMaxima);
        }
    }

    public void mostrarEstado()
    {
        System.out.println("<<Datos de la nave>>");
        System.out.println("Nombre: "+nombre+"\nCombustible actual: "+combustible);
    }
}
