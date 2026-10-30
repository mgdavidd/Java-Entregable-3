import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] Numeros = new int[6];
        int aux;

        System.out.println("Ingresa 6 numeros:");

        for (int i = 0; i < Numeros.length; i++) {
            System.out.print((i + 1) + ": ");
            Numeros[i] = sc.nextInt();
        }

        // Invertir el vector
        for (int i = 0; i < Numeros.length / 2; i++) {
            aux = Numeros[i];
            Numeros[i] = Numeros[5 - i];
            Numeros[5 - i] = aux;
        }

        System.out.println("\nVector invertido:");

        for (int i = 0; i < Numeros.length; i++) {
            System.out.println(Numeros[i]);
        }

        sc.close();
    }
}

    

