package com.axelprz.models;

import java.io.Serializable;

public class Snack implements Serializable {
    private static int snackCounter = 0;
    private final int idSnack;
    private String name;
    private double price;

    public Snack(){
        this.idSnack = ++Snack.snackCounter;
    }

    public Snack(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return idSnack;
    }

    public static int getSnackCounter() {
        return snackCounter;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Snack snack = (Snack) o;
        return Double.compare(price, snack.price) == 0 && idSnack == snack.idSnack && name.equals(snack.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + idSnack;
        return result;
    }
}
