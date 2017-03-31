package string_programs;

public class IntToEnglish {

	static String[] oneteens = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static String[] tys = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	static String[] above = { "", "thousand", "million", "billion" };

	public static void main(String[] args) {

		System.out.println(intToEnglish(123456789));

	}

	private static String intToEnglish(int number) {

		if (number == 0)
			return "zero";

		int index = 0;

		String place = "";
		String result = "";

		do {
			int num = number % 1000;

			if (num != 0) {
				String LTT = generateLessThanThousand(num);
				place = above[index++];
				result =  " " + LTT + " " + place + " " + result;
			}
			number /= 1000;

		} while (number > 0);

		return result;
	}

	private static String generateLessThanThousand(int number) {

		String lasttwo = "";

		// Check if last 2 digits are in ones or teens
		if (number % 100 < 20) {
			lasttwo = oneteens[number % 100];
			number /= 100;
		} else {
			String units = oneteens[number % 10];
			number /= 10;

			String tens = tys[number % 10];
			number /= 10;

			lasttwo = tens + " " + units;
		}

		if (number == 0)
			return lasttwo;
		return oneteens[number] + " hundred" + " " + lasttwo;
	}

}
