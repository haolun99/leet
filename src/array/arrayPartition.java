package array;
// 561
import java.util.Arrays;

public class arrayPartition {
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.parallelSort(nums);

		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}

		return sum;
	}
}
