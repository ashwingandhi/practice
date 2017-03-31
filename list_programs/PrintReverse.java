package list_programs;



public class PrintReverse {
	

	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		
		PrintReverse pr = new PrintReverse();
		
		System.out.println(pr.printRecur(root));
	}

	private String printRecur(Node node) {
		if(node == null){
			return "";
		}
		
		return printRecur(node.next) + node.value; 
	}

}
