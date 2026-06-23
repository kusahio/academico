import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = Integer.parseInt(sc.nextLine());

        while (numero != 0) {
            if (numero % 2 == 0){
                suma += numero;
            } else {
                System.out.println("Debe ingresar un número par");
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());
        }

        System.out.println("La suma de los números pares es: " + suma);

        sc.close();
    }
}