package com.pluralsight;

public class Menu {

    static void main() {


        displayMenu();
        displayMenu();
    }

    static void displayMenu(){
        System.out.println("=== MENU ===\n" +
                "\t1. Coffee - $3.99 \n" +
                "\t2. Tea - $2.99 \n" +
                "\t3. Cookie - $1.99 \n");
    }
}
