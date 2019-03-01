package string;
// 242
import java.util.Arrays;

public class validAnagram {
	// TODO: Create array with alphabet
	
	// Solution 1
	public boolean isAnagramOne(String s, String t) {
        int[] alphabet = new int[26];
       // Question 1: charAt() return a char, what is "char - char"
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
	
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] char1 = s.toCharArray();
		char[] char2 = t.toCharArray();

		Arrays.parallelSort(char1);
		Arrays.parallelSort(char2);

		return Arrays.equals(char1, char2);
	}
}
