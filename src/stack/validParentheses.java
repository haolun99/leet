package stack;
// 20
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
// £¨1£© Open brackets must be closed by the same type of brackets.
// £¨2£© Open brackets must be closed in the correct order.
// Notice the second is important!
import java.util.Stack;

public class validParentheses {
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(char c : s.toCharArray()) {
        	if(c == '(') {
        		stack.push(')');
        	}else if(c == '[') {
        		stack.push(']');
        	}else if(c == '{') {
        		stack.push('}');
        	}else if(stack.isEmpty() || stack.pop() != c){
        		return false;
        	}
        }
		//return true; // Wrong
        return stack.isEmpty();
    }
	
	
	
	// Not work for case "(}" five == six == 0, return true but should retrun false
//	public boolean isValidWrong(String s) {
//		Stack<Character> stack = new Stack();
//		boolean flag = false;
//		for (char c : s.toCharArray()) {
//			int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0; 
//			if (c == '(') {
//				one++;
//			} else if(c == ')') {
//				two++;
//			}
//			else if(c == '{') {
//				three++;
//			} else if (c == '}') {
//				four++;
//			}
//			else if (c == '[') {
//				five++;
//			} else {
//				six++;
//			}
//			
//			flag = ( one == two) || (three == four) || (five == six);
//		}
//		
//		return flag;
//	}
}
