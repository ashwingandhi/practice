package string_programs;

public class AddStringNumbers {

	public static void main(String[] args){
		
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {8, 9, 9, 9, 5, 9 , 9};
		
		//int length = num1.length < num2.length ? num1.length : num2.length;
		
		int[] big = num1.length > num2.length ? num1 : num2;
		int[] small = num1.length < num2.length ? num1 : num2;
		
		int place = 1;
		int carry = 0;
		int result = 0;
		int curr = 0;
		
		for( int i = small.length-1; i >= 0 ; i--){
			curr =  small[i] + big[i + (big.length - small.length)] + carry;
			carry = curr / 10;
			curr = curr % 10;
			curr = curr * place;
			
			result = result + curr;
			place = place * 10;
			
			
		}		
		
		//int[] bigger = num1.length > num2.length ? num1 : num2;
		
		for(int j = big.length - small.length - 1; j >= 0 ; j-- ){
			curr = big[j] + carry;
			carry = curr / 10;
			curr = curr % 10;
			curr = curr * place;
			
			result = result + curr;
			place = place * 10;
			
			
		}
		
		
		System.out.println(result);
		
		
	}
}
