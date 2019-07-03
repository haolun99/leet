package hashTable;
// 560
public class subarraySumEqualToK {
	// Brute force
	public int subarraySum(int[] nums, int k) {
   // index	   0 1 2 3  4  5  6
   // nums 	   1 2 3 5  3  2  1    k = 6
   // preSum   1 3 6 11 14 16 17
		// return 2
        int[] preSum = new int[nums.length];
        preSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) preSum[i] = preSum[i - 1] + nums[i]; // Store the sum of each sub-array into preSum
        int result = 0;  // Store the number of idea sub-array
        for (int i = 0; i < preSum.length; i++) {
            if (preSum[i] == k) result++; // Search from left to right, 123
            for (int j = i + 1; j < preSum.length; j++) { // Search from right to left 321(17 - 11)
                if (preSum[j] - preSum[i] == k) result++;
            }
        }
        return result;
    }
	
	
}
