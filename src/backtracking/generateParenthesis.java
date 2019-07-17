package backtracking;

// 22
import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();

		backtracking(list, "", 0, 0, n);

		return list;
	}

	private void backtracking(List<String> list, String str, int left, int right, int max) {
		// TODO Auto-generated method stub
		if (str.length() == 2 * max) {
			list.add(str);
			return;
		}

		if (left < max)
			backtracking(list, str + "(", left + 1, right, max);
		if (right < left)
			backtracking(list, str + ")", left, right + 1, max);
	}
}
