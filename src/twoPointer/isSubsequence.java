package twoPointer;
// 392
public class isSubsequence {
	// s: abc
	// t: ahbgdc
	public boolean isSubsequence(String s, String t) {
		if(s.length() == 0) return true;
		
		int indexS = 0, indexT = 0;
		
		while(indexT < t.length()) {
			if(s.charAt(indexS) == t.charAt(indexT)) {
			 // if(s.indexOf(indexS) == t.indexOf(indexT)) { Wrong
				indexS++;
				if(indexS == s.length()) return true;
			}
			indexT++;
		}
		
		return false;
	}
}
