package windowSliding;

public class maximumSumOfK {
	
	public static void main(String[] args) {
		// Test two methods
		int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
		int k = 4;
		int n = arr.length;
		System.out.println(maxSum(arr, n, k));
		System.out.println(maxSumWindow(arr, n, k));
	}
	
	// Brute force
	public static int maxSum(int arr[], int n, int k) {
		int max_sum = Integer.MIN_VALUE;
		
		for(int i = 0; i < n - k + 1; i++) {
			int current_sum = 0;
			
			for(int j = 0; j < k; j++)
				current_sum = current_sum + arr[i + j];
				
				max_sum = Math.max(current_sum, max_sum);
		}
		
		return max_sum;
	}
	
//	public static int minSum(int arr[], int n, int k) {
//		int max_sum = Integer.MIN_VALUE;
//		for(int i = 0; i < n - k + 1; i++) {
//			int current_sum = 0;
//			
//			for(int j = 0; j < k; j++) {
//				current_sum = current_sum + arr[i + j];
//			}
//			
//			max_sum = Math.max(current_sum, max_sum);
//		}
//		
//		return 0;
//	}
	
	public static int maxSumWindow(int arr[], int n, int k) {
		if(n < k) {
			return -1;
		}
		
		int max_sum = 0;
		for(int i = 0; i < k; i++) {
			max_sum += arr[i];
		}
		
		int window_sum = max_sum;
		
		for(int i = k; i < n; i++) {
			window_sum += arr[i] - arr[i - k];
			max_sum = Math.max(max_sum, window_sum);
		}
		
		return max_sum;
	}
	
	
}
