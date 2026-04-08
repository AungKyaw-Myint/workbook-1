package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    static void main() {
        Scanner sc = new Scanner(System.in);

        // Constants
        double DAILY_RATE = 29.99;
        double TOLL_RATE = 3.95;
        double GPS_RATE = 2.95;
        double ROADSIDE_RATE = 3.95;

        // Step 1: User input
        System.out.print("Enter pickup date: ");
        String pickupDate = sc.nextLine();

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Add electronic toll tag? (yes/no): ");
        String toll = sc.nextLine();

        System.out.print("Add GPS? (yes/no): ");
        String gps = sc.nextLine();

        System.out.print("Add roadside assistance? (yes/no): ");
        String roadside = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Step 2: Basic rental cost
        double basicCost = days * DAILY_RATE;

        // Step 3: Options cost
        double optionsCost = 0;

        if (toll.equalsIgnoreCase("yes")) {
            optionsCost += days * TOLL_RATE;
        }

        if (gps.equalsIgnoreCase("yes")) {
            optionsCost += days * GPS_RATE;
        }

        if (roadside.equalsIgnoreCase("yes")) {
            optionsCost += days * ROADSIDE_RATE;
        }

        // Step 4: Underage surcharge
        double underageSurcharge = 0;

        if (age < 25) {
            underageSurcharge = basicCost * 0.30;
        }

        // Step 5: Total cost
        double totalCost = basicCost + optionsCost + underageSurcharge;

        // Step 6: Output
        System.out.println("\n--- Rental Summary ---");
        System.out.printf("Pickup date: %s%n", pickupDate);
        System.out.printf("Rental days: %d%n", days);
        System.out.printf("Basic rental cost: $%.2f%n", basicCost);
        System.out.printf("Options cost: $%.2f%n", optionsCost);
        System.out.printf("Underage surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total cost: $%.2f%n", totalCost);

        sc.close();
    }
}
