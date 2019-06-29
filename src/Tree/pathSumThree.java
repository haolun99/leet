package Tree;
// 437
import Tree.pathSum.TreeNode;

	public class pathSumThree {
		public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
		
		public int pathSum(TreeNode root, int sum) {
			if(root == null) 
				return 0;
			
//			return findHelper(root, sum) + findHelper(root.left, sum) + findHelper(root.right, sum);
			return findHelper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
		}
		
		public int findHelper(TreeNode root, int sum) {
			int num = 0;
			if(root == null) 
				return num;
			
			// if(root.val == num)
			if(root.val == sum)
				num++;
			
//			num += findHelper(root.left, sum);
//			num += findHelper(root.right, sum);
			
			num += findHelper(root.left, sum - root.val);
			num += findHelper(root.right, sum - root.val);
			
			return num;
		}
}
