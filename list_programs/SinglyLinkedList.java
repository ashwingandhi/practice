package list_programs;

public class SinglyLinkedList {

	Node head;
	int size = 0;

	public void insertFirst(int data) {
		Node node = new Node(data);
		size++;

		if (head == null) {
			head = node;
			return;
		}

		node.next = head;
		head = node;
	}

	public void insertLast(int data) {
		Node node = new Node(data);
		size++;

		if (head == null) {
			head = node;
			return;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
	}

	public void insertAtPos(int data, int pos) {
		Node node = new Node(data);

		if (head == null) {
			if (pos == 1) {
				head = node;
			} else {
				System.out.println("position too big");
			}
		} else {

			Node curr = head;
			// To get the previous before the position
			pos = pos - 1;
			for (int i = 1; i <= size; i++) {
				if (pos == i) {
					break;
				} else {
					curr = curr.next;
				}
			}
			Node temp = curr.next;
			curr.next = node;
			node.next = temp;
			
		}
	}
	
	public void reverse(){
		
		Node curr = head;
		Node prev = null;
		
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;	
		}
		head = prev;
	}

	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.value);
			curr = curr.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {

		SinglyLinkedList s1 = new SinglyLinkedList();
		s1.insertFirst(5);
		s1.insertFirst(6);
		s1.insertLast(7);
		s1.insertAtPos(8, 2);
		s1.insertAtPos(9, 5);
		s1.printList();
		s1.reverse();
		s1.printList();

	}

}
