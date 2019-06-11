package array;
// 75
public class sortColors {

	public void sortColors(int[] nums) {
		int zero = 0;
		int one = 0;
		int two = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zero++;
			} else if (nums[i] == 1) {
				one++;
			} else {
				two++;
			}
		}
		
		//for(int j = 0; j < nums.length; j++);{ // Notice ; 
//			for(int j = 0; j < nums.length; j++){
//			if(nums[j] == 0) {
//				zero++;
//			}else if(nums[j] == 1) {
//				one++;
//			}
//			else {
//				two++;
//			}
//		}

		for (int i = 0; i < zero; i++) {
			nums[i] = 0;
		}

		for (int i = 0; i < one; i++) {
			nums[zero + i] = 1;
		}

		for (int i = 0; i < two; i++) {
			nums[zero + one + i] = 2;
		}

	}

}
