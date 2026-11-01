package EXCEPCIONES;

public class Excepcion1 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}