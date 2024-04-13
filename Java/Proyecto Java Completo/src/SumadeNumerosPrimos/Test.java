
package SumadeNumerosPrimos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        NumPrimos num = new NumPrimos();
        boolean condicion = true;
        int n;
        
        do{
            try {
                System.out.print("Ingrese la cantidad de números primos a sumar: ");
                n = Integer.parseInt(consola.nextLine());
                
                long suma = num.sumaPrimerosPrimos(n);
                System.out.println("La suma de los primeros " + n + " números primos es: " + suma);
                condicion = false;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero");
            }
        }while(condicion);
    }
}
