package com.first;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport (MortgageCalculator calculator) {
        this.calculator = calculator;
    }


    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("-------");
        System.out.println("Monthly Payment : " + formattedMortgage);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------");
        for (double balance: calculator.getRamainingBalances()) {
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
