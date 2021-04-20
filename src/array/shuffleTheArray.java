package array;

import java.util.Arrays;

public class shuffleTheArray {
    public static void main(String[] args){
        int[] test = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(new shuffleTheArray().shuffle(test, 3)));
    }
    // 1470
    public int[] shuffle(int[] nums, int n) { // [2,5,1,3,4,7], n = 3
        int[] result = new int[2 * n];

        for(int i = 0; i < n; i++){
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
