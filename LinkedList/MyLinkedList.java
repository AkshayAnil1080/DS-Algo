package LinkedList;

public class MyLinkedList<E> {
	
	Node<E> head;
	public void add(E data) 
		{
				Node<E> newNode = new Node<E>(data);
				
				   if(isEmpty())   // if(isEmpty())  
				{
					head =newNode;
					return;
				}
				//traversing to null
			Node<E> temp = head;
			while(temp.next != null)
				{
					temp = temp.next;
				}
			temp.next = newNode;
		}
	void print()
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+ " ");
				temp =temp.next;
			}
		}	
		
	public boolean isEmpty()
		{
			return head==null;
		}
	// pop function
	public E removeLast() throws Exception
		{	Node<E> temp = head;
		
		
			if(temp ==null)
				{
					throw new Exception("cannot remove lat element from empty ll");
				}
			
			if(temp.next == null)
				{
					Node<E> toRemove =head;
					head=null;
					return  toRemove.data;
				}
			while(temp.next.next != null)
				{
					temp=temp.next;
				}
			Node<E> removeLast = temp.next;
			temp.next=null;
			return  removeLast.data;
		}
	
	// peek function
	public E getLast() throws Exception
		{	Node<E> temp = head;
		
		
			if(temp ==null)
				{
					throw new Exception("cannot peek last element from empty ll");
				}
			
			
			while(temp.next != null)
				{
					temp=temp.next;
				}
			
			return  temp.data;
	  }
		
	
	
	
	static class Node<E> {
		E data;
		Node<E> next;
	
		public Node(E data) {
				
			this.data = data;
			next=null;
				}
	}

}
