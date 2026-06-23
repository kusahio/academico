package Ejercicio_12;

public class Main {
    public static void main(String[] args) {
        Contribuyente ciudadano = new Contribuyente("Juan Nieves", "26-12345678-9");

        Impuesto impuestoInmobiliario = new Impuesto(10000.80, ciudadano);

        Calculadora calculadoraFiscal = new Calculadora();

        calculadoraFiscal.calcular(impuestoInmobiliario);
    }
}