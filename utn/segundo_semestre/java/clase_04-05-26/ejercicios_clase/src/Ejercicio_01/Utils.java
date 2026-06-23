package Ejercicio_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    private static String validarNombre(Scanner sc){
        while(true){
            System.out.println("Ingresa el nombre del estudiante: ");
            String nombre = sc.nextLine();
            if (nombre != null && !nombre.isBlank()){
                return nombre;
            } else {
                System.out.println("El nombre no puede estar vacío");
            }
        }
    }

    private static int validarEdad(Scanner sc){
        while(true){
            System.out.println("Ingresa la edad del estudiante: ");
            String input = sc.nextLine().trim();

            if (input == null || input.isBlank()) {
                System.out.println("No puedes ingresar una edad vacía");
                continue;
            }

            int edad = Integer.parseInt(input);

            if (edad >= 0){
                return edad;
            } else {
                System.out.println("La edad no puede ser menor a 0");
            }

        }
    }

    private static double validarNota(Scanner sc){
        while(true){
            System.out.println("Ingresa una nota (Ej: 7.0)");
            String input = sc.nextLine().trim();

            if (input == null || input.isBlank()) {
                System.out.println("No puedes ingresar una nota vacía");
                continue;
            }

            double nota = Double.parseDouble(input);
            if (nota > 0 && nota <= 10){
                return nota;
            } else {
                System.out.println("La nota no puede ser menor a 0");
            }

        }
    }

    private static void ingresarNotas(Scanner sc, Estudiante estudiante){
        boolean continuar = true;

        while(continuar){
            double nota = validarNota(sc);
            estudiante.agregarNota(nota);

            System.out.println("¿Agregar otra nota? (si/no)");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("no") || respuesta.equals("n")){
                continuar = false;
            }
        }
    }

    public static void ingresarEstudiante(Scanner sc){
        boolean continuar = true;

        do{
            String nombre = validarNombre(sc);
            int edad = validarEdad(sc);
            Estudiante nuevoEstudiante = new Estudiante(edad, nombre);
            ingresarNotas(sc, nuevoEstudiante);

            System.out.println("¿Deseas agregar otro estudiante? (si/no)");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("no") || respuesta.equals("n")){
                continuar = false;
            }
        }
        while(continuar);
    }

    public static void mostrarAprobados(){
        ArrayList<Estudiante> aprueban = Estudiante.estudiantesAprobados();

        System.out.println("Estudiantes Aprobados:\n");

        if (aprueban == null || aprueban.isEmpty()){
            System.out.println("No hay estudiantes aprobados");
        } else {
            for (Estudiante estudiante : aprueban){
                System.out.println("----------------------------------");
                System.out.println("Nombre del Estudiante: "+estudiante.getNombre());
                System.out.println("Promedio del estudiante: "+estudiante.calcularPromedio());
                System.out.println("----------------------------------\n");
            }
        }
    }

    public static void mostrarTodos(){
        ArrayList<Estudiante> lista = Estudiante.getListaEstudiantes();

        if (lista == null || lista.isEmpty()){
            System.out.println("No hay estudiantes para mostrar");
        } else {
            for (Estudiante estudiante : lista) {
                System.out.println("----------------------------------");
                System.out.println(estudiante);
                System.out.println("----------------------------------\n");
            }
        }
    }
}
