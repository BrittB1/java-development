package com.pluralsight.calculator;

import java.util.Scanner;

public class FinancialCalculators {
    static Scanner calculatorScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //declare variables to hold the input
        double totalInterest = 0.0;
        double principle = 0.0;
        double interestRate = 0.0;
        int loanlength = 0;
//getting scanner to read the input
        double numerator = principle * interestRate / 12;

        double denominator = 1 - (1 + interestRate / 12);

//read the input

        //do the math
        System.out.println("Enter principle here:");
        principle = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter principle here:");
        interestRate = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter principle here:");
        totalInterest = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

    }
    System.out.println("Enter principle here: ");
    principle =calculatorScanner.nextdouble();
    // give response

    System.out.println("Your payment is: "+payment );
}
