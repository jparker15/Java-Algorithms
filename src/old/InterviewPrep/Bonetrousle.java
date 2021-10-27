package old.InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class Bonetrousle {

    /*
     * Complete the 'bonetrousle' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER k
     *  3. INTEGER b
     *
     * // Make a list/collection with default values (1 - b)
    // Add the numbers in collection
    // If its greater than N return -1
    // If its equal to N return collection
    // If its less than  N
    // Calculate difference from N - sum of array
    // Add the difference to last element of collection
    // Check if new number is less than or equal to K
    // return new collection
    // If not greater than K set element to K and K - 1
    // Repeat with next element
    // If I run out of elements return -1
     */

    public static List<Long> bonetrousle(long n, long k, int b) {
        // Write your code here
        ArrayList<Long> list = new ArrayList<Long>();
        for (int i = 1; i <= b; i++){
            list.add((long) i);
        }
        int sum = 0;

        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        if(sum > n){
            ArrayList<Long> invalid = new ArrayList<Long>();
            invalid.add((long)-1);
            return invalid;
        }
        if(sum == n){ return list;}


//        list.add(-1L);
        return list;
    }
}
