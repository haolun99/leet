package Tree;
// 112
import Tree.searchBinaryTree.TreeNode;

public class pathSum {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		
		if(root.left == null && root.right == null && sum - root.val == 0) return true;
		
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}
}
