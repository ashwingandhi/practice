package others;

/*****************************************
 * @author: Chaitrali Jayantilal Doshi
 * Date: 2016.07.12
 * Description: The program reads string
 * 		and count alphabetic characters
 * 		and digit characters 
 *****************************************/

import java.util.Scanner;

public class CountingCharacters {

	/**
	 * Takes the String and count the no. of alphabetic characters
	 * 
	 * @param s1
	 * @return count
	 */
	public static int countLetters(String s1) {

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			// check if the string has any alphabetic characters
			if ((s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') || (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Takes the String and count the no. of digit characters
	 * 
	 * @param s1
	 * @return count
	 */
	public static int countDigits(String s1) {

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			// check if the string has any digit characters
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				count++;
			}
		}
		return count;
	}

	/**
	 * Main method Calls countLetters and countDigits methods and displays
	 * required result
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int letterCount = 0;
		int digitCount = 0;
		double total = 0;

		System.out.println("Enter the String for counting characters and digits in it:(Press enter to exit)");
		String s1 = in.nextLine();

		// check for exit condition if the entered string length < 0 then
		// display the result
		while (s1.length() > 0) {
			// add the previous letterCount,digitCount,total with new string
			// till user enters empty string
			letterCount = letterCount + countLetters(s1);
			digitCount = digitCount + countDigits(s1);
			total = total + s1.length();

			System.out.println("Enter the String for counting characters and digits in it:(Press enter to exit)");
			s1 = in.nextLine();
		}

		System.out.println("The total number of characters in all strings:" + total);
		System.out.println("The total number of alphabetic characters in all strings:" + letterCount);
		System.out.println("The total number of digit characters in all strings:" + digitCount);
		System.out.println("The percentage of alphabetic characters:" + (letterCount / total) * 100);
		System.out.println("The percentage of digit characters:" + (digitCount / total) * 100);

		in.close();
	}
}
