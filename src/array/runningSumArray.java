package array;

import java.util.Arrays;

public class runningSumArray {
    // 1480
    public static void main(String[] args){
        int[] test = {1,2,3,4};

        System.out.println(Arrays.toString(new runningSumArray().runningSum(test)));
    }

    public int[] runningSum(int[] nums){
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
