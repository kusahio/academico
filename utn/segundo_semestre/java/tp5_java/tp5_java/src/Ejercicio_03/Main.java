package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Autor autorAsociado = new Autor("Homero", "N/A");

        Editorial editorialAsociada = new Editorial("Editorial Anitalavalatina", "Calle falsa 123");

        Libro libro = new Libro("La Odisea", "978-05468498", autorAsociado, editorialAsociada);

        System.out.println("DATOS");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());

        System.out.println("Autor: " + libro.getAutor().getNombre() + " (" + libro.getAutor().getNacionalidad() + ")");
        System.out.println("Editorial: " + libro.getEditorial().getNombre() + " en " + libro.getEditorial().getDireccion());
    }
}