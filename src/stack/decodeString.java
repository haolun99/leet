package stack;

import java.util.Stack;

// 394

public class decodeString {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');  // Accumulate the number
            } else if (ch == '[') {
                countStack.push(num);  // Push the current count to the stack
                stringStack.push(currentString.toString());  // Push the current string to the stack
                currentString = new StringBuilder();  // Reset current string
                num = 0;  // Reset the current number
            } else if (ch == ']') {
                StringBuilder decodedString = new StringBuilder(stringStack.pop());  // Get the last string
                int currentCount = countStack.pop();  // Get the repeat count
                for (int i = 0; i < currentCount; i++) {
                    decodedString.append(currentString);  // Repeat the current string
                }
                currentString = decodedString;  // Update the current string
            } else {
                currentString.append(ch);  // Append the current character to the string
            }
        }

        return currentString.toString();
    }
}
