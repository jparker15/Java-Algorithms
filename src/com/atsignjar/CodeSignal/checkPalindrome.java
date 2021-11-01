package com.atsignjar.CodeSignal;

public class checkPalindrome {
    boolean checkPalindrome(String inputString) {
        String rev = "";

        for(int i = inputString.length() - 1; i >= 0; i--){
            rev += inputString.charAt(i);
        }
        return rev.equals(inputString);
    }

}
