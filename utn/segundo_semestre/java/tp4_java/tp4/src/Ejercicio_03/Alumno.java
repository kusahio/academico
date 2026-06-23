package Ejercicio_03;

public class Alumno {
    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6.0;

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        setPromedio(promedio);
    }

    public Alumno(String nombre) {
        this(nombre, 0.0);
    }

    public void setPromedio(double promedio) {
        if (promedio < 0) {
            this.promedio = 0;
        } else if (promedio > 10) {
            this.promedio = 10;
        } else {
            this.promedio = promedio;
        }
    }

    public void actualizarPromedio(double nuevoPromedio) {
        setPromedio(nuevoPromedio);
    }

    public void actualizarPromedio(double[] notas) {
        if (notas != null && notas.length > 0) {
            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            setPromedio(suma / notas.length);
        } else {
            System.out.println("Error: El arreglo de notas está vacío.");
        }
    }

    public boolean aprobo() {
        return this.promedio >= notaAprobacion;
    }

    public static void cambiarNotaAprobacion(double nueva) {
        notaAprobacion = nueva;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " | Promedio: " + promedio +
                " | Estado: " + (aprobo() ? "Aprobado" : "Reprobado"); // [cite: 151]
    }
}