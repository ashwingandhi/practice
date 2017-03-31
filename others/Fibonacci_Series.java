package others;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String args[]){
		
		System.out.println("Enter the numbrt upto which Fibonacci series need to print");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.print("Fibonacci series upto " +n+ " numbers \n");
		
		for(int i=1;i<=n;i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
		in.close();
	}
	
	public static int fibonacciRecursion(int num){
		if(num==1 || num==2){
			return 1;
		}
		else
		{
			return fibonacciRecursion(num-1)+ fibonacciRecursion(num-2);
		}
	}
}
