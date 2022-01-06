package com.first;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTH_IN_YEAR= 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);
        int principal;
        float monthlyInterst;
        int period;

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
           float annualInterestRate = scanner.nextFloat();
           if (annualInterestRate >= 0 && annualInterestRate <= 30) {
               monthlyInterst = annualInterestRate/ PERCENT / MONTH_IN_YEAR;
                break;
           }
           System.out.println("please enter a number less or equal than 30 AND greater than or equal 0");
       }

       while (true) {
           System.out.print("Period (Years) : ");
           //n
           byte year = scanner.nextByte();
           if (year >= 1 && year <= 30) {
               period = year * MONTH_IN_YEAR;
               break;
           }
           System.out.println("please enter a number greater than 0 AND less than 30");
       }

        double mortgage = principal
                * (monthlyInterst * Math.pow(1 + monthlyInterst, period))
                / (Math.pow(1 + monthlyInterst, period) - 1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage is : " + formattedMortgage);




    }
}
