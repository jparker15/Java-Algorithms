package InterviewPrep;

import java.util.*;

public class Permutation {

    /*
     * Complete the 'absolutePermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     */

    public static List<Integer> absolutePermutation(int n, int k) {
        // Write your code here
        List<Integer> perms = new ArrayList();

        for (int i = 1; i <= n; i++){
//            System.out.println(i);
            perms.add(i);
        }
        // [1,2,3,4]

        for (int pos = 1; pos < perms.size(); pos++){

            for (int i = 1; i < perms.size(); i++){

                if(perms.get(pos) - i == k){
                    System.out.println(pos + "+" + i);
                }
            }
        }
        System.out.println(perms.size());
        return  perms;
    }

    public static void main(String[] args) {
        absolutePermutation(4, 2);
    }
}
