package LinkedList;
import java.util.*;




class LinkList
{ 
	
 class Node {
		int data;
		Node next;

		public Node(int data) {
				
			this.data = data;
			next=null;
				}
	}

	Node head;
	void append( int a)
	{
		Node newnode = new Node(a);
		if(head==null)
			head=newnode;
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next= newnode;
			newnode.next = null;
		}
			
	}
	
	void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+ "->");
			temp=temp.next;
		}
	}
	
	void Move()
	{
		if(head==null || head.next==null)
			return;
		
		Node temp = head;
		Node t1= null;
		while(temp.next!=null)
		{t1=temp;
		temp=temp.next;
		}
		t1.next = null;
		temp.next=head;
		head=temp;
	}
}

public class RemoveLastToFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		LinkList ll = new LinkList();
				int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0 ;i<n;i++)
		{
			 arr[i] = sc.nextInt();
			 ll.append(arr[i]);
		}
		ll.print();
		System.out.println();
		
		ll.Move();
		ll.print();
		

	}

}
