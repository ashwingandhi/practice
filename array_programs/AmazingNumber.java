package array_programs;

public class AmazingNumber {
	public static void main(String[] args) {

		//int arr[] = { -1, 3, 4, 2, 2 };
		int arr[] = { -2,4,-1,4,2,1};
		int iarr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			iarr[i] = arr[i] - i;
		}

		for (int a : iarr) {
			System.out.println(a);
		}

		boolean isFirstAmazing = false;
		int firstAmazingCount = 0;
		
		if (iarr[0] <= 0) {
			isFirstAmazing = true;
		}

		int maxcount = 0;
		int currcount = 0;
		int currStartIndex = 0;

		for (int i = 0; i < iarr.length; i++) {
			
			if (iarr[i] <= 0) {
				currcount++;
				if(isFirstAmazing){
					firstAmazingCount++;
				}
			} else {
				currStartIndex = i + 1;
				if(currcount > maxcount){
					maxcount = currcount;
				}
				currcount=0;
				isFirstAmazing = false;
			}
		}
		
		if(currStartIndex + maxcount == arr.length){
			maxcount = maxcount + firstAmazingCount;
		}
		
		System.out.println(maxcount);
		System.out.println(currStartIndex);
	}
}
