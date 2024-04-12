/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoradeSumasParciales;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        SumaNumeros sumar = new SumaNumeros();
        var consola = new Scanner(System.in);
        
        int numero;
        
        boolean condicion = true;
        while(condicion){
            try {
                System.out.println("Ingresa un número:");
                numero = Integer.parseInt(consola.nextLine());
                if (numero <= 0) {
                    System.out.println("El numero debe ser mayor a 0");
                }else{
                    sumar.SumaDeNumeros(numero);
                    System.out.println("El resultado final es: " + sumar.getSumaTotal());
                    condicion = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero entero");
            } finally{
                consola.close();
            }
        }
    }
}
