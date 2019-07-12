package linkedList;
// 206
public class reverseLinkedList {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		
		while(cur != null) {
			ListNode temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		//return cur; Wrong
		return prev; // ?
	}
}
