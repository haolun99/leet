package stack;
// 917
import java.util.Stack;

public class reverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        Stack<Character> stack = new Stack();
        
        for(char c : S.toCharArray()) {
        	if(Character.isLetter(c)) {
        		stack.push(c);
        	}
        }
        
        StringBuilder builder = new StringBuilder();
        
        for(char c : S.toCharArray()) {
        	if(Character.isLetter(c)) {
        		builder.append(stack.pop());
        	}
        	else {
        		builder.append(c);
        	}
        }
        
    	return builder.toString();
    }
}
