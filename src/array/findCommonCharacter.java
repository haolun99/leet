package array;
// 1002
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findCommonCharacter {
		public List<String> commonChars(String[] A) {
			List<String> list = new ArrayList<>();
			// List<String> list = new ArrayList();  // What's difference
			
			int[] count = new int[26];
			Arrays.fill(count, Integer.MAX_VALUE);
			
			for(String str : A) {
				int[] cnt =  new int[26];
				for(int i = 0; i < str.length(); i++) {
					cnt[str.charAt(i) - 'a']++;  // count the occurrence of each character
				}
				for(int i = 0; i < 26; i++) {
					count[i] = Math.min(cnt[i], count[i]); // find the minimum repeated times
				}
			}
			
			for(char c = 'a'; c <= 'z'; c++) {
				while(count[c - 'a']-- > 0) {  // Count down to the number of repeated times of a character
					list.add("" + c);
				}
			}
			
			return list;
    }
}
