package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumTwo {
  //  all unique combinations
	// each element can not be reused
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start) {
	// TODO Auto-generated method stub
	if(remain < 0) return;
	else if(remain == 0) list.add(new ArrayList<>(tempList));
	else {
		for(int i = start; i < candidates.length; i++) {
			// Important, skip duplicate values
			// [1, 1, 6] contains in the result
			// but [1, 1, 6], [1, 1,6] is not allowed in the result
			if(i > start && candidates[i] == candidates[i-1]) continue; 
			
			tempList.add(candidates[i]);
			backtrack(list, tempList, candidates, remain - candidates[i], i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
}
