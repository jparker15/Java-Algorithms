package com.atsignjar.ThirtyDays;

import java.util.Scanner;

public class Recursion {

  static Scanner scan = new Scanner(System.in);

    public static void Recursion (){
        System.out.println("enter number to factorial");
        int n = scan.nextInt();
        int fact = n;

        for(int i = 1; i < n; i++){
            // 1 <= 3
            fact *= i;
            //3 * 1 = 3
            System.out.println(fact);
        }
    }
}
