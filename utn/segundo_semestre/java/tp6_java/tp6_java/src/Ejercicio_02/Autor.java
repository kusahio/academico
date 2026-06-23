package Ejercicio_02;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " | Nacionalidad: " + nacionalidad + " (ID: " + id + ")");
    }

    @Override
    public String toString() {
        return nombre;
    }
}