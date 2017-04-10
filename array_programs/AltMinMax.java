package array_programs;

public class AltMinMax {
	
	public static void alternateSort(int[] arr){
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++){
			for(int j=i+1; j < arr.length; j++){
				// set current smallest at i
				if(flag && arr[i] > arr[j]){
					swap(arr,i,j);
				}
				// set current largest at index i
				if(!flag && arr[i] < arr[j]){
					swap(arr,i,j);
				}
			}
			flag = !flag;
		}
	}
	
	static void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		//int arr[] = {2,4,3,5,1};
		int arr[] = {7,6,5,4,3,2,1};
		alternateSort(arr);
		printArray(arr);
		
	}

}
