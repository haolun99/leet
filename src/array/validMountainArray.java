package array;
// 941
public class validMountainArray {
     public boolean validMountainArray(int[] A) {
          int n = A.length;
          int i = 0;
          int j = n - 1;
          
          while(i < n - 1 && A[i] < A[i + 1]) i++;  // Climb from left to right
          
          while(j > 0 && A[j] < A[j - 1]) j--;  // Climb from right to left
    	 
    	 return i > 0 && i == j && j < n - 1; // (0, n - 1) Exclude two sides since MountainArray could not be single point
    	 
    	 //越过山丘，才发现无人等候
    }
}
