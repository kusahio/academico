package Ejercicio_03;

public class Main {
    public static void main(String[] args){
        Libro nuevoLibro = new Libro();

        //pruebas
        nuevoLibro.setTitulo("");
        nuevoLibro.setAutor("      ");
        nuevoLibro.setAnio(3000);
        nuevoLibro.mostrarInfo();

        //datos válidos
        nuevoLibro.setTitulo("Cien años de soledad");
        nuevoLibro.setAutor("Gabriel García Márquez");
        nuevoLibro.setAnio(1967);
        nuevoLibro.mostrarInfo();
    }
}
