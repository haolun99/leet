package array;

import java.util.Arrays;

public class unsortContinuousSubarray {
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

		for (int i = 0; i < origin.length; i++) { // what this for-loop did
			for (int j = 0; j < nums.length; j++) {
				if (origin[i] != nums[j]) {
					pos1 = origin[i];
				}
			}
		}

		for (int j = nums.length - 1; j > 0; j--) {
			for (int i = origin.length - 1; i > 0; i--) {
				if (nums[i] != origin[j]) {
					pos2 = nums[i];
				}
			}
		}

		length = pos2 - pos1;

		return length;
	}
}
