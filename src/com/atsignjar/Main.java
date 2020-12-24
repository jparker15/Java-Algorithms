package com.atsignjar;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class Main {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        // Get the Tax
        double tax = (meal_cost * tax_percent) / 100;
        // Get the Tip
        double tip = (meal_cost * tip_percent/100);
        // Total Cost
        double totalCost = meal_cost + tax + tip;
        // Round the total cost and output to console
        System.out.println(Math.round(totalCost));
    }
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.print(inputString);
    }
}




/* hello world || ehwni ellawo eiwnd iwr
    h: 1, e:1, l:3, o:2, w:1, r:1, d:1
    e: 3, h: 1, w: 4, n:2, i:3, l:2, a:1, o:1, d:1, r:1
*/

