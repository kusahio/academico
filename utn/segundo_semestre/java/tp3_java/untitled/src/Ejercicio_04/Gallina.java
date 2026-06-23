package Ejercicio_04;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    //getters
    public int getIdGallina(){ return idGallina; }
    public int getEdad(){ return edad; }
    public int getHuevosPuestos(){return huevosPuestos; }

    //setters
    public void setIdGallina(int idGallina){
        if ( idGallina >= 0) {
            this.idGallina = idGallina;
        } else {
            System.out.println("Error: El id debe no puede ser menor a 0");
        }
    }

    public void setEdad(int edad){
        if ( edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser menor a 0");
        }
    }

    public void setHuevosPuestos(int huevosPuestos){
        if ( huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("Error: La cantidad de huevos puestos debe ser mayor a 0");
        }
    }

    public void ponerHuevo(int cantidad){
        if (cantidad > 0){
            this.huevosPuestos += cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser mayor a 0");
        }
    }

    public void envejecer(){
        this.edad++;
    }

    public void mostrarEstado(){
        System.out.println("ID Gallina: "+idGallina+"\nEdad: "+edad+"\nHuevos puestos: "+huevosPuestos);
    }
}
