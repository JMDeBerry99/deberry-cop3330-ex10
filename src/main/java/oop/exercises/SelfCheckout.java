/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class SelfCheckout
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        final double taxRate = 0.055;

        //input
        System.out.print("Enter the price of item 1: ");
        String input = in.nextLine();
        int item1Price = Integer.parseInt(input);
        System.out.print("Enter the quantity of item 1: ");
        input = in.nextLine();
        int item1Count = Integer.parseInt(input);
        System.out.print("Enter the price of item 2: ");
        input = in.nextLine();
        int item2Price = Integer.parseInt(input);
        System.out.print("Enter the quantity of item 2: ");
        input = in.nextLine();
        int item2Count = Integer.parseInt(input);
        System.out.print("Enter the price of item 3: ");
        input = in.nextLine();
        int item3Price = Integer.parseInt(input);
        System.out.print("Enter the quantity of item 3: ");
        input = in.nextLine();
        int item3Count = Integer.parseInt(input);

        //processing
        double subtotal = item1Count * item1Price + item2Count * item2Price + item3Count * item3Price;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        //output
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
