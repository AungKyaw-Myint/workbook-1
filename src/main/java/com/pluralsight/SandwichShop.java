package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    static void main() {


        Scanner sc= new Scanner(System.in);

        double regularPrice=5.45;
        double largePrice=8.95;

        double cost=0;

        int sandwichOption=0;
        System.out.println("Chose the size: \n"+
                            "\t 1: Regular: base price $5.45 \n"+
                            "\t 2: Large: base price $8.95 \n");
        sandwichOption=sc.nextInt();
        sc.nextLine();

        if(sandwichOption ==1){
            cost=regularPrice;
        } else if (sandwichOption==2) {
            cost=largePrice;
        }

        String loaded = null;
        double regularLoaded=1.00;
        double largeLoaded=1.75;
        System.out.println("Would you added loaded? (yes/no): \n"+
                "\t Regular: $1.00 \n"+
                "\t Large: $1.75 \n");
        loaded=sc.nextLine();

        if(loaded.equalsIgnoreCase("yes")){
            if(sandwichOption == 1){
                cost+=regularLoaded;
            }else if (sandwichOption==2) {
                cost+=largeLoaded;
            }
        }

        int age=0;
        System.out.println("How old are you?");
        age=sc.nextInt();

        double discountAmt=0;
        if(age <= 17){
            discountAmt= cost * 0.10;
            System.out.printf("Cost with 10%% discount $%.2f :\n", (cost-discountAmt));
        } else if (age >=65) {
            discountAmt=cost * 0.20;
            System.out.printf("Cost with 20%% discount $%.2f :\n", (cost-discountAmt));
        }else{
            System.out.printf("Cost with No discount $%.2f \n", (cost-discountAmt));
        }
    }
}
