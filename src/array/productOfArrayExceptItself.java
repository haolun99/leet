package array;
// 238
public class productOfArrayExceptItself {
	 
	public int[] productExceptSelf(int[] nums) {
		// 4,5,1,8,2,10,6
		
		int[] result = new int[nums.length];
		
		result[0] = 1;
		for(int i = 1; i < nums.length; i++) {
			result[i] = nums[i - 1] * result[i - 1];
		}
	        
		int Right = 1;
		for(int i = nums.length - 1; i >=0; i--) {
			result[i] = result[i] * Right;
			Right *= nums[i];
		}
		
		 return result;
	    }
}
