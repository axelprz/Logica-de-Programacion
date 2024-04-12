/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidacióndePalindromos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String palabra;
        var consola = new Scanner(System.in);
        Palindromo p1 = new Palindromo(); 
        
        try {
            System.out.println("Ingrese una palabra: ");
            palabra = consola.nextLine();
            p1.setPalabra(palabra);
        } catch (Exception e) {
            System.out.println("Datos incorrectos, error: " + e);
        }
    }
}
