package others;
import java.util.Scanner;

public class FibonacciLoop {

	public static void main(String args[]) {
		System.out.println("No till fibonacci series to print!!");
		int in = new Scanner(System.in).nextInt();
		System.out.println("Fibbonacci series Upto " + in + "numbers");

		for (int i = 1; i <= in; i++) {
			System.out.print(fibonacciloop(i) + " ");
		}
	}

	public static int fibonacciloop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		} else {
			int fibo1 = 1, fibo2 = 1, fibonacci = 1;
			for (int i = 3; i <= number; i++) {
				fibonacci = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibonacci;
			}
			return fibonacci;
		}
	}
}