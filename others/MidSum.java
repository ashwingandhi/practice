package others;

public class MidSum {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 1, 2, 3, 4 };
		//int[] a = { 7, 3, 5,8,5,1,1, 2, 3, 4 };

		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}

		System.out.println(total);

		int counter = 0;
		int curr = 0;
		int remaning = total; // ((total - a[counter + 1]) - sum);
		boolean flag = false;

		while (((counter < a.length - 1) && curr < remaning) && !flag) {
			curr += a[counter];
			// System.out.println(counter);
			remaning = ((total - a[counter + 1]) - curr);
			System.out.println(counter);
			System.out.println(remaning);
			System.out.println(curr);
			counter++;

			if (curr == remaning) {
				flag = true;
			}

		}
		System.out.println(flag);
		System.out.println(counter);
	}

}