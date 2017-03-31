package others;
import java.util.Arrays;

public class ArrayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 4, 5, 6,8 };
		int count =0;
		System.out.println(Arrays.toString(a));
		for (int i = 0, j = a.length - 1; i < a.length;) {
			if (i < j) {
				if ((a[i] % 2) == 0 && (a[j] % 2) == 1) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
					count++;
				} else if ((a[i] % 2) == 0 && (a[j] % 2) == 0) {
					j--;
				} else if ((a[i] % 2) == 1 && (a[j] % 2) == 1) {
					i++;
				} else {
					i++;
					j--;
				}
			}
			else
				break;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(count);

		}

}
