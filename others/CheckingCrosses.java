package others;
/*****************************************
 * @author: Chaitrali Jayantilal Doshi 
 * Date: 2016.08.05 
 * Description: The program checks if the 
 * provided 2D pattern is legal or illegal as 
 * a specified square pattern.
 *****************************************/

public class CheckingCrosses {

	/**
	 * This methods checks if the given input array is a square array or not.
	 * Also it check if it has position of crosschar and fillerchar as per
	 * specification.
	 * 
	 * @param square
	 * @param crossChar
	 * @param fillerChar
	 * @return true or false based on given input
	 */
	public static boolean checkTheSquare(char[][] square, char crossChar, char fillerChar) {

		// check for jagged Array
		int length = square[0].length;
		for (int i = 1; i < square.length; i++) {
			if (square[i].length != length) {
				return false;
			}
		}

		// check if the given character array is square or not and check for odd
		// digit array
		if ((square[0].length != square.length) || (square.length % 2) == 0) {
			return false;
		}
		// flooring because index starts from zero
		double mid = Math.floor((double) length / 2);

		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++) {
				if ((i == mid || j == mid)) {
					// check for crossChar
					if (square[i][j] != crossChar)
						return false;
				} else {
					// check for fillerChar
					if (square[i][j] != fillerChar)
						return false;
				}
			}
		}

		return true;
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		char[][] goodinput = { { 'a', 'b', 'a' }, { 'b', 'b', 'b' }, { 'a', 'b', 'a' } };

		char[][] badinput = { { 'a', 'b', 'a' }, { 'b', 'b', 'b' }, { 'b', 'b', 'a' } };

		boolean b1 = checkTheSquare(goodinput, 'b', 'a');
		System.out.println(b1 ? "Good input" : "Bad input");
		boolean b2 = checkTheSquare(badinput, 'b', 'a');
		System.out.println(b2 ? "Good input" : "Bad input");
	}

}
