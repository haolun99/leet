package stack;

import java.util.ArrayDeque;
import java.util.Deque;
// 921
public class minimumAddParenthesesValid {
	public int minAddToMakeValid(String S) {
        Deque<Character> queue = new ArrayDeque<>();
        int count = 0;
        
        // Only push '(' to the queue, never push ')'
        // if ')' detected:
           // queue empty, then use count for no match '('
           // queue not empty(contain '('), pop '('
        // result equal to size of queue(left not match '(' + count(no match ')'))
        for(char c : S.toCharArray()) {
        	if(c == '(')
        		queue.push(c);
        	else if(queue.isEmpty())
        		count++;
        	else
        		queue.pop();
        }
        
		
		return queue.size() + count;
	}
}
