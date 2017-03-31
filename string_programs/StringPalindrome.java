package string_programs;
import java.util.Scanner;

public class StringPalindrome {
	
	public void stringPalindrome(String str){
		int len=str.length();
		int i;
		for(i=0;i<(len/2)+1;++i){
			if(str.charAt(i)!=str.charAt(len-i-1)){
				System.out.println("Not Palindrome");
				break;
			}
		}
		System.out.println("Palindrome");
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		Scanner scan = new Scanner (System.in);
		String str=scan.next();
		StringPalindrome s=new StringPalindrome();
		s.stringPalindrome(str);
		scan.close();
	}

}
