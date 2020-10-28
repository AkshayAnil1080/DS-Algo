package VectorsAndStacks;

import LinkedList.MyLinkedList;

public class MyStack<E> 
{
	private MyLinkedList<E> ll =new MyLinkedList<>();
	
	void push(E e)
		{
			ll.add(e);  // add is the inbuilt function . appending in linked list.
		}
	
	E pop() throws Exception
		{
			if(ll.isEmpty()) 
			{
				throw new Exception(" popping will not happen in empty ll");
			}
			return ll.removeLast();
			
		}
	E peek() throws Exception
		{
			if(ll.isEmpty()) 
			{
				throw new Exception(" popping will not happen in empty ll");
			}
			return ll.getLast();
			
		}
}
