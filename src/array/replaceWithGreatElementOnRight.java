package array;

import java.util.Arrays;

public class replaceWithGreatElementOnRight {
    public static void main(String[] args){
        int[] test = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(new replaceWithGreatElementOnRight().replaceElements(test)));
    }

    // 1299
    public int[] replaceElements(int[] arr) { // Input [17,18,5,4,6,1] Output [18,6,6,6,1,-1]
        int[] result = new int[arr.length];
        int max = -1;

        for(int i = arr.length - 1; i >= 0 ; i--){
            result[i] = max;
            if(arr[i] > max){
                max = arr[i];
            }

        }

        return result;
    }
}
