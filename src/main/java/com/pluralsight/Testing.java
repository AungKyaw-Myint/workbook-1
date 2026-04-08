package com.pluralsight;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Testing {

    static void main() {
//        LocalDate birthday = LocalDate.of(1999, 5, 15);
//
//        System.out.println("Birthday: " + birthday);

        //  STRING (text)

        String name = "Aung"; // Stores text (letters, words, sentences)
//  INTEGER (whole numbers)
        int age = 29; // Stores whole numbers (no decimals)
// DOUBLE (decimal numbers)
        double height = 5.9; // Stores decimal numbers (high precision)
// FLOAT (decimal numbers, less precise)
        float weight = 100.05f; // Also decimals, but less precise than double (note the 'f')
//  LONG (large numbers)

        long bankBalance = 3000_000_000L; // Used for very large numbers (note the 'L')
// SHORT (smaller numbers)
        short temperature = 30; // Smaller range than int (rarely used)
//  BYTE (very small numbers)
        byte level = 10; // Very small numbers (-128 to 127)
//  BOOLEAN (true/false)
        boolean isStudent = true; // Stores only true or false values
// CHAR (single character)
        char grade = 'A'; // Stores one single character (use single quotes!)
// LOCALDATE (date - perfect for birthdays)
        LocalDate birthday = LocalDate.of(1999, 10, 15); // Stores a date (year, month, day)


        System.out.printf("My name is %s. Currently %d years old. Both of the weight and heigh are %.2f lb and %.1f inches. \n",
                name,age,weight,height);

        System.out.printf("Right now I am a %b student possessing  %,d amounts in bank. It is really hot right now. Temperature in %d degree C, hot level in %d. \n",
                isStudent, bankBalance, temperature, level);

        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedMoney = formatter.format(bankBalance);
        System.out.println("My bank balance is " + formattedMoney);
        System.out.println(String.format("My bank balance is $%,d", bankBalance));
    }

}