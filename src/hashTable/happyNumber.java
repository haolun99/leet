package hashTable;
// 202
import java.util.HashSet;
import java.util.Set;

public class happyNumber {
	
	// Solution 
	  public boolean isHappyOne(int n) {
        Set<Integer> set = new HashSet<Integer>();
	     
	     int digit, sum;
	     
	     while(set.add(n)) {
             sum = 0;  // Question 1: Initialize sum inside
	    	 while(n > 0) { 
	    		 digit = n % 10;
	    		 sum += digit * digit;
	    		 n /= 10;
	    	 }
	    	 if(sum == 1) 
	    		 return true;
	    	 
	    	 else
	    		 n = sum;
	    	 
	     }
		 
		 return false;
	  }
	
	
	// Cause Time Limit Exceed if initialize sum outside the while loop
	public boolean isHappy(int n) {
	     Set<Integer> set = new HashSet<Integer>();
	     
	     int digit = 0;
	     int sum = 0;
	     while(set.add(n)) {
	    	 while(n > 0) { 
	    		 digit = n % 10;
	    		 sum += digit * digit;
	    		 n /= 10;
	    	 }
	    	 if(sum == 1) 
	    		 return true;
	    	 
	    	 else
	    		 n = sum;
	    	 
	     }
		 
		 return false;
	    }
}
