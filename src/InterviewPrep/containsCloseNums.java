package InterviewPrep;

public class containsCloseNums {
    boolean containsCloseNums(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    int diff = Math.abs(i - j);
                    if(diff > k ){
                        return false;
                    }

                }
            }

        }
        return true;


    }

}
