package logic_programs;

import java.util.Scanner;

public class FindNumberInArray {

	
	private static void findNumber(int[] a, int num) {
		
		for(int i=0;i<a.length;i++){
			if(a[i] == num)
			{
				System.out.println("The number is present in an Array");
				break;
			}
			if(i==a.length-1){
				System.out.println("Not present");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int a[]={10,7,-2,15,70,999};
		System.out.println("Enter the number to find in the array:");
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		
		findNumber(a,num);
		s1.close();
	}

	

}
