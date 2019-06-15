package array;
// 724
public class pivotIndex {
	
	public int pivotIndex(int[] nums) {
		int total = 0; // Sum of the array
		int left = 0;
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(i != 0)
				left += nums[i - 1];
			if(total - left - nums[i] == left)
				return i;
		}
		
		return -1;
	}
}
