package others;
import java.util.Scanner;

public class SelectionSort {
	
	public static void sort(int a[]){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int tmp= a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the no of element to sort:");
		int size = s1.nextInt();
		int a[]= new int[size];
		System.out.println("Enter the elements to sort:");
		for(int i=0;i<a.length;i++){
			a[i]=s1.nextInt();
		}
		
		System.out.println("List before sorting:");
		for(int j=0;j<a.length;j++){
			System.out.print(a[j] +" ");
		}
		sort(a);
		System.out.println("\nList after sorting:");
		for(int j=0;j<a.length;j++){
			System.out.print(a[j] + " ");
		}s1.close();
		
	}

}
