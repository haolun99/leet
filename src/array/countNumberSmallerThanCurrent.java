package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countNumberSmallerThanCurrent {
    // 1365

    public static void main(String[] args){
        int[] test = {8,1,2,2,3};
        System.out.println(Arrays.toString(new countNumberSmallerThanCurrent().smallerNumbersThanCurrent(test)));
    }

    /*
    Let's use this input for illustration: [8,1,2,2,3]

    Create a copy of the input array. copy = [8,1,2,2,3]
    Sort the copy array. copy = [1,2,2,3,8]
    Fill the map: number => count (where count is an index in sorted array, so first number with index 0 has 0 numbers less than it, index 1 has 1 number less, etc). We update only first time we enocunter the number so that way we skip duplicates.
            map[1]=>0
    map[2]=>1
    map[3]=>3
    map[8]=>4
    We re-use our copy array to get our result, we iterate over original array, and get counts from the map.
[4,0,1,1,3]
    */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = nums.clone(); // copy[] [8,1,2,2,3]

        Arrays.sort(copy); // copy[] [1,2,2,3,8]

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
                map.putIfAbsent(copy[i], i);  // 1 -> 0; 2 -> 1; skip; 3 -> 3; 8 -> 4
        }

        for(int i = 0; i < nums.length; i++){
            copy[i] = map.get(nums[i]);  // [0]; [0,1]; [0,1,1]; [0,1,1,3]; [0,1,1,3,4]
        }

        return copy;
    }
}
