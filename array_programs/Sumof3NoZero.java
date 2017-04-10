package array_programs;

import java.util.Arrays;

public class Sumof3NoZero {

	public static void main(String[] args) {

		int[] arr = { 10, 7, 1, 2, 4, 5, -3 };
		Arrays.sort(arr);

		System.out.println(sumZero(arr));

	}

	public static boolean sumZero(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {

			if(findSum(arr, -arr[i], i)){
				return true;
			}
		}

		return false;
	}

	public static boolean findSum(int[] arr, int sum, int index) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (left == index) {
				left++;
			}
			if (right == index) {
				right--;
			}

			if (sum == arr[left] + arr[right]) {
				return true;
			} else if (sum > arr[left] + arr[right]) {
				left++;
			} else {
				right--;
			}
		}

		return false;
	}

}
