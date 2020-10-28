package VectorsAndStacks;



class Node<E> {
	E data;
	Node<E> next;

	public Node(E data) {
			
		this.data = data;
		next=null;
			}
}

class FirstStack<E>
{
	Node<E> head, top;
	
	void push(E a)
	{
		Node<E> newnode  = new Node<>(a);
		if(head == null)
			{head=newnode ; return; }
		else 
		{
			Node<E> temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
				temp.next = newnode;
			}
			newnode.next= null;
		}
	}
	E pop()
	{
		Node<E> temp = head;
		if(temp == null) 
			return null;
		else if (temp.next == null)
		{
			top= head;
			head=null;
			return top.data;
		}
		else
		{
			while(temp.next.next !=null)
			temp = temp.next;
			
			top=temp.next;
			temp.next=null;
			return top.data;
		}
	}
	
	E peek()
	{
		Node<E> temp = head;
		if(temp == null)
			return null;
		
		while(temp.next!=null)
		temp=temp.next;
		
		return temp.data;
	}
	
	
}
public class StachFromScratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstStack<Integer> s = new FirstStack<>();
		
		s.push(12);
		s.push(32);
		s.push(42);
		
		
		System.out.println(s.pop());
		
		System.out.println(s.peek());
		
		
		
		

	}

}
