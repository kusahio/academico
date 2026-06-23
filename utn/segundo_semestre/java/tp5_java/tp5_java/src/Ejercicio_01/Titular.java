package Ejercicio_01;

public class Titular {
    private String nombre;
    private String apellido;
    private Pasaporte pasaporte;

    public Titular(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombreCompleto() { return nombre + " " + apellido; }
}