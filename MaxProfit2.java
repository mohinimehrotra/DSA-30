package DSA;

public class MaxProfit2 {
	public static int maxProfit2(int[] prices) {
		int profit =0;
		for(int i =1;i<prices.length;i++) {
			if(prices[i]>prices[i-1]) {
				profit += prices[i] - prices[i-1];
			}
		}
		return profit;
	}
	
	public static void main(String args[]) {
		int[] prices = {7,1,5,3,6,4};
		int max_profit =maxProfit2(prices);
		System.out.println(max_profit + " is the maximum profit");
	}
}
