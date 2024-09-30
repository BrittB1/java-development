package com.pluralsight.calc;

import java.util.Scanner;

public class Tempclass {
    public static void main(String[] args) {
        System.out.println("Give two numbers and I'll add them for you");

        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = s.nextInt();
        s.nextLine();
        System.out.println("Enter another number: ");
        b = s.nextInt();
        s.nextLine();

        int answer = a + b;
        System.out.println("Answer is: " + answer);
    }
}
