package tree_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderLeaves {
	
	public static List<Integer> getLeaves(List<Integer> bst) {
        List<Integer> leaves = new ArrayList<>();
        
        Stack<Integer> greaterAncestors = new Stack<>();

        int previous = 0;

        for (int i: bst) {
            int ancestor = 0;
            // Find the first ancestor which is greater than the current node.
            while (!greaterAncestors.isEmpty() && greaterAncestors.peek() < i) {
                ancestor = greaterAncestors.pop();
            }
            greaterAncestors.push(i);
            if (ancestor > previous) {
                leaves.add(previous);
            }
            previous = i;
        }

        if (!bst.isEmpty()) {
            // The last node is always a leaf.
            leaves.add(previous);
        }

        return leaves;
    }

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(5);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		l1.add(4);
		l1.add(8);
		l1.add(6);
		l1.add(7);
		l1.add(9);
		
		List<Integer> res = getLeaves(l1);
		
		System.out.println(res);

	}

}
