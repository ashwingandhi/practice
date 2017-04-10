package array_programs;

public class QuickSort {
	static int arr[] = { 12, 11, 13, 5, 6, 7 };
	
	public static void sort(){ 
		int left = 0;
		int right = arr.length - 1;
		
		quicksort(left,right);
	}
	
	public static void quicksort(int left, int right){
		if(left >= right){
			return;
		}
		
		int pivIndex = (left + right) / 2;
		int newPivot = partition(left,right,pivIndex);
		
		quicksort(0, newPivot - 1);
		quicksort(newPivot + 1, right);
	}

	public static int partition(int left, int right, int pivot){
		int pivValue = arr[pivot];
		swap(pivot, right); // put pivot value on the end
		int leftCursor = left;
		for (int i = left; i < right; i++) {
			/* check if current value is less than pivot Value 
			 * if yes, swap i with leftCursor (which are usually same except when 
			 * i moves ahead and we swap leftCursor which is stuck on value greater than pivot value
			 * with the next available i value less than pivot)
			 * e.g 1, 10, 5, 6        5 switches with 10          */
			if (arr[i] < pivValue) {
				swap( i, leftCursor);
				leftCursor++;
			}
		}
		// put pivot to final position
		swap(leftCursor, right);
		return leftCursor;
	}
	
	public static void swap(int left,int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args){
		sort();
		printArray(arr);
	}
}
