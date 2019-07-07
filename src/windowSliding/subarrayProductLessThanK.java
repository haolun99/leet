package windowSliding;
// 713
public class subarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1)
			return 0;

		// int product = 0, count = 0, left = 0; Wrong
		int product = 1;
		int count = 0, left = 0;

		for (int right = 0; right < nums.length; right++) {
			product *= nums[right];
//			while (product >= k) {  Wrong
//				product /= nums[left++];
//				count += right - left + 1;
//			}
			// while(count >= k) Wrong
			while(product >= k)
				product /= nums[left++];
			count += right - left + 1;
		}

		return count;
	}
}
