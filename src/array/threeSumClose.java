package array;

import java.util.Arrays;

public class threeSumClose {

    public int threeSumClosest(int[] nums, int target) {

        int result = nums[0] + nums[1] + nums[2];

        // int result = 0;
        /*
            Can't initialize the result with 0
            For [-1, 2, 1, -4] target = 1
            in the first iteration, sum = -1 + 2 + 1 = 2
            |sum - target | is larger than |result - target|
            But here occur the closet value should be return
         */
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = nums.length - 1;


            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > target){
                    k--;
                }
                else{
                    j++;
                }

                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
            }
        }

        return result;
    }
}
