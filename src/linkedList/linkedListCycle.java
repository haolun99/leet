package linkedList;
// 141
import java.util.HashSet;

public class linkedListCycle {
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	
	/*
	 * We go through each node one by one and record each node's reference (or memory address) in a hash table. 
	 * If the current node is null, we have reached the end of the list and it must not be cyclic. 
	 * If current node¡¯s reference is in the hash table, then return true.
	 */
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        while(head != null) {
        	if(set.contains(head)) {
        		return true;
        	}
        	else {
        		set.add(head);
        	}
        	head = head.next;
        	
        }
        return false;
    }
}
