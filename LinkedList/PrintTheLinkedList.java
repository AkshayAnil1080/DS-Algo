package LinkedList;
import java.util.*;



class LinkedList
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
}
 
 
	




public class PrintTheLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
				int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0 ;i<n;i++)
		{
			 arr[i] = sc.nextInt();
			 ll.append(arr[i]);
		}
		for(int i =0 ;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		ll.print();
	}

}
