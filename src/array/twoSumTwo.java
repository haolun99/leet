package array;
// 167
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumTwo {
	public static void main(String[] args) {
		int num[] = {0,1,8,7,0,1,6};
		Arrays.sort(num);
		for(int i =0 ; i < num.length; i++) {
		System.out.println(num[i]);
		}
	}
	// To do
	// Wrong: [2, 7, 11, 15] 9
	// Return 0,1 rather than 1,2
	public int[] twoSum(int[] numbers, int target) {
		int[] temp = new int[2];
		int index1 = 0;
		int index2 = 0;
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {   // How put array elements into hashMap
	            temp[1] = i;    
	            temp[0] = map.get(target - numbers[i]);
	            return temp;
	        }
	        map.put(numbers[i], i);
	    }
	    
	    index1 = Arrays.asList(numbers).indexOf(temp[0]);
	    index2 = Arrays.asList(numbers).indexOf(temp[1]);
	    
	    return new int[]{index1+1, index2+1};
    }
}
