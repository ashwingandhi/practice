package others;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] a = { -18, -16, -2, -8, -4 };

		int max = a[0];
		int prev_max = Integer.MIN_VALUE;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				prev_max = max;
				max = a[i];
			} else if (a[i] < max && a[i] > prev_max) {
				prev_max = a[i];
			} else
				continue;
		}
		System.out.println(max + " " + prev_max);
	}

}
