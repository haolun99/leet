package hashTable;
// 17
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombination {
	public static void main(String[] args) {
		String str = "string";
		System.out.println(str.substring(0, 1));
		System.out.println(str);
	}

	Map<String, String> map = new HashMap<String, String>() {
		{
			put("2", "abc");
			put("3", "def");
			put("4", "ghi");
			put("5", "jkl");
			put("6", "mno");
			put("7", "pqrs");
			put("8", "tuv");
			put("9", "wxyz");
		}
	};

	List<String> result = new ArrayList<String>();

	public List<String> letterCombinations(String digits) {
		if (digits.length() != 0) {
			backtrack("", digits);
		}

		return result;

	}

	private void backtrack(String combination, String nextDigits) {
		// TODO Auto-generated method stub
		if (nextDigits.length() == 0) // Already iterate all the digits
			result.add(combination);

		else {
			String digit = nextDigits.substring(0, 1);
			String letters = map.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				String letter = map.get(digit).substring(i, i + 1);
				backtrack(combination + letter, nextDigits.substring(1)); // Move out first digit, iterate remaining
			// backtrack(combination + nextDigits, nextDigits.substring(1)); Wrong
			}
		}
	}

}
