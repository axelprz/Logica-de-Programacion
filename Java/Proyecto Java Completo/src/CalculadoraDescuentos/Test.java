/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraDescuentos;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Calculadora miDescuento = new Calculadora();
        try (java.util.Scanner consola = new Scanner(System.in)) {
            boolean condicion = true;
            while(condicion){
                try {
                    System.out.println("Ingrese el precio original: ");
                    double precio = Double.parseDouble(consola.nextLine());
                    System.out.println("Ingrese el descuento a aplicar: ");
                    double descuento = Double.parseDouble(consola.nextLine());
                    
                    if(descuento < 0 || descuento > 100){
                        System.out.println("Ingrese un descuento válido");
                    }else{
                    miDescuento.setDatos(precio, descuento);
                    miDescuento.calcularPrecio();
                    System.out.println("El precio final es: " + miDescuento.getPrecio());
                    condicion = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar numeros, error: " + e);
                }
            }
        }
    }
}
