package string;
// 125
public class validPalindrome {
	public static void main(String[] args) {
		String s = "0P";
		System.out.println(s.replaceAll("\\W+", "")); // return "0P"
	}
	
	// Solution
	public boolean isPalindromeSol(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
                return false;
        }
        return true;
    }
	
	// alphanumeric characters: contains letters and numbers
	 public boolean isPalindrome(String s) {
	     String str = s.replaceAll("\\W+", "").toLowerCase();
	     
	     StringBuilder builder = new StringBuilder(str);
		 
		 return str.equals(builder.reverse().toString());
	    }
}
