
package OrdenamientodeNúmeros;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (java.util.Scanner consola = new Scanner(System.in)) {
            Numeros n1 = new Numeros();
            
            boolean condicion = true;
            do{
                try {
                    System.out.println("Ingrese los numeros separados por espacios");
                    n1.setNumeros(consola.nextLine());
                    condicion = false;
                } catch (Exception e) {
                    System.out.println("Ingrese los datos solicitados, error: " + e);
                }
            }while(condicion);
        }
    }
}
