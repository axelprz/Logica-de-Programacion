/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraDeFactorial;

/**
 *
 * @author axelp
 */
public class Factorial {
    private int n;
    private int y;
    private int resultado;
    
    public void numero(int x){
        n = x;
    }
    
    public void calcularFactorial(){
        y = n - 1;
        resultado = n * y;
        while(y > 1){
            resultado *= --y;
        }
    }
    
    public int getFactorial(){
        return resultado;
    }
}
