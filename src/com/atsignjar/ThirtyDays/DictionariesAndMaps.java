package com.atsignjar.ThirtyDays;

import java.util.*;

public class DictionariesAndMaps {

    public static void HashMaps (){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap();

        System.out.println("enter number of entries");

        int n = in.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("enter name");
            String name = in.next();
            System.out.println("enter number");
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.get(s) == null){
                System.out.println("Not found");
            }else{
                System.out.println(s + "=" + map.get(s));
            }
        }
        in.close();

    }
}
