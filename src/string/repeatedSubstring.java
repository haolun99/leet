package string;
// 459
public class repeatedSubstring {
	public static void main(String[] args) {
		String str = "queen";
		System.out.println(str.substring(0, 1)); // q
		System.out.println(str.substring(0, 2));  // qu
	}
	
    public boolean repeatedSubstringPattern(String s) {
    	int length = s.length();
    	
    	for(int i =  length / 2; i >= 1 ; i--) { // ideal substring should show at least two times (repeated)
    		if(length % i == 0) { // length should be divide into i repeated times
    			int times = length / i; // the times of ideal substring show
    			StringBuilder builder = new StringBuilder();
    			for(int j = 0; j < times; j++) {
    				builder.append(s.substring(0, i)); // repeat add one string for some times
    			}
    			if(builder.toString().equals(s)) return true;
    		}
    			
    	}
    	
    	
    	return false;
    }
}
