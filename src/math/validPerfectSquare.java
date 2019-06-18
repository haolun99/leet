package math;
// 367
public class validPerfectSquare {
	public boolean isPerfectSquareSol(int num) {
		long high = num;
        long low = 1;

        while (low <= high) {
            long mid = (high + low) / 2;
            long value = mid * mid;
            if (value == num) {
                return true;
            }
            
            if (value > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
	 }
	
	
	
	// Method two
   // This could reduce to math problem
//			1 = 1
//			4 = 1 + 3
//			9 = 1 + 3 + 5
//			16 = 1 + 3 + 5 + 7
//			25 = 1 + 3 + 5 + 7 + 9
//			36 = 1 + 3 + 5 + 7 + 9 + 11
//	
	public boolean isPerfectSquareMath(int num) {
	     int i = 1;
	     while (num > 0) {
	         num -= i;
	         i += 2;
	     }
	     return num == 0;
	 }
	
	// Method three
	// Worked but Slow
	public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1 || num == 4 ) // Watch out 4
        	return true;
        
        for(int i = 0; i < num / 2; i++) {
        	// int x = i * i;
        	long x; // Use long to avoid overflow
        	x = i * i;
        	if(num == x)
        		return true;
        	else if(num < x)
        		return false;
        	else
        		continue;
        }
    	
    	return false;
    }
}
