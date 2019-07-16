package stack;
// 94
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binaryTreeInorder {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {val = x;}
	}
	
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> list = new ArrayList<>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode cur = root;
	       // Stack<Integer> stack = new Stack(); Wrong
	        while(cur != null || !stack.empty()) {
	        	while(cur != null) {
	        		stack.add(cur);
	        		cur = cur.left;
	        	}
	        	// cur == null (already iterate to the bottom end)
	        	cur = stack.pop();
	        	list.add(cur.val);
	        	// list.add(cur); Wrong
	        	cur =cur.right;
	        }
	        
	        return list;
	        
	        
	    }
}
