package array;
// 442
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findAllDuplicates {
    // Solution
	// when find a number i, flip the number at position i-1 to negative. 
    // if the number at position i-1 is already negative, i is the number that occurs twice.
	// Update
    
    public List<Integer> findDuplicatesSol(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
	
    // My answer
	public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        
        Set<Integer> set = new HashSet();
        
        for(int i = 0; i < nums.length; i++) {
        	if(set.contains(nums[i])) {
        		list.add(nums[i]);
        	}
        	set.add(nums[i]);
        }
        
        return list;
    }
}
