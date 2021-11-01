package com.atsignjar.Algo;

public class TwoSums {
    public int[] twoSume(int[] nums, int target){
        int[] pos = new int[2];

        for(int i = 0; i < nums.length; i ++){

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target){
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> sums = new HashMap<Integer,Integer>();

        int[] pos = new int[2];

        for(int i = 0; i < nums.length; i++){
            sums.put(nums[i] , i);
        }

        for(int j = 0; j < nums.length; j++){

            if( sums.containsKey (target - nums[j]) ) {

                if(j != sums.get(target - nums[j])) {
                    pos[0] = j;
                    pos[1] = sums.get(target - nums[j]);
                }

            }
        }

        return pos;
    }
}
