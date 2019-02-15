package string;

public class NoteToLowerCase {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(new NoteToLowerCase().toLowerCase(s));
	}
	
	public String toLowerCase(String str) {
		String s = str.toLowerCase();
		
		return s;
	}
}
