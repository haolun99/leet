package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {
    // 1748
    public static void main(String[] args){
        int[] test = {1,1,1,1,1};

        System.out.println(new SumOfUnique().sumOfUnique(test));
    }

    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        int result = 0;

        for(int num : nums){
            Integer occurrence = map.get(num);

            map.put(num, occurrence == null ? 1 : occurrence + 1);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
          if(e.getValue() == 1){
              result += e.getKey();
          }
        }

        return result;
    }
}
