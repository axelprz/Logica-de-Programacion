/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraDeFactorial;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int numero;
        
        Factorial calculadora = new Factorial();
        var consola = new Scanner(System.in);
        
        boolean condicion = true;
        while(condicion){
            try {
                System.out.println("Ingresa un número: ");
                numero = Integer.parseInt(consola.nextLine());
                if(numero < 1){
                    System.out.println("El número debe ser mayor a 0");
                }else{
                    calculadora.numero(numero);
                    calculadora.calcularFactorial();
                    System.out.println("El resultado es: " + calculadora.getFactorial());
                    condicion = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número entero");
            }
        }
        consola.close();
    }
}
