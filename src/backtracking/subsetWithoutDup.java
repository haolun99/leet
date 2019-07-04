package backtracking;
// 90
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetWithoutDup {
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		// TODO Auto-generated method stub
		list.add(new ArrayList<>(tempList));
		for(int i = start; i < nums.length; i++) {
			if(i > start && nums[i] == nums[i - 1]) continue; // Quit this iteration and operate next iteration
			// if(i > start && nums[i] != nums[i - 1]) continue; Wrong
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			//backtrack(list, tempList, nums, start + 1); Wrong
			//backtrack(list, new ArrayList<>(), nums, start + 1); Wrong
			tempList.remove(tempList.size() - 1);
		}
	}
}
