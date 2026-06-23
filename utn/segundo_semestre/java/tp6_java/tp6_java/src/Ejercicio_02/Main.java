package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UTN");

        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentino");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");

        System.out.println("=== 3. Cargando Libros ===");
        biblioteca.agregarLibro("978-1", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-2", "Crónica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("978-3", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("978-4", "Bestiario", 1951, autor2);
        biblioteca.agregarLibro("978-5", "La casa de los espíritus", 1982, autor3);

        System.out.println("\n=== 4. Listado de Libros Disponibles ===");
        biblioteca.listarLibros();

        System.out.println("\n=== 5. Buscando Libro con ISBN: 978-3 ===");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("978-3");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }

        System.out.println("\n=== 6. Filtrando Libros del Año 1981 ===");
        biblioteca.filtrarLibrosPorAnio(1981);

        System.out.println("\n=== 7. Eliminando Libro con ISBN: 978-1 ===");
        biblioteca.eliminarLibro("978-1");
        System.out.println("--- Libros Restantes ---");
        biblioteca.listarLibros();

        System.out.println("\n=== 8. Cantidad Total de Libros ===");
        System.out.println("Total en inventario: " + biblioteca.obtenerCantidadLibros() + " libros.");

        System.out.println("\n=== 9. Catálogo de Autores de la Biblioteca ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}