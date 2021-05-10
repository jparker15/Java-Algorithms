package InterviewPrep;
import java.util.*;

public class MinDistances {

    /*
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
        // Write your code here

        List<Integer> b = new ArrayList<Integer>();



        for(int i = 0; i < a.size(); i++){
            for(int j = i + 1; j < a.size(); j++){
                if(a.get(i) == a.get(j)){

                    b.add(Math.abs(i-j));

                }
            }
        }
        // System.out.println(b);
        if(b.size() > 0){
            Collections.sort(b);
            // System.out.println(b.get(0));
            return b.get(0);
        }
        return -1;
    }

}
}
