package hashing;

import java.util.HashMap;

public class numberOfGoodPairs {
    // 1512
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // [1,2,3,1,1,3]
        int result = 0;

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
            result += map.get(n) - 1;
        }

        return result;
    }
}
