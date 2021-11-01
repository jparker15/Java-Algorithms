package com.atsignjar.Algo;

public class Palin {

        public boolean isPalindrome(String s) {

            String replaceS = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

            char[] chArr = replaceS.toCharArray();

            String rev = "";

            for(int i = chArr.length - 1; i >= 0; i--){
                rev += chArr[i];
            }

            if(rev.equals(replaceS)){
                return true;
            }

            return false;
        }

}
