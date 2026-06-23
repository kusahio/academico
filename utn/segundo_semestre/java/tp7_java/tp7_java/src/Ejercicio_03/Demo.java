package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- DEMO EJERCICIO 3 ---");
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Camilo", 150000, 25000));
        listaEmpleados.add(new EmpleadoTemporal("Mishky", 40, 1800));

        for (Empleado emp : listaEmpleados) {
            System.out.print("Empleado: " + emp.getNombre() + " | Sueldo: $" + emp.calcularSueldo());

            if (emp instanceof EmpleadoPlanta) {
                System.out.println(" -> [Tipo: Planta Permanente]");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println(" -> [Tipo: Contratado Temporal]");
            }
        }
    }
}