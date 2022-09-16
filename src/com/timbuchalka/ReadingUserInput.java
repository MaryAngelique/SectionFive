package com.timbuchalka;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        // handles next line character

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2022 - birthYear;

        System.out.println("Your name is " + name + ", and you are " + age + "years old");

        scanner.close();

    }

}
