package Tree;

public class maxDepth {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int diameterOfBinaryTree(TreeNode root) {
        return rec_func(root,0);
    }
    
	public int rec_func(TreeNode node, int depth){
        if (node == null)
            return depth;
        else
            return Math.max(rec_func(node.left,depth + 1),rec_func(node.right,depth + 1));}

	
}
