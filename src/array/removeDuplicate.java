package array;

import java.util.Arrays;

public class removeDuplicate {
	// [0,0,1,1,1,2,2,3,3,4]
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Result " + new removeDuplicate().removeDuplicates(arr));
	}
	
	// Do not understand
	public int removeDuplicates(int[] nums) {
		if(nums.length < 2) return nums.length;
		int index = 1;  // number of distinct elements in the nums
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
