package array_programs;

public class StockProfit {
	public static void main(String[] args){
		
		// buy should occur before sale
		int[] quotes = {19,22,15,35,40,10,20};
		
		int currleast = Integer.MAX_VALUE;
		int currmaxprofit = 0;
		
		for(int i = 0; i < quotes.length; i++){
			if(currleast > quotes[i]){
				currleast = quotes[i];
			}
			
			if(currmaxprofit < (quotes[i] - currleast)){
				currmaxprofit = (quotes[i] - currleast);
			}
		}
		
		System.out.println(currmaxprofit);
	}
}
