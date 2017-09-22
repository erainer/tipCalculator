package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double itemCost;
        Double totalCost = 0.0;
        int count = 0;
        Double taxes = 0.0;

        //Gets user input for the cost of items
        do {
            System.out.println("Enter the cost of an item: ");
            System.out.println("Enter 0 if you don't have anymore items to enter: ");
            itemCost = scanner.nextDouble();
            totalCost += itemCost;
        }while (itemCost != 0);
        //calculate taxes
        taxes = totalCost * .025;
        //print out everything
        System.out.println("Total taxes: ");
        System.out.printf("$%.2f", taxes);
        System.out.println("\n");
        System.out.println("Total item cost: ");
        System.out.printf("$%.2f", totalCost);
        System.out.println("\n");
        //calculate total cost
        totalCost+=taxes;
        System.out.println("Total Cost with taxes: ");
        System.out.printf("$%.2f", totalCost);
        System.out.println("\n");
        //gets users tip amount
        System.out.println("Recommended you tip 17.5% Enter the amount you are going to tip in percent form: ");
        Double tip = scanner.nextDouble();
        //calculates tip
        Double totalTip = totalCost*(tip/100);
        //cacluates overall cost with tip
        Double overallCost = totalCost + totalTip;
        System.out.println("Total tip is : ");
        System.out.printf("$%.2f", totalTip);
        System.out.println("\n");
        System.out.println("Overall cost: ");
        System.out.printf("$%.2f", overallCost);
    }
}
