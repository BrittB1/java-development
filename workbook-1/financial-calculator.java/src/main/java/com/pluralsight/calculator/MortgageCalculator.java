package com.pluralsight.calculator;

import java.text.NumberFormat;
import java.util.Scanner; //Must be imported to use a scanner

public class MortgageCalculator {
    public static void main(String[] args) {

        // This class gets input from the user.
        Scanner scanner = new Scanner(System.in);

        // takes input from user and stores it in principle variable
        System.out.println("Enter the principle amount:");
        double principal = scanner.nextDouble();

        //returns monthly payment that's way off unless entered as .07
        System.out.println("Enter the annual interest rate:");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the loan length in years:");
        int loanLength = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12;
        int numberOfPayments = loanLength * 12;

        double monthlyPayment = principal * (
                monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                        ((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1)
        );
        // getCurrencyInstance is a method in the java.text.NumberFormat. It gives us the specified locale in currency form.
        //         Here, it adds a dollar sign and a decimal to the monthly payment so it looks more like money.

        System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

        //multiply monthly payment amount * number of payments to get total interest paid
        System.out.println("Total payback amount:  " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
    }
    public class FutureValue {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the deposit amount:  ");
            double depositAmount = scanner.nextDouble():

}
