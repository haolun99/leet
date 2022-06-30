package dp;
// 494
public class targetSum {
	// Brute force
	int result = 0;
    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, 0, 0, S);
        return result;
    }
    
    public void calculate(int[] nums, int i, int sum, int S) {
    	if(i == nums.length) {
    		if(sum == S) {
    			result++;
    		}
    	}else {
    		calculate(nums, i + 1, sum + nums[i], S);
    		calculate(nums, i + 1, sum - nums[i], S);
    	}
    }
    
//    public void calculate(int[] nums, int i, int sum, int S){
//        if(i == nums.length){
//            if(sum == S){
//                result++;
//            }
//            else{ Wrong: else should point to the first if, not the second if loop
//                calculate(nums, i + 1, sum + nums[i], S);
//                calculate(nums, i + 1, sum - nums[i], S);
//            }
//        }
//    }
	
}
