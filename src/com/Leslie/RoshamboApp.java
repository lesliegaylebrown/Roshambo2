package com.Leslie;

import java.util.Scanner;

public class RoshamboApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");

        // ask for user's name
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        //create new HumanPro player
        HumanPro humanPro = new HumanPro(name);
        Schmoe schmoe = new Schmoe("Schmoe");
        JoeBlow joeBlow = new JoeBlowa("Joe");
        String play;
        String foe;

        // ask user to choose a foe
        System.out.println("Who would you like to play against Schmoe or Joe?");
        // assign user input to foe
        foe = scan.next();

        if (foe.equalsIgnoreCase("Schmoe")) {
            RPS(scan, humanPro, schmoe);
        } else if (foe.equalsIgnoreCase("Joe")) {
            RPS(scan, humanPro, joeBlow);
        } else {
            RPS(scan, humanPro, joeBlow);
        }
        System.out.println("Ciao!");
    }


    public static void RPS(Scanner scan, HumanPro humanPro, JoeBlow joeBlow) {
        String play;

        do {
            System.out.println("Rock, paper or scissors?: ");
            String s = scan.next();
            humanPro.generateRoshambo;

            
        } while (play.contains('Y')) || play.contains('y'));


    }
}
