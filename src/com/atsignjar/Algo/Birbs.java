package com.atsignjar.Algo;

public class Birbs {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        HashMap<Integer, Integer> birds = new HashMap<>();

        int topBird = arr.get(0);

        for(int i = 0; i < arr.size(); i++){
            if(birds.get(arr.get(i)) == null){
                birds.put(arr.get(i), 1);
            }

            birds.put(arr.get(i), birds.get(arr.get(i)) + 1);

        }

        for(int type: birds.keySet()){

            if(birds.get(type) > birds.get(topBird)){
                topBird = type;
            }
            else if(birds.get(type) == birds.get(topBird)){

                if(type < topBird) topBird = type;
            }
        }

        return topBird;
    }

}
}
