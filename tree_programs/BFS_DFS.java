package tree_programs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void BFS(Node root) {
		if (root == null) {
			System.out.println("Empty tree");
		} else {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while (q.peek() != null) {
				Node temp = q.remove();
				System.out.println(temp.value);
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}
		}
	}

	// DFS is same as Pre-order Traversal
	public void DFS(Node root) {
		if (root == null) {
			System.out.println("Empty tree");
		} else {
			Stack<Node> s = new Stack<Node>();
			s.push(root);
			while (s.peek() !=  null) {
				Node temp = s.pop();
				System.out.println(temp.value + " ");
				if (temp.right != null)
					s.push(temp.right);
				if (temp.left != null)
					s.push(temp.left);

			}
		}
	}
}
