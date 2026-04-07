package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    static void main() {

        Scanner sc= new Scanner(System.in);

        int firstNo;
        int secNo;
        char action;

        System.out.println("Enter the first no:");
        firstNo= sc.nextInt();

        System.out.println("Enter the second no:");
        secNo= sc.nextInt();

        System.out.println("Possible calculations :\n" +
                            "\t (A)dd \n"+
                            "\t (S)ubtract \n"+
                            "\t (M)ultiply \n"+
                            "\t (D)ivide \n");

        System.out.println(firstNo + " * " + secNo + " = "+firstNo*secNo);
    }
}
