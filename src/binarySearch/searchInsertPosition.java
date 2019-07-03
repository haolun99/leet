package binarySearch;
// 35
public class searchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        
        while(high > low) {
        	int mid = low + (high - low) / 2;
         // int mid = high - (high + low) / 2; // Wrong
        	if(nums[mid] >= target)
        		high = mid;
        	else
        		low = mid + 1;
        }
		
		return low;
    }
}
