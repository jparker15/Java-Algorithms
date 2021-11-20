package com.atsignjar.Algo;

import java.util.ArrayList;
import java.util.List;

public class rotLeft {
    public static void main(String[] args) {


    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        int size = a.size();
        ArrayList<Integer> rotate = new ArrayList<>();

        int i = 0;
        int rotate_index = d;

        while(rotate_index < size){
            rotate.add(a[rotat_index]);
        }
        System.out.println(rotate);
        return rotate;
    }
}
