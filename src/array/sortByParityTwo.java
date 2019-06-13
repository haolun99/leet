package array;
// 922
public class sortByParityTwo {

	public int[] sortArrayByParityII(int[] A) {
		int[] result = new int[A.length];

		int even = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				result[even] = A[i];
				even += 2;
			}
		}

		int odd = 1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				result[odd] = A[i];
				odd += 2;
			}
		}

		return result;
	}
}
