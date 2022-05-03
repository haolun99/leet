package array;

public class findKthMissingPOsitive {
    // 1539

    public int findKthPositive(int[] arr, int k) {

        for(int num : arr){
            if(num <= k)
                k++;
            else
                break;
        }

        return k;
    }

}
