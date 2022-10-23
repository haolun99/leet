package array;

import java.util.Arrays;
import java.util.LinkedList;

public class mergeInterval {

    // 56
    public static void main(String[] args){
        int[][] array = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(array));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // (X1,Y1), (X2, Y2), (X3, Y3)
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        // Compare based on y
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
