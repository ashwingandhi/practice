package tree_programs;

public class ISBST {
	
	Node root;
	
	
	public boolean isBST(Node node, int min, int max){
		if(node == null){
			return true;
		}
		if(node.value <= min || node.value >= max ){
			return false;
		}
		
		return (isBST(node.left, min, node.value) && isBST(node.right, node.value, max));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISBST tree = new ISBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
	}

}
