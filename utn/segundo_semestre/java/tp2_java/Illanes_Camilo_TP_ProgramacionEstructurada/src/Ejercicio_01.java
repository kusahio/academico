import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(sc.nextLine());

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.print("El año "+anio+" es bisiesto");
        } else {
            System.out.print("El año "+anio+" no es bisiesto");
        }

        sc.close();
    }
}