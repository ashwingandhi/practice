package others;
import java.util.Scanner;

public class ArmstrongNumber {
	
	public static boolean checkArmstrongNumber(String number){
		
		if(number.length()==1){
			if(number.equals("1") || number.equals("0")){
				return true;
			}
		}
		if(number.length()==3){
			
			int  num1= (int)(Math.pow(Character.getNumericValue(number.charAt(0)),3) + 
						  Math.pow(Character.getNumericValue(number.charAt(1)),3) +  
					      Math.pow(Character.getNumericValue(number.charAt(2)),3)) ;
			
			if(Integer.toString(num1).equals(number)){
				return true;
			}
			return false;
		}
	
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter  Number to check for Armstrong number");
		Scanner s1 = new Scanner(System.in);
		String num1 =s1.next();

		boolean b1=ArmstrongNumber.checkArmstrongNumber(num1);
		if(b1==true){
		System.out.println("Number is Armstrong Number!!");
		}
		else{
			System.out.println("Number is not an Armstrong Number!!");	
		}
			
		s1.close();

	}

	

}
