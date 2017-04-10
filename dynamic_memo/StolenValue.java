package dynamic_memo;

public class StolenValue {

	static int maxStolenValue(int[] values) {

		if (values.length == 0) {
			return 0;
		}

		int value1 = values[0];
		if (values.length == 1) {
			return value1;
		}

		int value2 = Math.max(values[0], values[1]);
		if (values.length == 2) {
			return value2;
		}

		int value = 0;
		for (int i = 2; i < values.length; i++) {
			// E.g. take max of idx1 or idx0 + idx2
			value = Math.max(value2, value1 + values[i]);
			value1 = value2;
			value2 = value;
		}

		return value;
	}

	public static void main(String[] args) {
		int arr[] = {6,1,2,7};
		System.out.println(maxStolenValue(arr));
	}

}
