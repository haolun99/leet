package string;
// 28
public class implementStr {
	public int strStrSol(String haystack, String needle) {
		 if(needle.equals("")) return 0;
		    int L = needle.length();
		    for(int i=0; i<=haystack.length()-L; i++) 
		        if(haystack.substring(i,i+L).equals(needle)) return i;
		    return -1;
	}
	
	public int strStr(String haystack, String needle) {
		// haystack = "hello", needle = "ll"
		int l1 = haystack.length();
		int l2 = needle.length();

		if (l1 < l2) { // Not need to check, otherwise for loop will not iterate
			return -1;
		} 
		else if (l2 == 0) {
			return 0;
		}
		for (int i = 0; i <= l1 - l2; i++) {
			if (haystack.substring(i, i + l2).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
