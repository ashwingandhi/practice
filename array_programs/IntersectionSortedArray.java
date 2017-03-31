package array_programs;

public class IntersectionSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = {1, 5, 10, 20, 40, 80};
		int b[] = {6, 7, 20, 80, 100};
		
		findIntersection(a,b);
	}

	private static void findIntersection(int[] a, int[] b) {
		
		int s1 = a[0], 
		e1 = a[a.length-1], 
		s2 = b[0], 
		e2 = b[b.length-1];
		
		int s = s1 > s2 ? s1 : s2;
		int e = e1 < e2 ? e1 : e2;
		
		int i = 0;
		while(a[i] < s){
			i++;
		}
		int j = 0;
		while(b[j] < s){
			j++;
		}
		
		while(i < a.length && j < b.length){
			if(a[i] == b[j]){
				System.out.println(a[i]);
				
				if(i < a.length-1)
					i++;
				if(j < b.length-1)
					j++;
			}
			else if(a[i] > b[j] && j < b.length-1){
				j++;
			}
			else if(i < a.length-1){
				i++;
			}	
		}
	}

}
