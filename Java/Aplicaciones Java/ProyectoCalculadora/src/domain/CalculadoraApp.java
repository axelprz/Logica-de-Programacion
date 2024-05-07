
package domain;

import java.util.Scanner;

public class CalculadoraApp {
    Scanner consola = new Scanner(System.in);
    
    public void MenuCalculadora(){ 
        Operaciones operacion1 = new Operaciones();
        boolean condicion = true;
        
        do{   
            try {
                System.out.println("**** Aplicación Calculadora ****");
                System.out.println("""
                                   1. Suma
                                   2. Resta
                                   3. Multiplicación
                                   4. División
                                   5. Salir
                                   """);
                System.out.println("Operación a realizar? ");
                int operacion = Integer.parseInt(consola.nextLine());

                switch(operacion){
                    case 1 -> {
                        System.out.println("Ingrese el numero 1:");
                        int operando1 = Integer.parseInt(consola.nextLine());

                        System.out.println("Ingrese el numero 2:");
                        int operando2 = Integer.parseInt(consola.nextLine());

                        operacion1.sumar(operando1, operando2);
                    }
                    case 2 -> {
                        System.out.println("Ingrese el numero 1:");
                        int operando1 = Integer.parseInt(consola.nextLine());

                        System.out.println("Ingrese el numero 2:");
                        int operando2 = Integer.parseInt(consola.nextLine());

                        operacion1.restar(operando1, operando2);
                    }
                    case 3 -> {
                        System.out.println("Ingrese el numero 1:");
                        int operando1 = Integer.parseInt(consola.nextLine());

                        System.out.println("Ingrese el numero 2:");
                        int operando2 = Integer.parseInt(consola.nextLine());

                        operacion1.multiplicar(operando1, operando2);
                    }
                    case 4 -> {
                        System.out.println("Ingrese el numero 1:");
                        double operando1 = Integer.parseInt(consola.nextLine());

                        System.out.println("Ingrese el numero 2:");
                        double operando2 = Integer.parseInt(consola.nextLine());

                        if(operando2 == 0){
                            System.out.println("Error: No se puede dividir por 0");
                        }else{
                            operacion1.dividir(operando1, operando2);
                        }
                    }
                    case 5 -> {
                        System.out.println("Saliendo...");
                        condicion = false;
                    }
                    default -> {System.out.println("Opción Incorrecta");}
                }
                
            }catch (NumberFormatException e) {
                System.out.println("Error:" + e); 
            }
        }while(condicion);
    }
}

