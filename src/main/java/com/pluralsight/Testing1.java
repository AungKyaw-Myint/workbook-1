package com.pluralsight;

public class Testing1 {
    static void main() {
        String sandwichType = "regular";
        double regular = 5.45;
        double large =8.95;
        int  age =88;
        double price;
        //step
        if (sandwichType.equals("large")) {

            price = regular;

        } else {

            price = large;

            //step2  checking discount
            if (age <= 17) {
                price = price * 0.90; //10 % discount
                System.out.println("Here is 10% discount!");
            } else if (age >= 65) {
                price = price * 0.80;//20% discount
                System.out.println("Here is 20% discount!");
            }

        }



        System.out.println("Your total is: "+"$" +price);
    }
}
