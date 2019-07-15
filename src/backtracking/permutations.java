package backtracking;
// 46
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations {
	// All distinct elements, no duplicates in nums array
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtracking(list, new ArrayList<>(), nums);

		return list;
	}

	private void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		// TODO Auto-generated method stub
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue; // already contain elements, skip
				// if(tempList.contains(nums[i])) break; Wrong
				// if(tempList.contains(nums[i])); Wrong
				tempList.add(nums[i]);
				backtracking(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}

	}
}
