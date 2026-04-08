package com.pluralsight;

public class CompareNumbers {

    static void main() {

        System.out.println("Is even :"+isEven(6));
        System.out.println("Positive:"+isPositive(-4));
    }

    static boolean isEven(int number){

        if(number % 2 ==0){
            return true;
        }
        return false;

    }

    static boolean isPositive(double number){
        if(number >= 0){
            return true;
        }
        return false;
    }
}
