package string;
// 551
public class studentAttendanceRecord {
	public boolean checkRecord(String s) {
		int A = 0;
		int conL = 0;
		
		for(int i = 0; i < s.length(); i++) {
			// if(s.indexOf(i) == 'A') {  // indexOf() return the index of the first occurrence of the string 
			if(s.charAt(i) == 'A') {
				A++;
				conL = 0;
			}
		   else if(s.charAt(i) == 'L') {
				conL ++;
			}else {
				conL = 0;
			}
			if(A > 1 || conL > 2) {
				return false;
			}
		}
		
		return true;
		
	   // return !s.matches(".*LLL.*|.*A.*A.*");
	}
}
