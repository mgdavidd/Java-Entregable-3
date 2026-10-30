
import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];

        System.out.println("Ingrese los 16 numeros enteros:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz original:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", transpuesta[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
