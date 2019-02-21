package stack;

import java.util.Stack;

// 844
public class backspace {
	
	// To do: Use index instead stack to improve efficient
	
		public boolean backspaceCompare(String S, String T) {
			
			return helper(S).equals(helper(T)); // Compare two string directly
    }
		
		// Create helper method outside the given method
		public String helper(String s) {
			Stack<Character>stack = new Stack(); // <Character>
			
			for(Character c : s.toCharArray()) {
				if(c != '#') {  // Character '' ; String ""
					stack.push(c);
				}else if(!stack.empty()){ 
											// Check empty in case "a##c"
										// ? c == '#' && !stack.empty()
					                      // What happened if "else if" contain another condition?
					stack.pop();
				}
			}
			
			return String.valueOf(stack); // change stack to comparable string
		}
}
