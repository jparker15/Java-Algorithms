package com.atsignjar.Algo;


import java.util.HashMap;
import java.util.List;

public class Balls {


    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here

        HashMap<Object,Integer> count = new HashMap<>();

        for(List l: container){
            for(Object o: l){
                if(count.get(o) != null ){
                    count.put(o,count.get(o) + 1);
                }else{
                    count.put(o,1);
                }
            }
        }
        //add HashMap
        for (int x : count.values()){
            if(x!=0)
                return "Impossible";
        }

        return "Impossible";
    }
}
