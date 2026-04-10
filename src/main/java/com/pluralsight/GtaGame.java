package com.pluralsight;

import java.util.Scanner;

public class GtaGame {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;
        String choice;

        System.out.print("Enter character name :");
        String name=scanner.nextLine();

        System.out.println("Welcome to GTA Night Run, "+name);
        System.out.println("You wake up in a dark alley...");
        while (playing){
            choice=getInput(scanner, "steal car", "walk away", "rob bank");
            if(choice.equalsIgnoreCase("steal car")){
                choice=getInput(scanner, "hit the people", "hit the car", "drive fast");
                System.out.println("Police is chasing case of "+choice);
                choice=getInput(scanner, "stop the car", "drive faster", "fight the police");
                if(choice.contains("stop") || choice.contains("fight")){
                    System.out.println("You are arrested!");
                    playing=false;
                }else{
                    System.out.println("You escaped case of "+choice);
                }
            }else if(choice.equalsIgnoreCase("walk away") || choice.equalsIgnoreCase("rob bank")){
                if(choice.equalsIgnoreCase("walk away")) {
                    choice = getInput(scanner, "hit the people", "kick the parking car", "steal bicycle");
                    System.out.println("Police is chasing case of " + choice);
                } else if (choice.equalsIgnoreCase("rob bank")) {
                    choice=getInput(scanner, "hit the people", "steal money","shoot the people");
                    System.out.println("Police is coming case of "+choice);
                }
                choice=getInput(scanner, "run away", "stop", "keep doing");
                if(choice.contains("stop") || choice.contains("keep")){
                    System.out.println("You are arrested!");
                    playing=false;
                }else{
                    System.out.println("You escaped case of "+choice);
                }
            }else {

            }

        }
    }

    static String getInput(Scanner sc, String option1, String option2, String option3){
        System.out.println("What do you do?");
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. ??? (your choice)");
        return sc.nextLine();
    }
}
