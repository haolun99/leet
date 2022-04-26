package binarySearch;

public class findFirstAndLastIndexSortedArray {
    // 34

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        // Use binary search for twice
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }

    private int findFirst(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;


        while (low <= high) {
            int mid = low + ((high - low) / 2); // avoid Integer overflow
            if (target <= nums[mid]) { // skip the first occurrence target value until the most left side
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target)
                index = mid;

        }


        return index;
    }


    private int findLast(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;


        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (target >= nums[mid]) { // Skip the first occurrence of target value until more left side
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target)
                index = mid;
        }


        return index;
    }


}
