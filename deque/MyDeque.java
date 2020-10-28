package deque;

 class Node<E>
{
	E data;
	Node<E> next, prev;
	Node(E data)
	{
		this.data= data;
		next = prev = null;
	}
}

class doublyLinkedList<E>
{
	

Node<E> head,tail;
	
	public void addToHead(E data)
		{
			Node<E> newnode = new Node<>(data);
			if(head== null)
				{ head=tail=newnode;  return; }
			
			else
			{
				head.next = newnode;
				newnode.prev = head;
				head = newnode;
			}
		}
	
	public E removeLast()
		{// if list ins empty
			if(head == null) return null;
		
			else 
			{
				Node<E> temp = tail;
				tail =  tail.next;
				tail.prev =null;
				
				// if list contains only one element
				if(tail == null)
					head=null;
				
				return temp.data;
			}
			
		}
	void print()
	{
		Node temp = tail;
		while(temp!=null)
			{
			System.out.println(temp.data + " ");
			
			temp=temp.next;
			}
	}
	
}


public class MyDeque<E>{
	public static void main(String[] args) {
	
	doublyLinkedList<Integer> dll = new doublyLinkedList<>();
	
	dll.addToHead(2);
	dll.addToHead(4);
	dll.addToHead(5);
	dll.addToHead(8);
	dll.addToHead(7);
	
	dll.removeLast();
	dll.removeLast();
	dll.print();
	}

	private static void print() {
		// TODO Auto-generated method stub
		
	}
}