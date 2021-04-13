package array;

import java.util.Arrays;

public class maximumProductOfTwoElements {
    // 1464
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        int num1 = nums[nums.length - 1];
        int num2 = nums[nums.length - 2];

        return (num1 - 1) * (num2 - 1);
    }
}
