package Ejercicio_01;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    // setter y getter Nombre
    public String getnombre(){return nombre;}
    public void setNombre(String nombre){
        if (nombre != null &&  !nombre.isBlank()){
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacío ni contener solo espacios");
        }
    }

    // setter y getter Apellido
    public String getApellido(){return  apellido;}
    public void setApellido(String apellido){
        if (apellido != null && !apellido.isBlank()){
            this.apellido = apellido.trim();
        } else{
            System.out.println("Error: El apellido no puede estar vacío ni contener solo espacios");
        }
    }

    //setter y getter Calificacion
    public double getCalificacion(){return calificacion;}
    public void setCalificacion(double calificacion){
        if (calificacion >= 0 && calificacion <= 10){
            this.calificacion = calificacion;
        } else{
            System.out.println("Error: La calificación se encuentra fuera de rango");
        }
    }

    //setter y getter curso
    public String getCurso(){ return curso; }
    public void setCurso(String curso) {
        if (curso != null && !curso.isBlank()){
            this.curso = curso.trim();
        } else{
            System.out.println("Error: El curso no puede estar vacío ni contener solo espacios");
        }
    }

    public void mostrarInfo(){
        System.out.println("Estudiante: "+nombre+" "+apellido+"\nCurso: "+curso+"\nNota: "+calificacion);
    }

    public void subirCalificacion(double puntos){
        double nuevaNota = this.calificacion + puntos;
        if (nuevaNota <= 10){
            this.calificacion = (double) Math.round(nuevaNota * 100) / 100;
        } else {
            System.out.println("Error: La calificacion no puede estar encima de 10");
        }
    }

    public void bajarCalificacion(double puntos){
        double nuevaNota = this.calificacion - puntos;
        if (nuevaNota >= 0){
            this.calificacion = (double) Math.round(nuevaNota * 100) / 100;
        } else {
            System.out.println("Error: La calificacion no puede ser menor a 0");
        }
    }
}
