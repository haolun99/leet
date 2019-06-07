package Tree;
// 101
public class symmetricTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSymmetric(TreeNode root) {

		return check(root, root);
	}

	// create a help method
	public boolean check(TreeNode t1, TreeNode t2) {
		boolean flag;
		if (t1 == null && t2 == null)
			flag = true;
		else if (t1 == null || t2 == null)
			flag = false;
		else {
		flag = (t1.val == t2.val) && check(t1.right, t2.left) && check(t1.left, t2.right);}

		return flag;

	}
}
