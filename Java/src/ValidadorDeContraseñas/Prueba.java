/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidadorDeContraseñas;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Validador password = new Validador();
        var consola = new Scanner(System.in);
        
        String p;
        String resultado;
        
        boolean condicion = true;
        while(condicion){
            try {
                System.out.println("Ingrese una contraseña: ");
                System.out.println("-Debe tener al menos 8 caracteres de longitud.");
                System.out.println("-Debe contener al menos una letra minúscula, una letra mayúscula y un dígito.");
                System.out.println("-Puede contener caracteres especiales, como !, @, #, $, %, ^, &, *, etc.");
                p = consola.nextLine();
                System.out.println("----------------------------------");

                password.setPassword(p);
                resultado = password.validarPassword();
                System.out.println(resultado);
                if(resultado.equals("Contraseña válida")){
                    condicion = false;
                }
            } catch (Exception e) {
                System.out.println("Error: debe ingresar una cadena");
            }
        }
        consola.close();
    }
}
