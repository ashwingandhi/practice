package array_programs;


public class Kadane {
	public static void main(String args[]){
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println("Max conti sum is:" + maxSubArraySum(a));
	}
	
	public static int maxSubArraySum(int[] a){
		int maxsum = 0;
		int currmaxsum = 0;
		
		for(int i = 0; i < a.length; i++){
			
			if(currmaxsum + a[i] > 0){
				currmaxsum += a[i];
			}else{
				currmaxsum = 0;
			}
			
			if(currmaxsum > maxsum){
				maxsum = currmaxsum;
			}
		}	
		return maxsum;
	}
}
