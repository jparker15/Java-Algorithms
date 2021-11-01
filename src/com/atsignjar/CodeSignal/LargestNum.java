package com.atsignjar.CodeSignal;

public class LargestNum {
    int largestNumber(int n) {
        int largest = 10;
        for(int i = 1; i < n; i++){
            largest *= 10;
        }
        return largest -1;
    }

}
