package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) { this.profesores.add(p); }
    public void agregarCurso(Curso c) { this.cursos.add(c); }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor prof = buscarProfesorPorId(idProfesor);

        if (curso != null) {
            curso.setProfesor(prof);
            if (prof != null) {
                System.out.println("Asignado exitosamente: " + prof.getNombre() + " dictará " + curso.getNombre());
            } else {
                System.out.println("Se quitó el profesor del curso " + curso.getNombre());
            }
        } else {
            System.out.println("Error: No se encontró el curso con código " + codigoCurso);
        }
    }

    public void listarProfesores() {
        System.out.println("\n--- Lista de Profesores (" + nombre + ") ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\n--- Lista de Cursos (" + nombre + ") ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null);
            cursos.remove(c);
            System.out.println("Curso [" + codigo + "] eliminado de la universidad.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            List<Curso> copiaCursos = new ArrayList<>(p.getCursos());
            for (Curso c : copiaCursos) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor con ID " + id + " removido de la institución.");
        }
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTES: Cantidad de cursos por Profesor ===");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " curso(s).");
        }
    }
}