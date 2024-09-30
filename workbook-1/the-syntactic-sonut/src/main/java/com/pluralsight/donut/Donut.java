package com.pluralsight.donut;
// we LOVE our delimiters!!!
//We like our indention

import java.util.Scanner;

public class Donut {
    static double price = .25;

    static double getTotal(int numberOfDonuts) {

        return price * numberOfDonuts;

    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Welcome!  How many donuts do you want? :");
        System.out.println("A dozen donuts cost:");
        inputScanner.nextLine();

        System.out.print("Your donuts cost:");

        System.out.println(getTotal(12) + " dollars");

        System.out.print("This is my \nformat string");

        System.out.printf("In dollars, that would be $%8.2f\n", getTotal(1200) );
        System.out.printf("In dollars, that would be $%8.2f\n", getTotal(12) );
        System.out.printf("In dollars, that would be $%8.2f\n", getTotal(12000) );

        System.out.printf("The square root of 5 is %8.5f\n", Math.sqrt(5.0));
    }
}