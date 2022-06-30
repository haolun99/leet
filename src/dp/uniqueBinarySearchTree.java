package dp;
// 96
public class uniqueBinarySearchTree {
	 public int numTrees(int n) {
	     int[] arr =new int[n + 1];
	     arr[0] = arr[1] = 1;
	     
	     for(int i = 2; i <= n; i++) {
	    	 for(int j = 0; j < i; j++ ) {
	    		 arr[i] += arr[j] * arr[i - j - 1];
	    	 }
	     }
		 
		 return arr[n];
	    }
}
