package string;

import java.util.Arrays;

public class findDifference {
	public char findTheDifference(String s, String t) {
		char[] arr1 =s.toCharArray();
		char[] arr2 = t.toCharArray();
		char result = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i = 0; i < t.length(); i++) {
			if(arr1[i] != arr2[i]) {
				result = arr1[i];
			}
		}
		return result;
	}
}
