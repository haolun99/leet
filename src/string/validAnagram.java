package string;
// 242
import java.util.Arrays;

public class validAnagram {
	// TODO: Create array with alphabet
	
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
