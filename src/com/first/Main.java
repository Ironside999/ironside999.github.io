package com.first;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        int principal;
        float annualInterest;
        byte years;


        //p
       while (true) {
           System.out.print("Principal : ");
           principal = scanner.nextInt();
           if (principal >=1_000 && principal <= 1_000_000) {
               break;
           }
           System.out.println("please enter a number between 1,000 AND 1,000,000");
       }

       while (true) {
           System.out.print("Annual Interest Rate : ");
           //r
           annualInterest = scanner.nextFloat();
           if (annualInterest >= 0 && annualInterest <= 30)
                break;

           System.out.println("please enter a number less or equal than 30 AND greater than or equal 0");
       }

       while (true) {
           System.out.print("Period (Years) : ");
           //n
           years = scanner.nextByte();
           if (years >= 1 && years <= 30)
               break;

           System.out.println("please enter a number greater than 0 AND less than 30");
       }
    double mortgage = calculateMortgage(principal, annualInterest, years);

        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage is : " + formattedMortgage);

    }
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
