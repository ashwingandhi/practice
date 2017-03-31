package array_programs;

public class BinaySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 20, 30, 40, 67, 87, 90, 91 };
		int arr1[] = { 27, 25, 24, 12, 7, 5, 14, 15, 18 };
		int arr2[] = { 20, 19, 18, 17, 10, 11, 12 };
		int tar = 12;
		// System.out.println(binarySeach(arr, 0, arr.length, tar,true));
		// System.out.println(findMin(arr2));
		int minIndex = findMin(arr1);
		System.out.println(minIndex);
		System.out.println(binarySeach(arr1, 0, minIndex, tar, false));
		System.out.println(binarySeach(arr1, minIndex + 1, arr1.length, tar, true));
	}

	static int binarySeach(int[] arr, int min, int max, int tar, boolean isBS) {

		int mid;

		while (min < max) {
			mid = (min + max) / 2;

			if (arr[mid] == tar) {
				return mid;
			}

			if (isBS) {
				if ((arr[mid] > tar)) {
					max = mid;
				} else {
					min = mid + 1;
				}
			} 
			else{
				if ((arr[mid] < tar)) {
					max = mid;
				} else {
					min = mid + 1;
				}
			}

		}

		return -1;
	}

	static int findMin(int arr[]) {

		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		int min = mid;

		while (left <= right) {

			mid = (left + right) / 2;
			if (arr[mid] < arr[min]) {
				min = mid;
			}

			if (arr[mid + 1] > arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return min;
	}

}
