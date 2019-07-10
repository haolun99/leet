package string;
// 1047
public class removeAdjacentDuplicate {
	public String removeDuplicates(String S) {
		StringBuilder sb = new StringBuilder();
		for(char c : S.toCharArray()) {
			int size = sb.length();
			if(size > 0 && c == sb.charAt(size - 1)) {
				sb.deleteCharAt(size - 1);
			}
			else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
