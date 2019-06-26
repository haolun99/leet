package bfs;
// 515
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class findLargestInEachTreeRow {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public List<Integer> largestValues(TreeNode root) {
		 Queue<TreeNode> q = new LinkedList<>();
	     TreeNode x = root;
	     if(x != null) q.offer(x); // "offer" is similar to "add", but if queue is full, "offer" return false.
	     
	     List<Integer> result = new ArrayList();
	     
	     while(!q.isEmpty()) {
	    	 int max = Integer.MIN_VALUE;
	    	 int size = q.size();
	    	// for(int i = 0; i < q.size(); i++) { // Should initialize size before loop, other wise return false output,
	    	 // Since the size of the queue is changeable each time
	    	 	for(int i = 0; i < size; i++) {
	    		 TreeNode node = q.poll();
	    		 max = Math.max(max, node.val);
	    		 if(node.left != null) q.offer(node.left);
	    		 if(node.right != null) q.offer(node.right);
	    	 }
	    	 result.add(max);
	     }
	     
		 return result;
	    }
}
