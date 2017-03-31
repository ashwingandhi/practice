package tree_programs;
public class BinarySearchTree {

	public Node root;

	public void insert1(int data) {
		Node node = new Node(data);

		if (root == null) {
			root = node;
			return;
		}

		Node current = root;
		while (current != null) {
			if (current.value > node.value) {
				if(current.left == null){
					current.left = node;
					return;
				}
				else{
					current = current.left;
				}
			} else {
				if(current.right == null){
					current.right = node;
					return;
				}
				current = current.right;
			}
		}
	}
	
	public void insert(int value) {
		Node node = new Node(value);

		if (root == null) {
			root = node;
			return;
		}

		insertRec(root, node);

	}

	private void insertRec(Node latestRoot, Node node) {

		if (latestRoot.value > node.value) {

			if (latestRoot.left == null) {
				latestRoot.left = node;
				return;
			} else {
				insertRec(latestRoot.left, node);
			}
		} else {
			if (latestRoot.right == null) {
				latestRoot.right = node;
				return;
			} else {
				insertRec(latestRoot.right, node);
			}
		}
	}
	
	public void inorder(Node node){
		if(node == null){
			return;
		}		
		inorder(node.left);
		System.out.print(node.value);
		inorder(node.right);
	}
	
	public void preorder(Node node){
		if(node == null){
			return;
		}		
		System.out.print(node.value);
		preorder(node.left);
		preorder(node.right);
	}
	
	public void postorder(Node node){
		if(node == null){
			return;
		}		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.value);
	}

	public static void main(String args[]) {
		BinarySearchTree b1 = new BinarySearchTree();
		b1.insert(6);
		b1.insert(4);
		b1.insert(3);
		b1.insert(1);
		b1.insert(5);
		
		b1.inorder(b1.root);
		System.out.println();
		b1.preorder(b1.root);
		System.out.println();
		b1.postorder(b1.root);

		// System.out.println(b1.findMaximum());
		// System.out.println(b1.findMinimum());

		// b1.printInorder();
	}
}