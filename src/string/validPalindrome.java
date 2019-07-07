package string;
// 125
public class validPalindrome {
	public static void main(String[] args) {
		String s = "0P";
		System.out.println(s.replaceAll("\\W+", "")); // return "0P"
	}
	
	// alphanumeric characters: contains letters and numbers
	 public boolean isPalindrome(String s) {
	     String str = s.replaceAll("\\W+", "").toLowerCase();
	     
	     StringBuilder builder = new StringBuilder(str);
		 
		 return str.equals(builder.reverse().toString());
	    }
}
