package com.timbuchalka;

import java.util.Scanner;

public class MinAndMaxChallenge {
//  -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//  -Before the user enters the number, print the message ÅgEnter number:Åh
//  -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//            Hint:
//            -Use an endless while loop.
//
//            Bonus:
//            -Create a project with the name MinAndMaxInputChallenge.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {


            } else {

            }

            scanner.nextLine(); // handle input
        }

        scanner.close();

    }
}
