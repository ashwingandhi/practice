package logic_programs;

public class FindSmallLargeElement {

	private static void findSmallLarge(int[] a) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			if(min>a[i])
			min=a[i];
			if(max<a[i])
			max=a[i];
		}
		
		System.out.println(min);
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int a[]={10,2,15,9,89};
		findSmallLarge(a);
	}
}
