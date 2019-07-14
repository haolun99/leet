package backtracking;
// 39
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(candidates);

		backtrack(list, new ArrayList<>(), candidates, target, 0);

		// return null; Wrong
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start) {
		// TODO Auto-generated method stub
		if (remain < 0)
			return;
		else if (remain == 0)
			// list.add(tempList); Wrong
			list.add(new ArrayList<>(tempList));
		else {
			for (int i = start; i < candidates.length; i++) {
				tempList.add(candidates[i]);
				backtrack(list, tempList, candidates, remain - candidates[i], i); // not i+1 , since element could be
																					// reused
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
