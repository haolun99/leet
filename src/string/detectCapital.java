package string;
// 520
public class detectCapital {
	
	 public boolean detectCapitalUse(String word) {
	        // substring(1) index 1 to the end
		 
		 return word.equals(word.toUpperCase()) ||
				word.equals(word.toLowerCase()) ||
				Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());
	    }
}
