import java.util.Scanner;

public class Ejercicio_02 {
    public static Scanner sc = new Scanner(System.in);
    /*
     * Ingresar datos Double
     * Validar rango
     * Llenar matriz 3x6
     * Calcular promedio por día (linea)
     * Determianr máximo en toda la matriz
     * */

    //Ingreso de datos Double
    public static double leerValor(){
        double valor;
        while (true) {
            try {
                valor = Double.parseDouble(sc.nextLine());
                if (isValidValue(valor)) {
                    return valor;
                } else {
                    System.out.print("Error: La temperatura debe estar entre -50 y 100. Intente de nuevo: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Error: Ingrese un número válido: ");
            }
        }
    }
    public static boolean isValidValue(double valor){
        return (valor >= -50 && valor <= 100);
    }

    public static void cargarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese temperatura para el Día " + (i + 1) + ", Lectura " + (j + 1) + ": ");
                matriz[i][j] = leerValor();
            }
        }
    }

    public static double calcularPromedioDia(double[] dia) {
        double suma = 0;
        for(int i=0; i <= dia.length; i++){
            suma += dia[i];
        }
        return suma / dia.length;
    }


    public static void determinarMaximo(double[][] matriz) {
        final double MIN_VALUE = -50;
        double max = MIN_VALUE;
        int diaMax = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    diaMax = i + 1;
                }
            }
        }
        System.out.println("La temperatura máxima absoluta fue: " + max + "°C el Día " + diaMax);
    }
}
