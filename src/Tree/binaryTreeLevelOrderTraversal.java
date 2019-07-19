package Tree;
// 102
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryTreeLevelOrderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        
	        List<List<Integer>> result = new LinkedList<List<Integer>>(); // final output list
	        
	        if(root == null) return result;
	        
	        queue.offer(root);
	        
	        while(!queue.isEmpty()) {
	        	int level = queue.size(); // Number of elements for each level
	        	List<Integer> subList = new LinkedList<Integer>(); // List to store elements for each level
	        	for(int i = 0; i < level; i++) { // Iterate each level
	        		if(queue.peek().left != null) queue.offer(queue.peek().left);
	        		if(queue.peek().right != null) queue.offer(queue.peek().right);
	        		subList.add(queue.poll().val);
	        	}
	        	result.add(subList); // add each subList to the result list
	        }
	        
	        return result;
	    }
}
