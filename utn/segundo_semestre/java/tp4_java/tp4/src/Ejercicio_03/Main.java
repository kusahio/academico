package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Kira", 8.5);
        Alumno alumno2 = new Alumno("Camilo");

        // Pruebas de actualizar promedio
        alumno2.actualizarPromedio(7.5);

        double[] notasKira = {9.0, 10.0, 8.0};
        alumno1.actualizarPromedio(notasKira);

        // 3. Pruebas fuera de rango
        alumno2.setPromedio(15.0);
        alumno1.setPromedio(-5.0);

        System.out.println(alumno1);
        System.out.println(alumno2);

        // Cambiar notas
        Alumno.cambiarNotaAprobacion(9.0);

        System.out.println(alumno1);
        System.out.println(alumno2);
    }
}