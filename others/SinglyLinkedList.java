package others;
import java.util.Scanner;

public class SinglyLinkedList {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);

		LinkedList list= new LinkedList();
		char ch;
		do{
			System.out.println("Singly Linked list Operations!!");
			System.out.println("1. Insert at the Begining");
			System.out.println("2. Insert at the End");
			System.out.println("3. Insert at the Position");
			System.out.println("4. Delete at the Position");
			System.out.println("5. Check Empty");
			System.out.println("6. Get Size");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("Enter the element to insert:");
					list.insertAtStart(scan.nextInt());
					break;
				case 2:
					System.out.println("Enter the elecment to insert:");
					list.insertAtEnd(scan.nextInt());
					break;
				case 3:
					System.out.println("Enter the ellment to insert:");
					int num=scan.nextInt();
					System.out.println("Enter the position:");
					int pos=scan.nextInt();
					if(pos<=1|| pos> list.getSize())
					{
						System.out.println("Invalid position!!");
					}
					else
					{
						list.insertAtPosition(num, pos);
					}
					break;
				case 4:
					System.out.println("Enter the position to delete a record from Linklist!!");
					int p=scan.nextInt();
					if(p<1 || p> list.getSize())
					{
						System.out.println("Invalid position!!");
					}
					else
					{
						list.deleteAtPos(p);
					}
					break;
				default :
					System.out.println("Wrong Entry");
			}
			list.display();
			System.out.println("Do you want to Continue?(type y or n)\n");
			ch=scan.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		scan.close();
	}
}

	class Node {
		protected int data;
		protected Node link;
		
		public Node()
		{
			link=null;
			data=0;
		}
		
		public Node(int d,Node n)
		{
			data=d;
			link=n;
			
		}
		
		public void setLink(Node n)
		{
			link=n;
		}
		
		public void setData(int d)
		{
			data=d;
		}
		
		public Node getLink()
		{
			return link;
		}
		
		public int getData()
		{
			return data;
		}
	}

	class LinkedList 
	{
		protected Node start;
		protected Node end;
		public int size;

		/* Constructor */
		public LinkedList() 
		{
			start = null;
			end = null;
			size = 0;
		}

		/* Function to check if the list is empty */
		public boolean isEmpty() 
		{
			return start == null;
		}

		public int getSize() 
		{
			return size;
		}
		
		public void insertAtStart(int val)
		{
			Node nptr=new Node(val,null);
			size++;
			
			if(start == null)
			{
				start=nptr;
				end=start;
			}
			else
			{
				nptr.setLink(start);
				start=nptr;
			}
			
		}
		
		public void insertAtEnd(int val)
		{
			Node nptr=new Node(val,null);
			size++;
			
			if(this.isEmpty())
			{
				start=nptr;
				end=start;
			}
			else
			{
				end.setLink(nptr);
				end=nptr;
			}
		}
		
		public void insertAtPosition(int val, int pos)
		{
			if(start == null){
				this.insertAtStart(val);
			}
			Node nptr=new Node(val,null);
			Node ptr=start;
			pos=pos-1;
			for(int i=1;i<size;i++)
			{
				if(i==pos)
				{
					Node temp=ptr.getLink();
					ptr.setLink(nptr);
					nptr.setLink(temp);
					break;
					
				}
				ptr=ptr.getLink();
			}
			size++;
		}
		public void deleteAtPos(int pos)
		{
			if(this.isEmpty()){
				System.out.println("Linkedlist is Empty!!");
				return;
			}
			
			if(pos==1)
			{
				start=start.getLink();
				size--;
				return;
			}
			if(pos==size)
			{
				Node s=start;
				Node t=start;
				while(s!= end)
				{
					t=s;
					s=s.getLink();
				}
				end=t;
				end.setLink(null);
				size--;
				return;
			}
			Node ptr=start;
			pos=pos-1;
			for(int i=1;i<size;i++)
			{
				if(i==pos)
				{
					Node tmp=ptr.getLink().getLink();
					//tmp=tmp.getLink();
					ptr.setLink(tmp);
					break;
					
				}
				ptr=ptr.getLink();
			}
			size--;
		}
		
		public void display()
		{
			System.out.println("Linklist!!");
			if(size==0)
			{
				System.out.println("Empty!!\n");
				return;
			}
			if(start.getLink()==null)
			{
				System.out.println(start.getData());
				return;
			}
			Node ptr=start;
			System.out.print(start.getData()+ "->");
			ptr=start.getLink();
			while (ptr.getLink()!=null)
			{
				System.out.print(ptr.getData()+ "->");
				ptr=ptr.getLink();
			}
			System.out.print(ptr.getData()+ "\n");
		}
	}

