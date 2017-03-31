package others;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertBase {

	public int converToBase10(String number,double base){
		
		int result=0;
		int length=number.length();
		for(int i=0;i<length-1;i++){
			int a=Integer.parseInt(String.valueOf(number.charAt(i)));
			double b=Math.pow(base, (length-i)-1);
			result= (int) (result + (a*b ));
		}
		return result;
	}

	public int convertFromBase10(String number, int base){
		
		int num = Integer.parseInt(number);
		int power = 0;
		
		while(num > Math.pow(base, power)){
			power++;
		}
		
		int remainder = num;
		List<Integer> q = new ArrayList<Integer>();
		
		for(int i = power-1; i >= 0; i--){
			q.add((int) (remainder / Math.pow(base, i)));
			remainder = (int) (remainder % Math.pow(base, i));
		}
		for(Integer a: q){
			System.out.print(a);
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		ConvertBase cb= new ConvertBase();
		
		System.out.println("Enter the number to convert to base 10 ");
		Scanner in=new Scanner(System.in);
		String number=in.nextLine();
		System.out.println("Enter its base ");
		double base=in.nextDouble();
		int result=cb.converToBase10(number,base);
		System.out.println("Result is " + result );
		
		String aString = Integer.toString(result);
		
		System.out.println("Enter its base ");
		int base1=in.nextInt();
		cb.convertFromBase10(aString,base1);
		in.close();
	}
}
