
import java.util.Random;
import java.util.Scanner;

public class Matriz5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(20) + 1;
            }
        }

        System.out.println("Matriz generada:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nIngrese el numero que desea buscar: ");
        int numero = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println(
                        "Encontrado en fila " + i +
                        ", columna " + j
                    );
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El numero no se encuentra en la matriz.");
        }

        sc.close();
    }
}
