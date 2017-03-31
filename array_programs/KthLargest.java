package array_programs;

public class KthLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int array[] = { 10, 20, 30, 25, 50, 55, 90, 80, 70, 10, 20, 30 };

		int array[] = { 70, 55, 80, 90, 50 };

		System.out.println("The next kth is: "
				+ kthLargest(array, array.length - 3));

		for (int a : array) {
			System.out.print(a + " ");
		}
	}

	static int kthLargest(int[] list, int k) {
		int left = 0;
		int right = list.length - 1;
		while (true) {
			int pivIndex = (left + right) / 2;
			int newPiv = partition(list, left, right, pivIndex);

			for (int a : list) {
				System.out.print(a + " ");
			}
			System.out.println();

			if (newPiv == k)
				return list[newPiv];
			else if (newPiv < k) {
				left = newPiv + 1;
			} else {
				right = newPiv - 1;
			}
		}
	}

	private static int partition(int[] list, int left, int right, int pivot) {
		int pivValue = list[pivot];
		swap(list, pivot, right); // put pivot value on the end
		int storePos = left;
		for (int i = left; i < right; i++) {
			if (list[i] < pivValue) {
				swap(list, i, storePos);
				storePos++;
			}
		}
		swap(list, storePos, right);
		return storePos;
	}

	private static void swap(int[] list, int a, int b) {
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;

	}

}
