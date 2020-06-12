/*
Name: Sanchar Koirala
Student ID: 12119664
File: Week2.java
*/
package assingment1;

import java.util.Scanner;

public class Week2 {
    
    public static void main(String[] args) {
        //Declaring scanner object
        Scanner keyboard = new Scanner(System.in);
        
        final double BASE_CHARGE = 10.50;
        String customerName;    //Declaring customerName as a String datatype
        int toppings;
        double total;
        
        System.out.print("Customer name: ");
        customerName = keyboard.nextLine();     //Waiting or user input for Customer name
        System.out.print("No. of toppings for " + customerName + ": ");
        toppings = keyboard.nextInt();
        total = BASE_CHARGE + (toppings * 1.25);
        System.out.println("---Rocky Woodfire Pizzas Receipt---");
        System.out.println("Customer name: " + customerName);
        System.out.println("Number of toppings: " + toppings);
        System.out.println("Total charge: $" + total);
    }
}