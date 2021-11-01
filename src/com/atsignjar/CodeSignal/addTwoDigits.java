package com.atsignjar.CodeSignal;

public class addTwoDigits {

    addTwoDigits(){

    }

    static int add (int n ){
        System.out.println(n/10);
        System.out.println(n%10);
        return n/10 + n%10;
    }

    public static void main(String[] args) {
         System.out.println(add(47));
    }
}
