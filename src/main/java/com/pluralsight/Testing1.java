package com.pluralsight;

import java.util.Scanner;

public class Testing1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to USAA ATM ===");
        System.out.println("Wat is your name?");
        String name = scanner.nextLine();

        int correctPin = 1234; // Simulated PIN (normally from a database)
        double balance =900000;

        int attempts = 3;
        int enteredPin = 0;
        while(attempts > 0 && enteredPin != correctPin) {
            System.out.print("Please enter your PIN: ");
            enteredPin = scanner.nextInt();
            if (enteredPin == correctPin) {

                System.out.println(name + " Access granted. Welcome!" + "Your balance is " + balance);

                System.out.println("Pick an option:");
                System.out.println("1. Balance");
                System.out.println("2. Withdraw 100 dollars");
                System.out.println("3. Deposit Amount");

                byte optionAction= scanner.nextByte();

                if(optionAction==1){
                    System.out.printf("Your balance is %,.2f.\n", balance);
                }else if (optionAction ==2){
                    if(balance>=100) {
                        balance -= 100;
                        System.out.println("Successfully withdraw $100.");
                    }else{
                        System.out.println("Insufficient Amount.");
                    }
                }else if(optionAction==3){
                    System.out.print("Enter your deposit amount:");
                    double depositAmt= scanner.nextDouble();
                    balance += depositAmt;

                    System.out.println("Deposit "+depositAmt+ " successfully. Your balance is :"+balance);
                }
            }else {
                System.out.println(name + " Access denied. Incorrect PIN.");
                attempts--;
                System.out.println("You only have " + attempts + "attempts left");
            }

        }

        scanner.close();
    }
}
