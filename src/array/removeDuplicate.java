package array;

public class removeDuplicate {
	// [0,0,1,1,1,2,2,3,3,4]
	
	
	// Do not understand
	public int removeDuplicates(int[] nums) {
		if(nums.length < 2) return nums.length;
		int index = 1;
		for(int i = 1; i < nums.length; ++i) {
			if(nums[i] != nums[i-1]) {
				nums[index++] = nums[i]; // How to decrease the size of array in place?
			}
		}
		
		return index;
	}
	
    		
//	public int removeDuplicates(int[] nums) {
//		int result = 0;
//		int count = 0;
//		for (int i = 0; i < nums.length; i++) {
//
//			if (nums[i] == nums[i + 1]) {
//				count++;
//			}
//		}
//		
//		result = nums.length - count;
//		return result;
//	}
}
