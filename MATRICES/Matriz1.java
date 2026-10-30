import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int suma = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese los valores de la matriz 3x3:");

            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {
                    System.out.printf("Elemento [%d][%d]: ", fila + 1, columna + 1);
                    matriz[fila][columna] = entrada.nextInt();
                }
            }
        }

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }

        System.out.println("La suma total de los elementos de la matriz es: " + suma);
    }
}
