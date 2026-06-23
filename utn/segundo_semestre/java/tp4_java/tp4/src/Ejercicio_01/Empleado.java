package Ejercicio_01;

public class Empleado {
    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    //constructor
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        setSalario(salario);
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto){
        this(totalEmpleados + 1, nombre, puesto, 50000);
    }

    //setters
    public void setNombre(String nombre){
        if(nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío");
        }
    }

    public void setPuesto(String puesto){
        if(puesto != null && !puesto.isBlank()){
            this.puesto = puesto;
        } else {
            System.out.println("Error: El puesto no puede estar vacío");
        }
    }

    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Error: El salario debe ser mayor a 0");
        }
    }

    //getters
    public int getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getPuesto(){ return puesto; }
    public double getSalario(){ return salario; }

    public void actualizarSalario(double aumentoPorcetual){
        if (aumentoPorcetual > 0){
            double nuevoSalario = (double) salario * ((aumentoPorcetual / 100.0) + 1);
            this.salario = nuevoSalario;
        } else {
            System.out.println("Error: El porcentaje debe ser mayor a 0");
        }
    }

    public void actualizarSalario(int aumentoFijo){
        if (aumentoFijo > 0){
            this.salario += aumentoFijo;
        } else {
            System.out.println("Error: El monto debe ser mayor a 0");
        }
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("El total de empleados es: "+totalEmpleados);
    }

    @Override
    public String toString() {
        return "Id: "+id
                +"\nNombre: "+nombre
                +"\nPuesto: "+puesto
                +"\nSalario: $"+salario;
    }
}
