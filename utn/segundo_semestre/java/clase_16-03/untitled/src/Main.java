import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*int[] numeros = new int[5];

        for (i=0 ; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        for (int num : numeros){
            parImpar(num);
        }*/

        System.out.println("Ingrese un número para ver un día de la semana");
        int dia = Integer.parseInt(sc.nextLine());

        switch (dia){
            case 1:
                System.out.println("es Lunes");
                break;
            default:
                System.out.println("shy");
        }
        sc.close();
    }
}
