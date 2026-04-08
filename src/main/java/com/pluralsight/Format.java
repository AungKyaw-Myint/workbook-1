package com.pluralsight;

public class Format {

    static void main() {

        System.out.println(formatName("John", "Doe"));
        System.out.println(formatName("Michel", "Smith"));
    }

    static String formatName(String firstName, String lastName){

        return lastName+ ", "+ firstName;
    }
}
