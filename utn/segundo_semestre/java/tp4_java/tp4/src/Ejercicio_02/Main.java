package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Rayuela", "Julio Cortázar");
        Libro libro2 = new Libro("El Aleph", "Jorge Luis Borges", "Sudamericana");

        System.out.println(libro1);
        System.out.println(libro2);

        // Usar las dos variantes de actualizarTitulo
        libro1.actualizarTitulo("Rayuela - Edición Conmemorativa");
        libro2.actualizarTitulo("Colección:", "El Aleph");

        // Titulo vacío
        libro1.actualizarTitulo("");

        System.out.println(libro1);
        System.out.println(libro2);

        // 3. Cambiar la editorial global
        Libro.cambiarEditorial("Editorial La Pulenta");

        System.out.println(libro1);
        System.out.println(libro2);
    }
}