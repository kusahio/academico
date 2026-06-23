package Ejercicio_14;

public class Main {
    public static void main(String[] args) {
        Proyecto cortometraje = new Proyecto("Kung Fury", 30);

        EditorVideo softwareEdicion = new EditorVideo();

        softwareEdicion.exportar("mp4", cortometraje);
    }
}