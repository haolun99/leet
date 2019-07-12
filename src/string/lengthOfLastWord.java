package string;
// 58
public class lengthOfLastWord {
   public int lengthOfLastWord(String s) {
	   int count = 0;
	   String temp  = s.trim(); // eliminate leading and trailing space
       for(int i = temp.length() - 1; i >= 0; i--) {
	   // for(int i = s.length() - 1; i >= 0; i--) { Wrong string s has already change to temp
	  // for(int i = s.length() - 1; i > 0 ; i--) { Wrong case: [a]
		   if(temp.charAt(i) != ' ')
			   count++;
		   else break;
	   }
	   
	   return count;
    }
}
