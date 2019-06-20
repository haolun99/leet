package array;

public class huoseRobber {
	// Dynamic programming method:
	// TODO

	// Reduce to maximum sum of an array with no 2 continuous element
	public int robs(int[] nums) {
		int n = nums.length;

		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];

		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[1], dp[0]);

		int max = dp[1];

		for (int i = 2; i < n; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
			max = Math.max(dp[i], max);
		}

		return dp[n - 1];
	}
}
