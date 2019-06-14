package array;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateArray {
//	Input: [1,2,3,4,5,6,7] and k = 3
//			Output: [5,6,7,1,2,3,4]
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int target = 3;
		new rotateArray().rotate(arr, target);
		System.out.println(Arrays.toString(arr));
	}
	
	// Wrong Not handle for arr = [1], k = 1
    public void rotate(int[] nums, int k) {
    	ArrayList<Integer> list = new ArrayList();
        for(int i = k + 1; i < nums.length; i++ ) {
        	list.add(nums[i]);
        }
        for(int i = 0; i <= k; i++) {
        	list.add(nums[i]);
        }
        
        Integer[] arr = new Integer[list.size()]; 
        arr = list.toArray(arr); 
        
        for(int i = 0; i < arr.length; i++) {
        	nums[i] = arr[i];
        }
    }
    
    public void rotateTry(int[] nums, int k) {
        // validate the k before the rotation
        k = ((k % nums.length) + nums.length) % nums.length;
        
        // rotate
        int[] copy = Arrays.copyOf(nums, nums.length);
        
        // Add the initial elements
        int m = 0;
        for (int j = nums.length - k; j < nums.length; j++) {
            nums[m++] = copy[j];
        }
        
        // Add the latter elements
        for (int i = 0; i < nums.length - k; i++) {
            nums[m++] = copy[i];
        }
        
    }
	
	//Wrong
//      public void rotate(int[] nums, int k) {
//       int[] result = new int[nums.length];
//       
//       for(int i = 0; i < k; i++) { // nums[k + 1, nums.length - 1] result[0, k - 1] // 567
//    	   result[k + i] = nums[i];     // nums[0, k] result[k, nums.length - 1]
//    	   result[i] = nums[k + i + 1];
//       }
// }
}
