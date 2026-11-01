package EXCEPCIONES;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepcion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese un numero entero: ");
            int numero = teclado.nextInt();

            System.out.println("Numero ingresado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un numero entero.");
        } finally {
            System.out.println("Fin del programa.");
            teclado.close();
        }
    }
}