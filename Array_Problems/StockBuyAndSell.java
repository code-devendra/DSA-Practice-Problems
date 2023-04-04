import java.util.*;
public class StockBuyAndSell{

	/* This is a Efficient Solution that takes big O(n) time */
	public static int maxProfit(int price[], int n){
		int profit = 0;
		for(int i = 1; i < n; i++){
			if(price[i-1] < price[i]){
				profit += price[i]-price[i-1];
			}
		}
		return profit;
	}
	public static void main(String[] args){
		int[] price = {12,9,60};
		int n = price.length;
		int totalProfit = maxProfit(price,n);
		System.out.println(totalProfit);
	}


	/* This is a Naive Solution that takes big O(n*n) time

	public static int maxProfit(int price[], int start, int end){
		if(end <= start)	return 0;
		int profit = 0;
		for(int i = start; i < end; i++){
			for(int j = i+1; j <= end; j++){
				if(price[j] > price[i]){
					int currentProfit = price[j] - price[i]
										+ maxProfit(price,start,i-1)
										+ maxProfit(price,j+1,end);
					profit = Math.max(profit,currentProfit);
				}
			}
		}
		return profit;
	}
	public static void main(String[] args){
		int[] price = {1,5,3,8,12};
		int n = price.length;
		int totalProfit = maxProfit(price,0,n-1);
		System.out.println(totalProfit);
	}
	*/
}