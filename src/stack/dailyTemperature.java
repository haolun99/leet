package stack;

import java.util.Arrays;
import java.util.Stack;

// 739
public class dailyTemperature {
		public static void main(String[] args) {
			int[] array= {73, 74, 75, 71, 69, 72, 76, 73};
		    System.out.println(new dailyTemperature().dailyTemperatures(array)); 
		    // Output is wrong
		    // To do : How to test the method below
		}
	
	public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack();
        int[] arr = new int[T.length];
        int[] index = new int[T.length]; // Collect index
        
        for(int i = T.length - 1; i >= 0; i--) {
        	while(!stack.isEmpty() && stack.peek() < T[i])
        		stack.pop();
        	
        	if(stack.isEmpty())
        		arr[i] = 0;
        	else
        		arr[i] = stack.peek();
        	
        	stack.push(T[i]);
        }
        
        // To do : How to find the index/position of each element of an array on the other array
        // index[]: collect index
        // T[] : original array
        // arr[] : given array
        
        for(int j = 0; j < index.length; j++) {
        	index[j] = Arrays.binarySearch(T, arr[j]); // find the index for each element
        	if(index[j] == -1) {  //return -1 if no element found, return 0 instead
        		index[j] = 0;
        	}
        }
        
        return index;
    }
}
