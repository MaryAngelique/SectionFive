package com.timbuchalka;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - birthYear;

    }

}