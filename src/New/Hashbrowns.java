package New;

import java.util.HashMap;

public class Hashbrowns {


    public static void checkMag (String[] magazine, String[] note){

        HashMap<String,Integer> magazineMap = new HashMap<String,Integer>();
        HashMap<String,Integer> noteMap = new HashMap<String,Integer>();

        for (int i = 0; i < magazine.length ;i++){
            if(magazineMap.get(magazine[i]) != null) {
                magazineMap.put(magazine[i],magazineMap.get(magazine[i]) + 1);
            } magazineMap.put(magazine[i],1);
        }

        for(String s: note){
            if(noteMap.get(s) != null) {
                noteMap.put(s,noteMap.get(s) + 1);
            } noteMap.put(s,1);
        }

        for(int i = 0; i < magazine.length ;i++){

            if(noteMap.get(magazine[i]) != magazineMap.get( magazine[i])){
                System.out.println("blad");
            }
        }

        noteMap.equals(magazineMap);
        for(String key: noteMap.keySet()){
            System.out.println(key);
            System.out.println(noteMap.get(key));
        }

        for(String key: magazineMap.keySet()){

            for(String k: noteMap.keySet()){

                if(key.equals(k) && magazineMap.get(k) == noteMap.get(k)){
                    yn = true;
                }
            }
        }

        if(yn){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
