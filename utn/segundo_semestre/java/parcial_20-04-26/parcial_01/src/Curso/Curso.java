package Curso;

import com.sun.source.doctree.SinceTree;

public class Curso {
    private final int id;
    private String nombre;
    private int duracionHoras;
    private double precio;
    private static int totalcursos;

    public Curso(int id, String nombre, int duracionHoras, double precio) {
        ++totalcursos;
        if (id > 0){
            this.id = id;
        } else {
            this.id = totalcursos;
        }
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
        setPrecio(precio);
    }

    public Curso(String nombre, int duracionHoras){
        this(0, nombre, duracionHoras, 100.0);
    }

    //setters
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío. Se asignara el nombre de \"Curso sin nombre\"");
            this.nombre = "Curso sin Nombre";
        }
    }

    public void setDuracionHoras(int duracionHoras){
        if (duracionHoras > 0){
            this.duracionHoras = duracionHoras;
        } else {
            System.out.println("Error: La duración debe ser mayor a 0");
            System.out.println("Aviso: Se asignará 0 por defecto, pero debes corregirlo\n");
        }
    }

    public void setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0. Se asignará eñ valor por defecto: $100.00\n");
            this.precio = 100.0;
        }
    }

    //getters
    public String getNombre(){ return nombre; }
    public int getDuracionHoras(){ return duracionHoras; }
    public double getPrecio(){ return precio; }

    //metodos sobrecargados
    public void actualizarPrecio(double porcentajeAumento){
        if (porcentajeAumento > 0 && porcentajeAumento <= 100){
            double nuevoPrecio = (double) precio * ((porcentajeAumento / 100.0) + 1);
            this.precio = nuevoPrecio;
            System.out.println("\nPrecio actualizado para \""+nombre+"\"!\nNuevo Precio: $ "+precio+"\n");
        } else {
            System.out.println("Error: El porcentaje debe ser mayor a 0 o igual o menor a 100");
            System.out.println("Aviso: Se asignará 0 por defecto pero debes corregirlo.\n");
            this.precio = 0.0;
        }
    }

    public void actualizarPrecio(int aumentoFijo){
        if (aumentoFijo > 0){
            this.precio += aumentoFijo;
            System.out.println("Precio actualizado para \""+nombre+"\"!\nNuevo Precio: $ "+precio+"\n");
        } else {
            System.out.println("Error: El aumento fijo debe ser mayor a 0");
            System.out.println("Aviso: Se asignará 0 por defecto pero debes corregirlo.\n");
            this.precio = 0.0;
        }
    }

    public static void mostrarTotalCursos(){
        System.out.println("\nTotal de cursos: "+totalcursos+"\n");
    }

    @Override
    public String toString() {
        return "\n---- Curso ----" +
                "\nId: " + id +
                "\nNombre: " + nombre +
                "\nDuracion Horas: " + duracionHoras +
                "\nPrecio: $" + precio;
    }
}
