package dfs;
// 337
import java.util.HashMap;
import java.util.Map;

public class HouseRobberThree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// Solution 1
	public int robSol(TreeNode root) {

		return helper(root, new HashMap<>());
	}

	private int helper(TreeNode root, Map<TreeNode, Integer> map) {
		int val = 0;
		if (root == null)
			return 0;
		if (map.containsKey(root))
			return map.get(root); // If contain the value, get this one

		if (root.left != null) {
			val += helper(root.left.left, map) + helper(root.left.right, map);
		}

		if (root.right != null) {
			val += helper(root.right.left, map) + helper(root.right.right, map);
		}

		val = Math.max(val + root.val, helper(root.left, map) + helper(root.right, map));

		map.put(root, val);

		return val;
	}

	// Solution 2
	public int rob(TreeNode root) {
		int[] num = dfs(root);
		return Math.max(num[0], num[1]);
	}

	private int[] dfs(TreeNode x) {
		if (x == null)
			return new int[2];// max(0, 0) = 0
		int[] left = dfs(x.left);
		int[] right = dfs(x.right);
		int[] res = new int[2];
		res[0] = left[1] + right[1] + x.val;
		res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
		return res;
	}
}
