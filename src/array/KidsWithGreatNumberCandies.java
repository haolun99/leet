package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatNumberCandies {
        public static void main(String[] args){
        int[] test = {2,3,5,1,3};
        int extra  = 3;
        System.out.println(new KidsWithGreatNumberCandies().kidsWithCandies(test, extra));
        }

    // 1431
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);

        int[] temp = candies.clone();
        Arrays.sort(temp);
        int greatestNumber = temp[temp.length - 1];

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatestNumber){
                res.add(true);
            }else{
                res.add(false);
            }
        }

        return res;
    }
}
