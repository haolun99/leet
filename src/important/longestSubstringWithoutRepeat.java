package important;
// 3
import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeat {
		public static void main(String[] args) {
			String str = " ";
			System.out.println(new longestSubstringWithoutRepeat().lengthOfLongestSubstring(str));
		}
	
		
		// 
		public int lengthOfLongestSubstringOne(String s) {
			
			return 0;
		}
		
		
			
		// Brute force (Time Limit Exceeded)
	public int lengthOfLongestSubstring(String s) {
        // find all the substring
		/*
		 *  Don't need use data structure to collect all substring, 
		 *  instead invoke checkDuplicate() directly for each substring
		 */
		int result = 0;
		
		// if (s == " ") result = 1; // add this if use line 25 "j < s.length()"
		
		
		for(int i = 0; i < s.length(); i++) 
			// for(int j = i + 1; j < s.length(); j++) // Without =, this failed for case " ", should return 1 but 0
			 for(int j = i + 1; j <= s.length(); j++) 
				if(checkDuplicate(s, i, j)) 
					result = Math.max(result, j - i);
				
		return result;
    }
	
	// check if string contains duplicate
			public boolean checkDuplicate(String str, int start, int end) {
				HashSet<Character> set = new HashSet();
				
				for(int i = start; i < end; i++) {
					Character c = str.charAt(i);
					if(set.contains(c))
						return false;
					else {
						set.add(c);
					}
				}
				
				return true;
				
			}
}
