/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidacióndePalindromos;


public class Palindromo {
    private String palabra;
    
    public void setPalabra(String p){
        this.palabra = p;
        formatearPalabra();
    }
    
    private void formatearPalabra(){
        String palabraFormateada = this.palabra.replace(" ", "").toLowerCase();
        comprobarPalabra(palabraFormateada);
    }
    
    private void comprobarPalabra(String p){
        String palabraInvertida = "";
        for(int i = p.length() - 1; i >= 0; i--){
            palabraInvertida += p.charAt(i);
        }
        
        if(palabraInvertida.equals(p)){
            System.out.println("La palabra '" + this.palabra + "' es un palíndromo");
        }else{
            System.out.println("La palabra '" + this.palabra + "' no es un palíndromo");
        }
    }
}
