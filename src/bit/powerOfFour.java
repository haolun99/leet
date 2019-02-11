package bit;

// 342
public class powerOfFour {
	// Suitable for same kind of question "Determine if power of N"
	// num % N != 0 then num = num / N
	
	public boolean isPowerOfFour(int num) {
		if (num == 0)
			return false;
		while (num != 1) {
			if (num % 4 != 0)
				return false;
			num = num / 4;
		}
		return true;
	}
}
