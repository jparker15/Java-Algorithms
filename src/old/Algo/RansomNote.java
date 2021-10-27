package old.Algo;

import java.util.HashMap;
import java.util.List;

public class RansomNote {
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for(String s: magazine){

            if(hm.containsKey(s)){
                hm.put(s, hm.get(s) + 1);
            }else{
                hm.put(s, 1);
            }

        }

        for(String s: note){
            if(!hm.containsKey(s) || hm.get(s) <= 0){
                System.out.println("No");
                return;

            }else{
                hm.put(s, hm.get(s) - 1);
            }
        }

        System.out.println("Yes");
    }

}
