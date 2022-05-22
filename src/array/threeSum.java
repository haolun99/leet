package array;

import java.util.*;

public class threeSum {
    // 15

    public List<List<Integer>> threeSum(int[] nums) {
        // Create hashSet to avoid duplicate
        Set<List<Integer>> set = new HashSet<>();

        if(nums.length == 0)
            return new ArrayList<>(set);

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
            }
        }

        return  new ArrayList<>(set);
    }
}
