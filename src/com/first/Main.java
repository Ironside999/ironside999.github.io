package com.first;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTH_IN_YEAR= 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        //p
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        //r
        float annualInterestRate = scanner.nextFloat() / PERCENT / MONTH_IN_YEAR;

        System.out.print("Period (Years) : ");
        //n
        int period = scanner.nextInt() * MONTH_IN_YEAR;

        double mortgage = principal
                * (annualInterestRate * Math.pow(1 + annualInterestRate, period))
                / (Math.pow(1 + annualInterestRate, period) - 1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage is : " + formattedMortgage);

//        double up = (Math.pow((1 + annualInterestRate), period)) * annualInterestRate;
//        double down = (Math.pow((1 + annualInterestRate), period)) - 1;
//        double result = principal * (up / down);
//        String finalResult = NumberFormat.getCurrencyInstance().format(result);
//        System.out.println("Mortage is : " + finalResult);



    }
}
