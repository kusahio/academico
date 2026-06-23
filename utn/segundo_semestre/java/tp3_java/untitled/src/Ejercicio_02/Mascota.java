package Ejercicio_02;

import org.w3c.dom.ls.LSOutput;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    //getters
    public String getNombre(){return nombre;}
    public String getEspecie(){return especie;}
    public int getEdad(){return edad;}

    //setters
    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank()){
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
        }
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.isBlank()){
            this.especie = especie;
        } else {
            System.out.println("Error: Especie no puede estar vacío");
        }
    }

    public void setEdad(int edad){
        if (edad >= 0){
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser menor a 0");
        }
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nEspecie: "+especie);
    }

    public void cumplorAnios(int anio){
        String cantiadAnios = edad <= 1 ? "año" : "años";
        if ( anio > 0 ){
            this.edad++;
            System.out.println("Felicidades a "+nombre+" por cumplir un año más! Felices "+edad+" "+cantiadAnios);
        } else {
            System.out.println("Error: No puedes sumar un negativo a la edad de tu mascota");
        }
    }
}
