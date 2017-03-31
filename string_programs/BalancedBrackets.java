package string_programs;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class BalancedBrackets {

	public static void main(String[] args) {
		String input = "{[<>]}{}[";
		char[] inputArray = input.toCharArray();

		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		// map.put('}', '{');
		map.put('[', ']');
		// map.put(']', '[');
		map.put('<', '>');
		// map.put('>', '<');

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();

		map1.put('{', 0);
		map1.put('}', 0);

		map1.put('[', 0);
		map1.put(']', 0);

		map1.put('<', 0);
		map1.put('>', 0);

		// char[] inputArray = input.toCharArray();

		for (int i = 0; i < input.length(); i++) {
			int temp = map1.get(inputArray[i]);

			map1.put(inputArray[i], temp + 1);

		}

		for (char key : map1.keySet()) {
			System.out.println("key: " + key + " value: " + map1.get(key));
		}

		/*Deque<Character> stack = new ArrayDeque<Character>();
		boolean b1 = true;
		for (char key : inputArray) {

			if (map.containsKey(key)) {
				stack.push(key);
			} else if ((!stack.isEmpty()) && map.get(stack.peek()) == key) {
				char c = stack.pop();
				// System.out.println(c);
			} else {
				b1 = false;
				break;
			}
		}
		if (!stack.isEmpty() || b1 == false) {
			System.out.println("Unbalanced");
		} else
			System.out.println("Balanced");
*/
	}

}
