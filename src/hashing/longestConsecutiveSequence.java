package hashing;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {
    // 128

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            set.add(num);
        }

        int longestNum = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int counter = 1; // reset counter to 1 for each number in the array

                while(set.contains(currentNum + 1)){
                    counter++;
                    currentNum++;
                }

                longestNum = Math.max(longestNum, counter);
            }
        }

        return longestNum;
    }
}
