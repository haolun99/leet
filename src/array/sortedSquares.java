package array;
// 977
import java.util.Arrays;

public class sortedSquares {
	// My answer
	public int[] sortedSquares(int[] A) {
		int num[] = new int[A.length];
		for(int i =0;i < A.length; i++) {
			num[i] = A[i] * A[i];
		}
		
		Arrays.parallelSort(num);
		
		return num;
	}
	
	// Solution
	public int[] SolsortedSquares(int[] A) {
        int i=0;
        int j=A.length-1;
        int[] B=new int[j+1];
        for(int k=j;k>=0;k--)
        {
            if(A[i]*A[i]>A[j]*A[j])
            {
                B[k]=A[i]*A[i];
                i++;
            }else{
                B[k]=A[j]*A[j];
                j--;
            }
        }
        return B;
    }
}
