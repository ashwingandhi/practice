package array_programs;



public class Subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(subarrsum());
	}
	
	public static boolean subarrsum(){
		int arr[] = {1,3,5,18};
		int target = 8;
		
		int start = 0;
		int end = 0;
		int sum = 0;
		
		while(end < arr.length){
			// also = target as the updated index is used in next iteration, or else it will increment start
			if(sum + arr[end] <= target){
				sum += arr[end++];
			}
			else{
				sum -= arr[start++];
			}
			if(sum == target){
				return true;
			}
			if(start > end){
				end = start;
				sum = 0;
			}
		}
		return false;
	}
}
