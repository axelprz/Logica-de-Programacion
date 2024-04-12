/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CálculodelDígitodeControldelNIF;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (java.util.Scanner consola = new Scanner(System.in)) {
            Digito dig = new Digito();
            String nif;
            
            boolean condicion = true;
            do{
                try{
                    System.out.println("Ingresa tu NIF:");
                    nif = consola.nextLine();
                    
                    if(nif.length() == 8){
                    dig.setNIF(Integer.parseInt(nif));
                    condicion = false;
                    }else{
                        System.out.println("El NIF debe contener 8 números");
                    }
                }
                catch(NumberFormatException e){
                    System.out.println("Debe ingresar numeros, error: " + e);
                }
            }while(condicion);
            
            System.out.println("El digito de control de su NIF es: " + dig.getDigito());
        }
    }
}
