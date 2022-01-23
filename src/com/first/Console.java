package com.first;

import java.util.Scanner;

public class Console {
    //read number from input
    private static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }
    public static double readNumber(String prompt, int min, int max) {
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
}
