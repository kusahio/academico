package Ejercicio_03;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Arranca sin profesor asignado
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) {
            return;
        }

        Profesor profesorAnterior = this.profesor;
        this.profesor = nuevoProfesor;

        if (profesorAnterior != null) {
            profesorAnterior.eliminarCursoInterno(this);
        }

        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCursoInterno(this);
        }
    }

    public void mostrarInfo() {
        String nombreProf = (profesor != null) ? profesor.getNombre() : "Sin profesor asignado";
        System.out.println("Curso: [" + codigo + "] " + nombre + " | Responsable: " + nombreProf);
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}