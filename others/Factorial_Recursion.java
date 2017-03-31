package others;
import java.util.Scanner;
	
public class Factorial_Recursion {

		public static void main(String args[]) {
		
			System.out.println("Enter the integer to calculate its Factorial");	
			Scanner in= new Scanner(System.in);
			int n=in.nextInt();
			int fact=factorial(n);
			
			System.out.println("Factorial of" +n+ " is = " +fact+"!!");
		}
		
		public static int factorial(int n){
			if(n==0)
				return 1;
			else
			return n* factorial(n-1);
		}
		
	}
