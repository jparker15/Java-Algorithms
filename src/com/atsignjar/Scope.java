package com.atsignjar;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here

    public Difference(int [] e){
        this.elements = e;
    }

    public void computeDifference(){
        int min = elements[0];
        int max = 0;

        for (int i = 0; i < elements.length; i++){
            if(elements[i] < min){
                min = elements[i];
            }if (elements[i] > max){
                max = elements[i];
            }
        }
        maximumDifference = max - min;
        System.out.println(maximumDifference);
    }
} // End of Difference class
public class Scope {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    
    
}
