package dynamic;
// 300
public class longestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		// Base case
		if(nums.length == 0)
			return 0;
		
		int[] dp = new int[nums.length];
		dp[0] = 1; // Each array has at least one element (single element)
		int ans = 1; // maximum number of increasing subarray
		
		for(int i =  1; i < dp.length; i++) {
		//for(int i = 0; i < dp.length; i++) { Wrong
			int val = 0; // number of continuous elements greater than first element(exclude)
			for(int j = 0; j < i; j++) {
				if(nums[i] > nums[j])
					val = Math.max(val, dp[j]);
			}
			dp[i] = val + 1;
			ans = Math.max(ans, dp[i]);
		}
		
		return ans;
	}
}
