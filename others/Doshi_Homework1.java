package others;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Chaitrali Jayantilal Doshi
 * Assignment No: 1
 * Date: 2016.09.26
 * Class Name: Doshi_Homework1
 *
 */
public class Doshi_Homework1 {
	
	public static void main(String[] args) {

		final int SIZE = 3;
		final double LOWERLIMIT = 0.0;
	    final double HIGHERLIMIT = 10.0;
		
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[SIZE];
		double doubleArray[] = new double[SIZE];
		int counter = 0;

		//Getting three integer values from user
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Enter the " + (i + 1) + " integer:");
			while (!in.hasNextInt()) {
				in.nextLine();
				System.out.print("I need an integer please: ");
			}
			intArray[i] = in.nextInt();
		}
		
		//Getting three double values from user
		while (counter < SIZE) {
			System.out.println("Enter " + (counter + 1) + " double value:");
			int num = (int) (in.nextDouble() * 100);
			double d1 = (double) num / 100;
			if (d1 >= LOWERLIMIT && d1 <= HIGHERLIMIT) {
				doubleArray[counter++] = d1;

			} else
				System.out.println("Invalid double value, value must be between 0-10");
		}
		
		System.out.println("\nInteger Values are: " + Arrays.toString(intArray));
		System.out.println("Double Values are: " + Arrays.toString(doubleArray) + "\n");

		//Basic mathematics operation
		System.out.println("The sum of the integers is " + (intArray[0] + intArray[1] + intArray[2]));
		System.out.println("\"" + intArray[0] + "\"" + "/" + "\"" + intArray[1] + "\"" + " is " + "\""
				+ ((double) intArray[0] / intArray[1]) + "\"");
		System.out.println(("\"" + intArray[0] + "\"" + "/" + "\"" + intArray[1] + "\"" + " is " + "\""
				+ intArray[0] / intArray[1]) + " Remainder " + (intArray[0] % intArray[1]) + "\"");
		System.out.println("\"" + intArray[2] + "\"" + "-" + "\"" + doubleArray[2] + "\"" + " is " + "\""
				+ (intArray[2] - doubleArray[2]) + "\"");

		in.close();
	}

}
