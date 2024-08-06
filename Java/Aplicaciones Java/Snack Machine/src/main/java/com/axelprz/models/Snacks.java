package com.axelprz.models;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Coca Cola", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public static void addSnack(Snack snack){
        snacks.add(snack);
    }

    public static void showSnacks(){
        var invSnacks = "";
        for(var snack : snacks){
            invSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks in Inventory ---");
        System.out.println(invSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
