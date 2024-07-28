package DSA;

public class MaxProfit {
	public static int maxProfit(int[] prices) {
		 int buy_price = prices[0];
	        int max_profit = 0;
	        int current_profit = 0;
	        for(int i =0;i<prices.length;i++){
	            if(prices[i]<buy_price){
	                buy_price = prices [i];
	            }
	            else{
	                current_profit = prices[i] - buy_price;
	                max_profit = Math.max(max_profit,current_profit);
	            }
	        }
	        return max_profit;
	    }
		
	
public static void main(String args[]) {
	int[] prices = {7,1,5,3,6,4};
	int max_profit =maxProfit(prices);
	System.out.println(max_profit + " is the maximum profit");
}
}
