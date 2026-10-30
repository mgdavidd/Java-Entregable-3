import java.util.Scanner;

public class Ejercicio4 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Paises = {
            "Colombia", "Mexico", "Brasil",
            "Peru", "Chile", "Argentina",
            "España", "Francia", "Italia", "Japon"
        };

        String buscar;
        boolean encontrado = false;

        System.out.print("Ingresa el pais que deseas buscar: ");
        buscar = sc.nextLine();

        for (int i = 0; i < Paises.length; i++) {

            if (Paises[i].equalsIgnoreCase(buscar.trim())) {
                System.out.println("El pais si se encuentra.");
                System.out.println("Indice: " + i);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El pais no se encuentra en el vector.");
        }

        sc.close();
    }
    
}
