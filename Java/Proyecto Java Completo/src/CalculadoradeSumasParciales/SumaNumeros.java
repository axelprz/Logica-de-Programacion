/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoradeSumasParciales;

public class SumaNumeros {

    private int suma;
    private int y = 1;

    public void SumaDeNumeros(int x) {
       while(y <= x){
           suma += y++;
           System.out.println("El reslutado de la suma es: " + suma);
       }
    }
    
    public int getSumaTotal(){
        return suma;
    }
}
