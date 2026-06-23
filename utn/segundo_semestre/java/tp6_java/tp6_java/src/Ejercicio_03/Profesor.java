package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String specialty; // especialidad [cite: 169]
    private List<Curso> cursos; // Colección de cursos que dicta [cite: 169, 171]

    public Profesor(String id, String nombre, String specialty) {
        this.id = id;
        this.nombre = nombre;
        this.specialty = specialty;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (c != null) {
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    protected void agregarCursoInterno(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    protected void eliminarCursoInterno(Curso c) {
        cursos.remove(c);
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  (Ninguno actualmente)");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("  - [" + c.getCodigo() + "] " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | Especialidad: " + specialty + " | Cant. Cursos: " + cursos.size() + " (ID: " + id + ")");
    }

    @Override
    public String toString() {
        return nombre;
    }
}