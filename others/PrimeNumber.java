package others;
import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrimeNumber(int num){
		if(num<=1){
			return false;
		}
		if(num==2){
			return true;
		}
		
	    if(num%2!=0 ){	
			for(int i=3;i<=(num/2);i++){
				if(num%i==0){
					return false;
				}
				else{
					continue;
				}
			}
			return true;
		}
		return false;
			
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=in.nextInt();
		boolean a=PrimeNumber.checkPrimeNumber(number);
		if(a==true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		in.close();

	}

}
