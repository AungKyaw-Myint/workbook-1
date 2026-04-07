package com.pluralsight;

public class VariableApp {
    static void main() {

        // Step 1
        String favColor="Black";
        short year=2026;
        char middleLetter= 'K';
        boolean havePet= false;
        String message="Keep Working!";

        System.out.println("Fav Color:"+favColor);
        System.out.println("Start Year :"+year);
        System.out.println("Middle Letter:"+middleLetter);
        System.out.println("Having Pet :"+havePet);
        System.out.println("Message :"+message);


        // Step 2
        byte numberOfDays= 7;
        double price=4.99;
        char favLetter= 'A';
        boolean raining= true;

        System.out.printf(
                "Number of days in week %d. The coffee price is $%.2f. My fav letter is %c. Now it is raining %b",
                numberOfDays, price, favLetter, raining
        );

        //
    }
}
