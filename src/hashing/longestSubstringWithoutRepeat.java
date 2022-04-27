package hashing;
// 3
import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeat {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		
		int result = 0;
		int i = 0, j = 0;
		int n = s.length();
		
		while(i < n && j < n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++)); // j++ use j then j = j + 1
				result = Math.max(result, j - i);
			}else {
				set.remove(s.charAt(i++));
			}
		}
		
		return result;
	}
}
