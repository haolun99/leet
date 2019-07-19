package linkedList;
// 21
public class mergeTwoSortedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {val = x;}
	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        // Base case
		     if(l1  == null) return l2;
		     if(l2 == null) return l1;
		     
		     ListNode current;
		     if(l1.val < l2.val) {
		    	 current = l1;
		     current.next = mergeTwoLists(l1.next , l2);
		     }
		     else {
		     
		    	 current = l2;
		     current.next = mergeTwoLists(l1, l2.next);
		     }
		     
		     return current;
		     
	    }
}
