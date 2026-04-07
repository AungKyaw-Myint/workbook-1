package com.pluralsight;

public class Reciept {

    // step 3
    public static void main(String[] args) {

        String name= "Mango";
        double price= 5.40;
        int quantity= 10;

        System.out.printf(
                "You bough %d %s for %.2f",
                quantity, name,  price * quantity);

    }
}
