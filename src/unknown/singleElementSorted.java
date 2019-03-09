package unknown;

import java.util.Arrays;

// 540
public class singleElementSorted {
	
	// Solution using binary search
	
	// Correct but slow
	public int singleNonDuplicate(int[] nums) {
            Arrays.parallelSort(nums);
            
            int result = 0;
            for(int i = 0; i < nums.length; i++) {
            	result ^= nums[i];
            }
			
			return result;
    }
}
