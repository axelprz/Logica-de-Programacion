/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradordeSecuenciasFibonacci;

public class Generador {
    private int n;
    private int num1 = 0;
    private int num2 = 1;
    
    public void setnumero(int numero){
        n = numero;
        generadorFibonacci();
    }
    
    private void generadorFibonacci(){
        System.out.println("Los primeros " + n + " números de la secuencia fibonacci son: ");
        for(int i = 2; i < n; i++){
            int temp = num1 + num2;
            System.out.println(temp);
            num1 = num2;
            num2 = temp;
        }
    }
}


