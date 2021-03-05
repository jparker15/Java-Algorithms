package com.atsignjar;


import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//      IntroToConditionalStatements.Conditionals();

        /*ClassVsInstance person = new ClassVsInstance(24);
        person.amIOld();*/

//      Loops.Multiples();
//      StringReview.Review();

//        Arrays.Array();

//        DictionariesAndMaps.HashMaps();

//        Recursion.Recursion();
        System.out.println("Enter a integer to find it's binary equivalent ");
        int n = scanner.nextInt();
        System.out.println("Binary of " + n + " is " + Integer.toString(n,2) );
        String binary = Integer.toString(n,2);
        int consecutiveOnes = 0;
        for (int i = 0; i < binary.length(); i++){
            System.out.println(binary.charAt(i));
            if(binary.charAt(i) == 1){
                consecutiveOnes ++;
            }else{
//                return consecutiveOnes
                System.out.println(consecutiveOnes);

            }
        }


    }
}




