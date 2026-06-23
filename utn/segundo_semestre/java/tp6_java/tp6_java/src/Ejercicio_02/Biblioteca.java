package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro \"" + titulo + "\" agregado con éxito a la biblioteca " + this.nombre + ".");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca \"" + nombre + "\" no tiene libros disponibles.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null; // Si no lo encuentra
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("El libro con ISBN " + isbn + " fue eliminado.");
        } else {
            System.out.println("No se encontró ningún libro con el ISBN: " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("--- Libros publicados en el año " + anio + " ---");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("--- Autores con libros disponibles en " + nombre + " ---");
        ArrayList<String> idsImpresos = new ArrayList<>();

        for (Libro l : libros) {
            Autor a = l.getAutor();
            if (!idsImpresos.contains(a.getId())) {
                System.out.println("- " + a.getNombre() + " (" + a.getNacionalidad() + ")");
                idsImpresos.add(a.getId());
            }
        }
    }
}