package string;
// 520
//Given a word, you need to judge whether the usage of capitals in it is right or not.
//
//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//(1)All letters in this word are capitals, like "USA".
//(2)All letters in this word are not capitals, like "leetcode".
//(3)Only the first letter in this word is capital, like "Google".
public class detectCapital {
	
	 public boolean detectCapitalUse(String word) {
	        // substring(1) index 1 to the end
		 
		 return word.equals(word.toUpperCase()) ||
				word.equals(word.toLowerCase()) ||
				Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase());
	    }
}
