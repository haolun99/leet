package unknown;
// 136
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class singleNumber {
	public static void main(String[] args) {
		int[] arr = {4,1,2,1,2};
		System.out.println(new singleNumber().singleNumber(arr));
	}
	
	// Solution 1: bit manipulation
	
	
	// Solution 2: 2*(sum_of_array_without_duplicates) – (sum_of_array)
	// singleNumber = 2*(sum_of_array_without_duplicates) – (sum_of_array)
    // Array [] : [a, a, b, b, c, c, d] // d is the target value
    // SingleNumber = 2*(a+b+c+d) – (a + a + b + b + c + c + d)
	
	public int singleNumberTwo(int[] nums) {
		int sum_of_array = 0;
		int sum_of_array_without_duplicates = 0;
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			sum_of_array += nums[i];
		}
		
		HashSet<Integer> set = new HashSet(); // Use hashSet to avoid duplicate value
		for(int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		
		// Sum of the hashSet by converting hashSet to a new array(may have better way)
		Integer[] arr = set.toArray(new Integer[set.size()]);
		for(int i = 0; i < arr.length; i++) {
			sum_of_array_without_duplicates += arr[i];
		}
		
		result = 2 * sum_of_array_without_duplicates - sum_of_array;
		
		return result;
	}
	
	// Question 1: How to find the single element in a sorted array
	// 11224
	public int singleNumber(int[] nums) {
		int result = 0;
		Arrays.parallelSort(nums);
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != nums[i+1] && nums[i] != nums[i + 2]) {
				result = nums[i+2];
			}
		}
		
		return result;
	}
	
	// Question 2: Use the binarySearch to find the single element in a sorted array
}
