package array;
// 167
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumTwo {
	public static void main(String[] args) {
		int num[] = {2,7,11,15};
		int numbers = 9;
		System.out.println(Arrays.toString(new twoSumTwo().twoSum(num, numbers)));
	}

	// Solution
	public int[] twoSumOne(int[] nums, int target) {
        int i=0, j=nums.length-1;
        while (i<j) {
            if (nums[i]+nums[j]==target) return new int[]{i+1, j+1}; 
            // i + 1, j + 1This question treat index start from 1, not 0
            else if (nums[i]+nums[j]<target) i++;
            else j--;
        }
        return null;
    }
	
	
	// My answer
	public int[] twoSum(int[] numbers, int target) {
		int[] temp = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {   // How put array elements into hashMap
	            temp[1] = i;    
	            temp[0] = map.get(target - numbers[i]);
	            // return temp; 
	            // Notice this will terminate program directly without run following 
	        }
	        map.put(numbers[i], i);
	    }
	    
	    int[] result = new int[2];
	    for(int i = 0; i < temp.length; i++){
             result[i] = temp[i] + 1;
        }
        
        return result;
    }
}
