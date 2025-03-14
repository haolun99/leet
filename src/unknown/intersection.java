package unknown;

import java.util.*;

// 2248

public class intersection {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> courseCount = new HashMap<>();
        int listSize = nums.length;

        // Count each course across all arrays
        for (int[] list : nums) {
            Set<Integer> uniqueCourses = new HashSet<>();
            for (int course : list) {
                // Avoid counting the same course multiple times in the same list
                if (!uniqueCourses.contains(course)) {
                    courseCount.put(course, courseCount.getOrDefault(course, 0) + 1);
                    uniqueCourses.add(course);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : courseCount.entrySet()) {
            if(entry.getValue() == listSize) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        intersection sol = new intersection();

        // Test Case 1
        int[][] nums1 = {
                {1, 2, 3},
                {2, 3, 4},
                {2, 3, 5}
        };
        System.out.println("Test Case 1: " + sol.intersection(nums1)); // Should output [2, 3]

        // Test Case 2
        int[][] nums2 = {
                {1},
                {2},
                {3}
        };
        System.out.println("Test Case 2: " + sol.intersection(nums2)); // Should output []

        // Test Case 3
        int[][] nums3 = {
                {1, 2},
                {1, 2},
                {1, 2}
        };
        System.out.println("Test Case 3: " + sol.intersection(nums3)); // Should output [1, 2]
    }
}
