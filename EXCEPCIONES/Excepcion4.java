package EXCEPCIONES;

public class Excepcion4 {
    public static void main(String[] args) {
        try {
            String texto = "Hola";

            int numero = Integer.parseInt(texto);

            System.out.println("Numero convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir el texto a numero.");
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}