package Ejercicio_01;

public class Main {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Kira chan", "Gata de Apoyo");
        Empleado empleado2 = new Empleado(10, "Camilo", "Dev", 1800000);

        //Pruebas de actualizar salario
        empleado1.actualizarSalario(-35.0);
        empleado2.actualizarSalario(-40000);

        //Aumento correcto
        empleado1.actualizarSalario(35.0);
        empleado2.actualizarSalario(40000);
        System.out.println(empleado1);
        System.out.println(empleado2);

        //Pruebas setter
        empleado1.setNombre("");
        empleado1.setPuesto("");
        empleado1.setSalario(-450000);
        empleado2.setNombre("   ");
        empleado2.setPuesto("   ");
        empleado2.setSalario(-60000);

        //Setters correctos
        empleado1.setNombre("Kira");
        empleado1.setPuesto("Gata de apoyo Emocional");
        empleado1.setSalario(650000);
        empleado2.setNombre("Camilo Illanes");
        empleado2.setPuesto("Technical Lead");
        empleado2.setSalario(2000000);

        System.out.println(empleado1);
        System.out.println(empleado2);

        Empleado.mostrarTotalEmpleados();
    }
}
