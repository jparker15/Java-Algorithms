package com.atsignjar;


import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

public class Interface {
}

class Calc implements AdvancedArithmetic {
    public int divisorSum(int n) {
        return 0;
    }
}

class Sol {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calc();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}