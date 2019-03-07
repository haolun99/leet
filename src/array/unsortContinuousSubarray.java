package array;

import java.util.Arrays;
// 581
public class unsortContinuousSubarray {
	public static void main(String[] args) {
		// int[] arr = {2, 6, 4, 8, 10, 9, 15};
		int[] arr = {1, 2, 3, 4};
		System.out.println(new unsortContinuousSubarray().findUnsortedSubarray(arr));
	}
	
	// Solution one
	public int findUnsortedSubarrayOne(int[] nums) {
		int[] arr =new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			arr[i] = nums[i];
		}
		
		Arrays.parallelSort(arr);
		
		int start = 0;
		int end = nums.length - 1;
		
		while(start < nums.length && arr[start] == nums[start]) {
			start++;
		}
		
		while(end > start && arr[end] == nums[end]) {
			end--;
		}
		
		return end - start + 1;
	}
	
	// My answer, fail for case [1,2,3,4]
	public int findUnsortedSubarray(int[] nums) {
		/*
		 * (1) Sort the array and compare it to original array. (2) Use two for-loop to
		 * compare, first loop check from left and find first different one and obtain
		 * index, second loop check from right and get index for first different
		 * position. (3) The length is the difference of two index.
		 */
		int origin[] = new int[nums.length];
		int pos1 = 0;
		int pos2 = 0;
		int length = 0;

		for (int i = 0; i < nums.length; i++) {
			origin[i] = nums[i];
		}

		Arrays.parallelSort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(origin));
		

		for (int i = 0; i < origin.length; i++) { // what this for-loop did
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] != origin[i]) {
					pos1 = i;
				}
			}
		}

		for (int i = nums.length - 1; i > 0; i--) {
			for (int j = origin.length - 1; j > 0; j--) {
				if (nums[i] != origin[j]) {
					pos2 = j;
				}
			}
		}
		
		// Question: 
		// For case [1,2,3,4] pos1 and pos2 should be 0 but 3 and 2 instead
		System.out.println(pos1);
		System.out.println(pos2);
		length = pos1 - pos2;

		return length;
	}
}
