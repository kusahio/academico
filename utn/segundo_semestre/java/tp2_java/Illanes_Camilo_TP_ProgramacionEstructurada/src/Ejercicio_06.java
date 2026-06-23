import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo = 0, negativo = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Integer.parseInt(sc.nextLine());

            if (num == 0){
                ceros++;
            } else if (num < 0) {
                negativo++;
            } else {
                positivo++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + ceros);

        sc.close();
    }
}