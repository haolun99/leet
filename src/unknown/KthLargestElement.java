package unknown;
// 215
import java.util.Arrays;

public class KthLargestElement {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		int result = 0;
		result = nums[nums.length - k];
		
		return result;
	}
}
