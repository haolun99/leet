package Tree;
// 700
import Tree.symmetricTree.TreeNode;

public class searchBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}	
	
	// recursion
	public TreeNode searchBST(TreeNode root, int val) {
		if(root == null) return null;
		if(root.val == val) return root;
		else 
			return val < root.val? searchBST(root.left, val) : searchBST(root.right, val);
			
		}
	
	// iteration
	public TreeNode searchBSTIter(TreeNode root, int val) {
		while(root != null && root.val != val) {
			root = val < root.val? root.left : root.right;
		}
		return root;
	}
}
