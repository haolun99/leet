package array;
// 905
public class sortByParity {

	 public int[] sortArrayByParity(int[] A) {
	     int[] result = new int[A.length];
	     int start = 0;
	     int end = A.length - 1;
	     
	     for(int i = 0; i < A.length; i++) {
	    	 if(A[i] % 2 != 0) {
	    		 result[end--] = A[i];
	    	 }
	     }
	     
	     for(int i = 0; i < A.length; i++) {
	    	 if(A[i] % 2 == 0) {
	    		 result[start++] = A[i];
	    	 }
	     }
	     
	     return result;
		 
	    }
}
