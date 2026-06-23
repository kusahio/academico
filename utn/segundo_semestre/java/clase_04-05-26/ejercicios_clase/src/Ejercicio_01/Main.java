package Ejercicio_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Utils.ingresarEstudiante(sc);
        Utils.mostrarAprobados();
        Utils.mostrarTodos();
    }
}