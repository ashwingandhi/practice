package others;

/*****************************************
 * @author: Chaitrali Jayantilal Doshi
 * Date: 2016.07.13
 * Description: The program reads heights 
 * 	from user,converts from meters to feet
 *  and gives an average of it.
 *****************************************/

import java.util.Scanner;
import java.util.Arrays;

public class ReadConvertAverage {

	static final double LOWER_HEIGHT = 0.3;
	static final double MAX_HEIGHT = 3.0;
	static final int SIZE = 30;
	static final double CONVERSION_FACTOR = 3.28084;

	/**
	 * This method check if the given height is in the specified range
	 * @param height
	 * @return true or false based on input
	 */
	public static boolean isInRange(double height) {

		if (height >= LOWER_HEIGHT && height <= MAX_HEIGHT) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * This method converts given height from meters to feet.
	 * @param height
	 * @return
	 */
	public static double meterToFeet(double height) {
		return height * CONVERSION_FACTOR;
	}

	/**
	 * This method calculate average height for provided array.
	 * @param heightArr
	 * @param numberOfHeights
	 * @return average
	 */
	public static double heightMean(double[] heightArr, int numberOfHeights) {
		double sum = 0;
		
		if(!(numberOfHeights > 0 && numberOfHeights < SIZE)){
			return 0;
		}
		
		for (double height : heightArr){
			if (height <= 0)
				break;
			sum += height;
		}
			
		return sum / numberOfHeights;
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double heightArr[];
		int numberOfHeights = 0;
		double height;
		heightArr = new double[SIZE];

		//checking number of elements in array are less than size of the array
		while (numberOfHeights < SIZE) {
			System.out.println("Enter Heights in meters of student " + (numberOfHeights + 1));  
			height = in.nextDouble();
			if (height < 0) {
				break;
			}

			boolean b1 = isInRange(height);
			if (b1) {
				heightArr[numberOfHeights++] = meterToFeet(height);

			} else {
				System.out.println("No height entered.");
			}
		}

		// printing the array
		System.out.println("The Array :\n"+ Arrays.toString(heightArr));
		double mean = heightMean(heightArr, numberOfHeights);
		System.out.println("\nThe average height of " + (numberOfHeights) + " students is: " + mean + " feet");

		in.close();
	}
}
