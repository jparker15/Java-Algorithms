package com.atsignjar.ThirtyDays;

import java.util.Scanner;

public class Complexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


    }

    public void checkPrime(){
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        for(int i = 0; i < testCases; i++){
            int testNum = input.nextInt();
            // System.out.println(testNum);

            if(testNum % 2 == 0 || testNum < 2){
                System.out.println("Not prime");
            }
            int counter = 0;
            while(testNum > counter){
                counter++;
            }
//            else{
//                System.out.println("Prime");
//            }
        }


    }

}
