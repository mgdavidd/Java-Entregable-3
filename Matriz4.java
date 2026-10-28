
import java.util.Random;

public class Matriz4 {

    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }

        System.out.println("\nSuma de la diagonal principal: " + suma);
    }
}
