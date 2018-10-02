package dynamic_memo;
/*
There are n houses build in a line, each of which contains some value in it. A thief is going to steal the maximal value of these houses, but he can’t steal in two adjacent houses because owner of the stolen houses will tell his two neighbour left and right side. What is the maximum stolen value.
Examples:

Input  : hval[] = {6, 7, 1, 3, 8, 2, 4}
Output : 19
Thief will steal 6, 1, 8 and 4 from house.

Input  : hval[] = {5, 3, 4, 11, 2}
Output : 16
Thief will steal 5 and 11
*/

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
