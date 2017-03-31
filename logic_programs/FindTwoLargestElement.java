package logic_programs;

public class FindTwoLargestElement {
	
	private static void findLargenumber(int[] a) {
	int max=a[0];
	int nextmax=a[1];
	//int temp;
	
	for(int i=0;i<a.length;i++){
		if(a[i]>max){
			nextmax=max;
			max=a[i];
		}
		else if(a[i]>nextmax){
			nextmax=a[i];
		}
		/*if(max<nextmax){
			temp=max;
			max=nextmax;
			nextmax=temp;
		}
		
		if(max < a[i] && nextmax < a[i]){
			max=a[i];
		}
		
		if(nextmax < a[i] && a[i] <= max){
			nextmax=a[i];
		}*/
	 }
	System.out.println(max);
	System.out.println(nextmax);
	}
	
	public static void main(String[] args) {
		int a[]={10,2,7,15,5};

		findLargenumber(a);
	}



}
