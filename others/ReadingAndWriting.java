package others;

/*************************************
 * Author: Chaitrali Jayantilal Doshi
 * Date: 2016.07.10
 * Description: The program reads user 
 * 		input, filters and displays it.
 *************************************/

import java.util.Scanner;

public class ReadingAndWriting {

	/**
	 * Request and read data from user
	 * 
	 * @param in
	 * @param inputString
	 * @return outputString
	 */
	public static String readData(Scanner in, String inputString) {
		String outputString = null;

		// displaying input string
		System.out.println(inputString);

		// Asking user for input
		outputString = in.nextLine();

		return outputString;
	}

	/**
	 * Filters data as specified by user
	 * 
	 * @param userInput
	 * @param b
	 * @return userOutput
	 */
	public static String filterData(String userInput, boolean b) {
		String userOutput = null;

		// Checking if the input string is null
		if (userInput != null) {
			if (b) {
				// toUpperCase is a method from String class to convert the
				// string to Uppercase
				userOutput = userInput.toUpperCase();
			} else {
				// toLowerCase is a method from String class to convert the
				// string to Lowercase
				userOutput = userInput.toLowerCase();
			}
		}
		return userOutput;
	}

	/**
	 * Display data
	 */
	public static void displayData(String userInput, int i) {
		// Displaying the data
		System.out.println(i + ":\t" + userInput);
	}

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String userInput = null;

		for (int i = 0; i < 3; i++) {
			userInput = readData(in, "Enter a the name, the age, and the height in inches:");
			userInput = filterData(userInput, true); // returns a copy with
														// upper case letters
			displayData(userInput, 40);
		}
	}
}
