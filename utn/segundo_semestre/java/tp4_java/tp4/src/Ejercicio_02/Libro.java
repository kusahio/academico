package Ejercicio_02;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    //setters
    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isBlank()){
            this.titulo = titulo;
        } else {
            System.out.println("Error: El titulo no puede estar vacío");
        }
    }

    public void setAutor(String autor){
        if (autor != null && !autor.isBlank()){
            this.autor = autor;
        } else {
            System.out.println("Error: El autor no puede estar vacío");
        }
    }

    //getters
    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }

    public Libro(String titulo, String autor){
        setTitulo(titulo);
        setAutor(autor);
    }

    public Libro(String titulo, String autor, String editorial){
        this(titulo, autor);

        if (editorial != null && !editorial.isBlank()) {
            Libro.editorial = editorial;
        }
    }

    public void actualizarTitulo(String nuevoTitulo){
        if (nuevoTitulo != null && !nuevoTitulo.isBlank()){
            this.titulo = nuevoTitulo;
        }
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo){
        boolean validaTitulo = nuevoTitulo != null && !nuevoTitulo.isBlank();
        boolean validaPrefijo = prefijo != null && !prefijo.isBlank();

        if (validaTitulo && validaPrefijo){
            this.titulo = prefijo+" "+nuevoTitulo;
        }
    }

    public static void cambiarEditorial(String editorial){
        Libro.editorial = editorial;
    }

    @Override
    public String toString(){
        return "---- Libro ----"+
                "\nTítulo: "+titulo+
                "\nAutor: "+autor+
                "\nEditorial: "+editorial;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
