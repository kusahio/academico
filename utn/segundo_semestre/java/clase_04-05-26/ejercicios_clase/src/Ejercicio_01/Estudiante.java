package Ejercicio_01;

import java.util.ArrayList;

public class Estudiante {
    private int edad;
    private ArrayList<Double> notas;
    private String nombre;
    private static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public Estudiante(int edad, String nombre){
        setNombre(nombre);
        setEdad(edad);
        this.notas = new ArrayList<>();

        listaEstudiantes.add(this);
    }

    //getters
    // public int getEdad(){ return edad; }
    // public ArrayList<Double> getNotas(){ return notas; }
    public String getNombre(){ return nombre; }

    //setters
    public void setEdad(int edad){
        if (edad < 0){
            throw new IllegalArgumentException("La edad no puede ser menor a 0");
        }
        this.edad = edad;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre de estudiante no puede ser vacío");
        }
    }

    public void agregarNota(double nota){
        if (nota < 0){
            throw new IllegalArgumentException("La nota no puede ser menor a 0");
        }
        this.notas.add(nota);
    }

    public double calcularPromedio(){
        if (notas.isEmpty()){
            return 0.0;
        }

        double suma = 0.0;

        for(double nota : notas){
            suma += nota;
        }

        return (double) suma / notas.size();
    }

    public static ArrayList<Estudiante> estudiantesAprobados(){
        ArrayList<Estudiante> aprueban = new ArrayList<>();

        for (Estudiante estudiante : listaEstudiantes){
            if (estudiante.calcularPromedio() >= 6.0){
                aprueban.add(estudiante);
            }
        }

        return aprueban;
    }

    public static ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Estudiante:"
                +"\nNombre = " + nombre
                +"\nEdad = " + edad
                +"\nNotas = " + notas;
    }
}
