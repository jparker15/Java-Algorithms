package com.atsignjar.InterviewPrep;

import java.util.*;

public class subStringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int i = 0; i <= s.length()-k; i++){
            //subStr.add(s.substring(i, i+k));
            String substr = s.substring(i, i+k);                    if(smallest.length() == 0){
                smallest = substr;
            }
            // System.out.println(s.substring(i,i+k));
            if(substr.compareTo(largest) > 0){
                largest = s.substring(i, i+k);
            }
            else if (substr.compareTo(smallest) < 0) {
                smallest = s.substring(i, i+k);
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
