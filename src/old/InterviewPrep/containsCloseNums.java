package old.InterviewPrep;

public class containsCloseNums {
    boolean containsCloseNums(int[] nums, int k) {

        if(nums.length <= 1){
            return false;
        }

        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                //if there's dup nums
                if(nums[i] == nums[j]){
                    int diff = Math.abs(i - j);
                    System.out.println("diff:" + diff);
                    if(diff > k ){
                        System.out.println(i+ " " + j);
                        return false;
                    }

                }
            }

        }
        return true;


    }

}
