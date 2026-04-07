package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    static void main() {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

        System.out.print("Enter pay rate: ");
        double rate = sc.nextDouble();

        // Calculation
        double grossPay = hours * rate;

        // Output
        System.out.printf("Employee: %s\nGross Pay: $%.2f", name, grossPay);

        sc.close();
    }
}
