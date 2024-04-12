/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradordeSecuenciasFibonacci;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        Generador fibonacci1 = new Generador();
        int n;
        boolean condicion = true;
        
        do{
            try{
                System.out.println("Ingrese un numero: ");
                n = Integer.parseInt(consola.nextLine());
                if(n > 0){
                    fibonacci1.setnumero(n);
                    condicion = true;
                }else{
                    System.out.println("Error: debe ingresar un numero mayor a 0");
                }
            }catch(NumberFormatException e){
                System.out.println("Error: Ingrese un numero entero");
            }
        }while(condicion);
    }
}
