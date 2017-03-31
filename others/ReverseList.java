package others;
import java.util.Arrays;

public class ReverseList {

	public static void main(String[] args) {
		int[] list = { 10, 5, 7, 18, 5, 7, 86, 44343, 454, 8 };
		int temp;
		System.out.println(Arrays.toString(list));
		for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
			temp = list[j];
			list[j] = list[i];
			list[i] = temp;
		}
		System.out.println(Arrays.toString(list));

		String name = "Ashwin";
		String new1 = new String();
		for (int i = name.length() - 1; i >= 0; i--) {
			new1 = new1 + name.charAt(i);
		}
		System.out.println(name);
		System.out.println(new1);
		
		int num =12345;
		int sum =0;
		while(num>0){
			sum = sum + (num % 10);
			num = num/10; 
		}
		System.out.println(sum);
	}

}
