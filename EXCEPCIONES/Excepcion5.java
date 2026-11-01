package EXCEPCIONES;

public class Excepcion5 {
    public static void main(String[] args) {
        try {
            String nombre = null;

            System.out.println("Cantidad de letras: " + nombre.length());

        } catch (NullPointerException e) {
            System.out.println("Error: La variable no tiene ningun valor.");
        } finally {
            System.out.println("Fin del programa.");
        }
    }
}