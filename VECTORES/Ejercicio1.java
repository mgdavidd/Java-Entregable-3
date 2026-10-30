import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int[] Numeros = new int[10];
        int suma=0;

          
        System.out.println("Por favor, ingresa 10 números:");
        
        // 3. Bucle para pedir los datos y guardarlos en el array
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            Numeros[i] = sc.nextInt();
            suma+=Numeros[i];

        }
        double promedio = suma / Numeros.length;

        System.out.println("Suma Total: "+suma);
        System.out.println("Promedio: "+promedio);

        sc.close();

    }
}