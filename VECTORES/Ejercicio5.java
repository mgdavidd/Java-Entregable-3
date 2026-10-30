
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Estudiantes = new String[5];
        double[] Notas = new double[5];

        double suma = 0;
        double promedio;

        System.out.println("REGISTRO DE ESTUDIANTES");

        // Ingresar nombres
        for (int i = 0; i < Estudiantes.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            Estudiantes[i] = sc.nextLine();
        }

        // Ingresar calificaciones
        System.out.println("\nINGRESO DE CALIFICACIONES");

        for (int i = 0; i < Notas.length; i++) {
            System.out.print("Nota de " + Estudiantes[i] + ": ");
            Notas[i] = sc.nextDouble();

            suma += Notas[i];
        }

        // Calcular promedio
        promedio = suma / Notas.length;

        System.out.println("\nPromedio general: " + promedio);

        // Mostrar estudiantes con nota igual o superior
        System.out.println("\nEstudiantes con nota igual o superior al promedio:");

        for (int i = 0; i < Notas.length; i++) {

            if (Notas[i] >= promedio) {
                System.out.println(Estudiantes[i] + " - " + Notas[i]);
            }
        }

        sc.close();
    }
}
