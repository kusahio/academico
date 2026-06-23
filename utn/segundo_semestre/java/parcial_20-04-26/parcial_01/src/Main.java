import Curso.Curso;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso(1, "Curso de Jabón", 40, 35000.0);
        Curso curso2 = new Curso("Curso de \"Cómo sobrevivir en Argentina y no morir en el intento\"", 30);
        Curso curso3 = new Curso("Curso de \"Cómo sobrevivir a puro mate cocido\"", 50);

        //Mostrar cursos creados
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        //Actualizar precios a curso1 y curso2
        curso1.actualizarPrecio(30.5);
        curso2.actualizarPrecio(10000);

        //Mostrar total de cursos
        Curso.mostrarTotalCursos();

        //Pruebas con datos inválidos
        Curso test1 = new Curso(0, " ", 0, -10);
        Curso test2 = new Curso(" ", -10);

        //Mostrar creados con valores por defecto cuando datos son inválidos
        System.out.println(test1);
        System.out.println(test2);

        Curso.mostrarTotalCursos();
    }
}
