package Ejercicio_03;

public class Main {
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN Mendoza");

        Profesor p1 = new Profesor("M1", "Carlos Pérez", "Bases de Datos");
        Profesor p2 = new Profesor("M2", "Ana Martínez", "Programación Orientada a Objetos");
        Profesor p3 = new Profesor("M3", "Jorge Rodríguez", "Matemáticas");

        Curso c1 = new Curso("POO2", "Programación II");
        Curso c2 = new Curso("BD1", "Base de Datos I");
        Curso c3 = new Curso("ED", "Estructuras de Datos");
        Curso c4 = new Curso("AM1", "Análisis Matemático I");
        Curso c5 = new Curso("AG", "Álgebra Geométrica");

        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        System.out.println("=== 3. Realizando Asignaciones Iniciales ===");
        utn.asignarProfesorACurso("POO2", "M2");
        utn.asignarProfesorACurso("BD1", "M1");
        utn.asignarProfesorACurso("ED", "M2");
        utn.asignarProfesorACurso("AM1", "M3");
        utn.asignarProfesorACurso("AG", "M3");

        utn.listarCursos();
        System.out.println("\n--- Cursos cruzados desde el lado del Profesor ---");
        p2.listarCursos();

        System.out.println("\n=== 5. Cambiando de profesor: pasar 'Estructuras de Datos' de Ana(M2) a Carlos(M1) ===");
        utn.asignarProfesorACurso("ED", "M1");

        System.out.println("\n--- Verificación post-cambio ---");
        p2.listarCursos();
        p1.listarCursos();

        System.out.println("\n=== 6. Eliminando el curso 'Base de Datos I' ===");
        utn.eliminarCurso("BD1");
        p1.listarCursos();

        System.out.println("\n=== 7. Eliminando al profesor Jorge Rodríguez(M3) ===");
        utn.eliminarProfesor("M3");
        utn.listarCursos();

        utn.mostrarReporteCursosPorProfesor();
    }
}
