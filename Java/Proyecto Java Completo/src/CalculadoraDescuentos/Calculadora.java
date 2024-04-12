/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraDescuentos;


public class Calculadora {
    private double precioOriginal;
    private double descuento;
    private double resultado;
    
    public void setDatos(double p, double d){
        precioOriginal = p;
        descuento = d;
    }
    
    public void calcularPrecio(){
        resultado = precioOriginal - ((descuento * precioOriginal) / 100);
    }
    
    public double getPrecio(){
        return resultado;
    }
}
