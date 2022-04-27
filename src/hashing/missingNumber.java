package hashing;
// 268
import java.util.HashSet;
import java.util.Set;

public class missingNumber {

		public int missingNumber(int[] nums) {
			Set<Integer> set = new HashSet<Integer>();
	        for (int num : nums) set.add(num);

	        for (int j = 0; j < nums.length + 1; j++) {
	        	// Wrong case: 
	        	// for (int j = 0; j < nums.length; j++) {   arr[] = 1
	            if (!set.contains(j)) {
	                return j;
	            }
	        }
	        return -1;
    }
}
