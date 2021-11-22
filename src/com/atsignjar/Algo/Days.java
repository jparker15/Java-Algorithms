package com.atsignjar.Algo;

public class Days {
    public static int rev(int i){
        int rev = 0;

        while(i != 0){
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }
        return rev;
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int days = 0;
        for(int n = i; n <= j; n++){
            if(Math.abs(n - rev(n)) % k == 0){
                days++;
            }
        }

        System.out.println(days);
        return days;
    }
}
