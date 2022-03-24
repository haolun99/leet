package math;

public class PalindromeNumber {
		//
	public static void main(String[] args){
		int num = 121;
		System.out.println(isPalindrome(num));
	}

		public static boolean isPalindrome(int x) {

			String temp = Integer.toString(x);
			boolean flag = false;

			String reversed = new StringBuffer(temp).reverse().toString();

			if(x < 0) return false;

			// if (temp == reversed){
				 else if (temp.contentEquals(reversed)){
				flag = true;
			}

			else{
				flag = false;
			}

			return flag;

    }
}
