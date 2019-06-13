package array;
// 442
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findAllDuplicates {
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
