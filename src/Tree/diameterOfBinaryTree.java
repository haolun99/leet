package Tree;

public class diameterOfBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	
	// Not work when there is only one node in the tree
//	 public int diameterOfBinaryTree(TreeNode root) {
//	        return rec_func(root,0);
//	    }
//	    
//	    public int rec_func(TreeNode root, int depth){
//	    	if (root == null)
//	            return depth;
//	        else
//	            return Math.max(rec_func(root.left,depth + 1),rec_func(root.right,depth + 1));
//	    	}
}
