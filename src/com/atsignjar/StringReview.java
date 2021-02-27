package com.atsignjar;

import java.util.Scanner;

public class StringReview {
    static Scanner scanner = new Scanner(System.in);

    public static void Review (){
        System.out.println("Enter number of strings:");

        int testCases = scanner.nextInt();
        System.out.println("Enter strings:");

        for(int i = 0; i < testCases; i++){
            String str = scanner.next();
            System.out.println(str);
            String even = "";
            String odd = "";

            for (int j = 0; j < str.length(); j++){
                Character charIndex = str.charAt(j);
                if(j % 2 == 0){
                    even += charIndex;
                } else if(j % 2 != 0){
                    odd += charIndex;
                }
            }
            System.out.println(even + " " +  odd);
        }

    }
}
