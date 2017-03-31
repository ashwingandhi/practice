package string_programs;

import java.util.Scanner;

public class StringReverse {

	public String stringReverse(String orignalString) {
		int length = orignalString.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + orignalString.charAt(i);
		}
		return reverse;
	}

	public String reverseByStringBuffer(String orignalString) {
		StringBuffer a = new StringBuffer(orignalString);
		return a.reverse().toString();
	}

	public static void main(String args[]) {
		String orignalString;
		Scanner in = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String to reverse:");
		orignalString = in.nextLine();

		StringReverse sr1 = new StringReverse();

		String reverse1 = sr1.stringReverse(orignalString);						 
		System.out.println("Reverse of given string is " + reverse1);
		String reverse2 = sr1.reverseByStringBuffer(orignalString);
		System.out.println("Reverse of given string is " + reverse2);
		
		String s1="Chaitali";
		System.out.println(s1.concat(" Doshi"));
		
		in.close();
	}

}
