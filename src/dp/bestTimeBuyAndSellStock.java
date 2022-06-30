package dp;
// 121
public class bestTimeBuyAndSellStock {
	
	public int maxProfit(int[] prices) {
        int maxcur = 0;
       int maxfar = 0;
       for(int i = 1; i < prices.length; i++) {
       	maxcur = Math.max(0, maxcur += prices[i] - prices[i - 1]);
       	maxfar = Math.max(maxcur, maxfar);
       }
       return maxfar;
   }
}
