package com.first;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principal = (int) (readNumber("Principal : ", 1_000, 1_000_000));
        float annualInterest = (float) (readNumber("Annual Interest Rate : ", 0, 30));
        byte years = (byte) (readNumber("Period (Years)", 0, 30));

    double mortgage = calculateMortgage(principal, annualInterest, years);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage is : " + formattedMortgage);

    }

    //read number from input
    public static double readNumber (String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("please enter a number less or equal than " + max + "AND greater than or equal" + min);
        }
        return value;
    }

    //calculate mortgage
    public static double calculateMortgage (
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTH_IN_YEAR= 12;
        final byte PERCENT = 100;
        float monthlyInterest = annualInterest/ PERCENT / MONTH_IN_YEAR;
        short numberOfPayments = (short)(years * MONTH_IN_YEAR);


        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }

}
