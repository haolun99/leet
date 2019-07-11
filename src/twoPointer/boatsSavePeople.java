package twoPointer;
// 881
import java.util.Arrays;

public class boatsSavePeople {
		public int numRescueBoats(int[] people, int limit) {
			int num = 0; // num of boats
			
			Arrays.sort(people);
			
			int  i = 0;
			int j = people.length - 1;
			
			while(i <= j) {
				num++;
				if(people[i] + people[j] <= limit) {
					i++;
				}
				j--;
			}
			return num;
    }
}
