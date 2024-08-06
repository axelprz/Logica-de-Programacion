package com.axelprz.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnacksMachine {
    public static void main(String[] args) {
        snacksMachine();
    }

    public static void snacksMachine() {
        var exit = false;
        var console = new Scanner(System.in);

        List<Snack> products = new ArrayList<>();
        System.out.println("*** Snacks Machine ***");
        Snacks.showSnacks();
        while(!exit){
            try{
                var option = showMenu(console);
                exit = executeOptions(option, console, products);
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }finally {
                System.out.println();
            }
        }
    }

    private static int showMenu(Scanner console) {
        System.out.print("""
                Menu:
                1. Buy snack
                2. Show ticket
                3. Add new snack
                4. Exit
                Choose an option:\s""");
        return Integer.parseInt(console.nextLine());
    }

    private static boolean executeOptions(int option, Scanner console, List<Snack> products) {
        var exit = false;
        switch(option){
            case 1 -> buySnack(console, products);
            case 2 -> showTicket(products);
            case 3 -> addSnack(console);
            case 4 -> {
                System.out.println("Bye!");
                exit = true;
            }
            default -> System.out.println("Invalid option: " + option);
        }
        return exit;
    }

    private static void buySnack(Scanner console, List<Snack> products) {
        System.out.println("What snack do you want to buy? (id)");
        var id = Integer.parseInt(console.nextLine());

        var foundSnack = false;
        for(var snack : Snacks.getSnacks()){
            if(snack.getId() == id){
                products.add(snack);
                System.out.println("Snack bought successfully: " + snack);
                foundSnack = true;
                break;
            }
        }
        if(!foundSnack){
            System.out.println("Snack not found with id: " + id);
        }
    }

    private static void showTicket(List<Snack> products) {
        var ticket = "*** Sales receipt ***";
        var total = 0.0;
        for(var snack : products){
            ticket += "\n\t- " + snack.getName() + " - $" + snack.getPrice();
            total += snack.getPrice();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void addSnack(Scanner console) {
        System.out.print("Snack name: ");
        var name = console.nextLine();
        System.out.print("Snack price: ");
        var price = console.nextDouble();
        Snacks.addSnack(new Snack(name, price));
        System.out.println("Snack added successfully!");
        Snacks.showSnacks();
    }
}
