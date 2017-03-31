package others;
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
	
		System.out.println("Enter the integer to calculate its Factorial");	
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int fact=factorial(n);
		
		System.out.println("Factorial of " +n+ " is = " +fact);
		in.close();
	}
	
	public static int factorial(int n){
		int fact=1;
		if(n<0){
			System.out.println("Number cannot be Negative");
		}
		else
		{
			for(int c=1;c<=n;c++){
				fact=fact*c;
			}
		}
		return fact;
	}
	
}
