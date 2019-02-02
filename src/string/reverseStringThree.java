package string;
//  557
public class reverseStringThree {
	public static void main(String[] args) {
		System.out.println();
	}
	// Answer (5ms)
	public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String word: words){
            sb.append(reverse(word.toCharArray()));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() -1);
        return sb.toString();
    }
    public String reverse(char[] ch){
        int s =0;
        int e = ch.length-1;
        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        return new String(ch);
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
