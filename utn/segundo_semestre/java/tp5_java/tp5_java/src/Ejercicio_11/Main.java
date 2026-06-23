package Ejercicio_11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Los Tres", "Rock Nacional");

        Cancion tema = new Cancion("Torre de Babel", artista);

        Reproductor ipod = new Reproductor();

        ipod.reproducir(tema);
    }
}