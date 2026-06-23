package Ejercicio_01;

public class Pasaporte {
    private int numero;
    private Foto foto;
    private Titular titular;

    public Pasaporte(int numero, String archivoFoto, Titular titular) {
        this.numero = numero;
        this.titular = titular;


        this.foto = new Foto(archivoFoto);

        this.titular.setPasaporte(this);
    }

    public void mostrarInfo() {
        System.out.println("Pasaporte Nro: " + numero);
        System.out.println("Foto: " + foto.getNombreArchivo());
        System.out.println("Titular: " + titular.getNombreCompleto());
    }
}
