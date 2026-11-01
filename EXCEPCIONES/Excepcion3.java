package EXCEPCIONES;

public class Excepcion3 {
    public static void main(String[] args) {
        try {
            int[] numeros = {10, 20, 30, 40, 50};

            System.out.println("Numero: " + numeros[8]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La posicion no existe en el vector.");
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}