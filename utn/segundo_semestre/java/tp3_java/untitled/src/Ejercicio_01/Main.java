package Ejercicio_01;

public class Main {
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante();

        System.out.println("--- Pruebas de validación ---");
        estudiante.setNombre("   ");
        estudiante.setApellido("");
        estudiante.setCalificacion(15);
        estudiante.setCurso("   ");

        //crear estudiante
        estudiante.setNombre("Camilo ");
        estudiante.setApellido(" Illanes");
        estudiante.setCalificacion(8.8);
        estudiante.setCurso("Programación 2");
        estudiante.mostrarInfo();

        //Testear limites de calificación
        //Sobre el limite
        estudiante.subirCalificacion(3);
        System.out.println("Mostrar error 1");
        estudiante.mostrarInfo();
        //Bajo el limite
        estudiante.bajarCalificacion(10);
        System.out.println("Mostrar error 2");
        estudiante.mostrarInfo();

        //Subir calificacion correctamente
        estudiante.subirCalificacion(1);
        System.out.println("sube 1");
        estudiante.mostrarInfo();
        //Bajar calificacion correctamente
        estudiante.bajarCalificacion(3);
        System.out.println("Baja 3");
        estudiante.mostrarInfo();
    }
}
