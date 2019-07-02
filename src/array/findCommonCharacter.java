package array;
// 1002
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findCommonCharacter {
		public List<String> commonChars(String[] A) {
			List<String> list = new ArrayList<>();
			// List<String> list = new ArrayList();
			
			int[] count = new int[26];
			Arrays.fill(count, Integer.MAX_VALUE);
			
			for(String str : A) {
				int[] cnt =  new int[26];
				for(int i = 0; i < str.length(); i++) {
					cnt[str.charAt(i) - 'a']++;
				}
				for(int i = 0; i < 26; i++) {
					count[i] = Math.min(cnt[i], count[i]);
				}
			}
			
			for(char c = 'a'; c <= 'z'; c++) {
				while(count[c - 'a']-- > 0) {
					list.add("" + c);
				}
			}
			
			return list;
    }
}
