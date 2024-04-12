/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CálculodelDígitodeControldelNIF;

public class Digito {
    private int nif;
    private final char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 
        'L', 'C', 'K', 'E'};
    private int resultado;
    
    public void setNIF(int n){
        this.nif = n;
    }
    
    public void calcularDigito(){
        this.resultado = this.nif % 23;
    }
    
    public char getDigito(){
        calcularDigito();
        return this.letras[resultado];
    }
    
}
