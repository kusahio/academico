package Ejercicio_07;

public class Main {
    public static void main(String[] args) {
        Motor motorV6 = new Motor("2.0 Cuantico V6", "FRN-7799887HH");

        Vehiculo miAuto = new Vehiculo("CJ-111-ID", "Ford Mustang", motorV6);

        Conductor conductor = new Conductor("Juan Manuel", "LIC-45678");

        miAuto.setConductor(conductor);

        System.out.println("Vehículo registrado: " + miAuto.getModelo() + " [Patente: " + miAuto.getPatente() + "]");
        System.out.println("Motor del Vehículo: " + miAuto.getMotor().getTipo() + " (S/N: " + miAuto.getMotor().getNumeroSerie() + ")");

        System.out.println("¿Quién conduce el auto?: " + miAuto.getConductor().getNombre());
        System.out.println("¿Qué auto maneja el conductor?: " + conductor.getVehiculo().getModelo() + " con patente " + conductor.getVehiculo().getPatente());
    }
}