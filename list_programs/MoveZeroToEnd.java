package list_programs;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int arr[] = {1,0,2,0,0,3,4};
		
		int currEnd = arr.length - 1;
		
		for(int i = arr.length - 1; i >= 0; i-- ){
			if(arr[currEnd] == 0){
				continue;
			}
			currEnd = i;
			break;
		}
		
		
		
		int temp;
		
		for(int i = 0; i < arr.length ; i++){
			if(i == currEnd){
				break;
			}
			if(arr[i] == 0){
				temp = arr[currEnd];
				arr[currEnd--] = 0;
				arr[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
