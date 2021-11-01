package com.atsignjar.Algo;

import java.util.Collections;
import java.util.List;

public class maxToys {
    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here

        Collections.sort(prices);

        int count = 0;
        int total = k;

        for(int i: prices){
            if(total > 0){
                total -= i;
                count++;
            }else{
                break;
            }
        }

        return count - 1;

    }
}
