package string;
//  557
public class reverseStringThree {
	public static void main(String[] args) {
		String str = "";
	}
	
    public String reverseWords(String s) {
    	String words[]= s.split(" "); // split(), divide string
    	StringBuilder res = new StringBuilder();
    	for(String word : words) {
    		res.append(new StringBuffer(word).reverse().toString()
    				+ " ");
    	}
    	return res.toString().trim(); // trim() remove leading and trailing space
    }
	
	// My answer (84ms)
	/*
	 * public String reverseWords(String s) {
		String[] strArray = new String[] {s};
		
		String str[]=s.split(" "); 
	    String ans=""; 
	    for(int i=str.length - 1; i >= 0; i--) { 
	        ans+=str[i]+" "; 
	          
	    } 
		
		StringBuilder builder = new StringBuilder();
        
        builder.append(ans);
        
        builder = builder.reverse();
        builder.deleteCharAt(0);
		return builder.toString();
    }
    */
}
