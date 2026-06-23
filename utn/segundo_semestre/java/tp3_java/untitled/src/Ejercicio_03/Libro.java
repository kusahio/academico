package Ejercicio_03;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    //getters
    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }
    public int getAnio(){ return anioPublicacion; }

    //setters
    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isBlank()){
            this.titulo = titulo.trim();
        } else {
            System.out.println("El título no puede estar vacío");
        }
    }

    public void setAutor(String autor){
        if (autor != null && !autor.isBlank()){
            this.autor = autor.trim();
        } else {
            System.out.println("Error: El autor no puede estar vacío");
        }
    }

    public void setAnio(int anioPublicacion){
        int anioActual = java.time.LocalDate.now().getYear();
        if (anioPublicacion <= anioActual && anioPublicacion > 0){
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Error: El año no puede superar al año actual y debe ser mayor a 0.\nAño actual: "+anioActual);
        }
    }

    public void mostrarInfo(){
        System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nAño de publicación: "+anioPublicacion);
    }


}
