
import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        // Leer la matriz
        System.out.println("Ingrese los 12 numeros enteros:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("\nMatriz ingresada:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        // Sumar los elementos de cada fila
        System.out.println("\nSuma de cada fila:");

        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;

            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }

            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        // Sumar los elementos de cada columna
        System.out.println("\nSuma de cada columna:");

        for (int j = 0; j < 4; j++) {
            int sumaColumna = 0;

            for (int i = 0; i < 3; i++) {
                sumaColumna += matriz[i][j];
            }

            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }

        sc.close();
    }
}
