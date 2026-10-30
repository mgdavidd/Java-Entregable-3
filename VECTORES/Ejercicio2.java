import java.util.Scanner;

public class Ejercicio2 {

   public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        double[] Numeros = new double[8];
        double mayor=Numeros[0];
        double menor=Numeros[0];
        double posicionMe=0;
        double posicionMa=0;


         System.out.println("Por favor, ingresa 8 números:");

           for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = sc.nextDouble();


          if (i == 0) {
           mayor = Numeros[i];
           menor = Numeros[i];
           }
            if(Numeros[i]> mayor){
                mayor=Numeros[i];
                posicionMa=i;
            }

             if(Numeros[i]< menor){
                menor=Numeros[i];
                posicionMe=i;
            }

        }

        System.out.println("El numero mayor es: "+mayor);
        System.out.println("La posicion del mayor es: "+posicionMa);
        System.out.println("El numero menor es: "+menor);
        System.out.println("La posicion del menor es: "+posicionMe);

    sc.close();
   }
}
