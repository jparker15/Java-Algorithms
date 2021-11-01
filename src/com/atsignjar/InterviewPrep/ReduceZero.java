package com.atsignjar.InterviewPrep;

public class ReduceZero {

    public int numberOfSteps(int num) {

        int counter = 0;
        while(num > 0){
            if(num % 2 == 0){
                num /= 2;
                counter += 1;
            }else{
                counter += 1;
                num -= 1;
            }

        }return counter;

    }
}
