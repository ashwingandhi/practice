package string_programs;
/*2. String Matching problem with s set of rules
i. Count 1 if an Upper case letter is followed by any Upper case letter
ii. Count 1 if an Upper case letter is followed by its same Lower case letter and dissolve the pair.
iii. if two lower case letters are present without a match stop and return count
Example: ABba will return 3 as A match with B, B matches with b and gets dissolved and then A matches with a and gets dissolved   */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringMatching {

	static int COUNT = 0;

	public static void patternCheck(String s1) {

		List<Character> list = new ArrayList<Character>();

		for (char c : s1.toCharArray()) {
			list.add(c);
		}

		for (Character l1 : list) {
			System.out.println(l1 + "  ");
		}

		char previous = list.get(0);
		char current;
		for (int i = 1; i < list.size(); i++) {
			current = list.get(i);
			if (Character.isUpperCase(previous)) {
				if (Character.isUpperCase(current)) {
					COUNT++;
					System.out.println(COUNT);
					previous = current;

				} else if (Character.toLowerCase(previous) == current) {
					COUNT++;
					System.out.println(COUNT);
					list.remove(i - 1);
					list.remove(i - 1);
					
					if (list.size() > 2) {
						i = i - 2;
						previous = list.get(i);

						current = list.get(i + 1);
					}
				}

			} else {
				if (Character.isLowerCase(previous)) {
					if (Character.isLowerCase(current)) {
						System.out.println(COUNT);
						break;
					}

				}
			}
		}


	}

	public static void main(String[] args) {
		patternCheck("ABbafc");
	}
}
