package hashTable;
// 961
import java.util.HashMap;
import java.util.Map;

public class nRepeatedElement {
public int repeatedNTimes(int[] A) {
	int result = 0;
      Map<Integer, Integer> map = new HashMap();
      for(int n : A) {
    	  map.put(n, map.getOrDefault(n, 0) + 1); // Use hashMap to count the occurrence of each element in the array
    	  // If find n, count++. If n not found, put value 0 for this key(n)
      }
      
      for(int j : map.keySet()) // keySet
      if(map.get(j) > 1) {
    	  result = j;
      }
    	  
	return result;
      
     // throw null;
      
    }
}
