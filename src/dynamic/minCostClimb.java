package dynamic;
// 746
public class minCostClimb {
	public int minCostClimbingStairs(int[] cost) {
		for (int i = 2; i < cost.length; i++) {
			cost[i] += Math.min(cost[i - 1], cost[i - 2]);
		}
		return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
	}
	
	// Not to modify the original array
	// discuss with interviewer whether the input is read only or not
}
