package twoPointer;
// 11
public class containerWithMostWater {
	// Brute force
	public int maxArea(int[] height) {
		int result = 0;
		
		for(int i = 0; i < height.length; i++) {
			for(int j = i + 1; j < height.length; j++) {
				result = Math.max(result, Math.min(height[i], height[j]) * (j - i));
			}
		}

		return result;
	}
}
