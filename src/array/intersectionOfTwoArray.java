package array;
// 350
import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArray {
		public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            
            ArrayList<Integer> temp = new ArrayList();
            
            for(int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            	if(nums1[i] < nums2[j]) {
            		i++;
            	}
            	else if(nums1[i] == nums2[j]) {
            		temp.add(nums1[i]);
            		i++;
            		j++;
            	}
            	else {
            		j++;
            	}
            }
            
            int[] result = new int[temp.size()];
            
            for(int i = 0; i < result.length; i++) {
            	result[i] = temp.get(i);
            }
			
			return result;
    }
}
