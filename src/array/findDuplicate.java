package array;
// 287
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findDuplicate {

	public int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet();
		
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return nums[i];
			}
			set.add(nums[i]);
		}
		
		return -1;
	}
	
	public int findDuplicateTwo(int[] nums) {
		Arrays.sort(nums);
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] == nums[i-1]) {
				return nums[i];
			}
		}
		return -1;
	}
}
