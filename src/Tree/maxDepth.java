package Tree;
// 543
public class maxDepth {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	 int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    	// Wrong if put int max = 0 inside
        if(root == null)
            return 0;
        max = Math.max(max, rec_func(root.left) + rec_func(root.right));
        diameterOfBinaryTree(root.left); // Iterate left sub-tree recursively
        diameterOfBinaryTree(root.right);
        return max;
    }
    public int rec_func(TreeNode root){
        if(root == null)  // If there is only one node of the tree, root.left and root.right are null, both return 0
            return 0;
        return 1 + Math.max(rec_func(root.left), rec_func(root.right));
    }



	
}
