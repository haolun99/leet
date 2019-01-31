package array;
//27

public class removeElement {
	// Note：The test case return the array 
	// Means the main method use this method to operate array and return the final one
	// Don't confused by the int value, temp will not show on the output here
	public int removeElement(int[] nums, int val) {
		 int temp = 0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]!=val)
	            {
	                nums[temp]=nums[i];
	                temp++;
	            }
	        }
	        return temp;
	    }
}
