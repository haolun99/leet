package windowSliding;
// 643
public class maximumAverageSubarrayOne {
	public double findMaxAverage(int[] nums, int k) {
		int maxSum = 0;
		// for(int i = 0; i < nums.length; i++) maxSum += nums[i]; Wrong
		for(int i = 0; i < k; i++) maxSum += nums[i]; // Sum of first k elements
		
		int windowSum = maxSum;
		
		for(int i = k; i < nums.length; i++) {
			windowSum += nums[i] - nums[i - k]; // Add one rightside element, subtract one leftside element
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum / 1.0/ k;
	}
}
