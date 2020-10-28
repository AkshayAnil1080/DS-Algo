package queue;

//			1. creating node
 class Node<E> {
	E data;
	Node<E> next;

	public Node(E data) 
	{
			
		this.data = data;
		next=null;
	}
}

//			2. implementing [DEQUEUE]pop(fifo)(plate wali line) and [ENQUEUE]push(at top)(shaadi ki plates)
 class FirstQueue<E> {
	 Node<E> head, rear;
	
	 void enqueue(E e)
	
	{  Node<E> toAdd = new Node<>(e);
		if (head==null)
		{
			head=rear=toAdd;
			return;
		}
		
		rear.next = toAdd;
		rear=rear.next;
	}
	
	 E dequeue()
	{
		if(head==null) return null;
		
		Node<E> temp =head;
		head=head.next;
		
		if(head==null)
			rear = null;
		return temp.data;
	}
}

public class QueueFromScratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstQueue<Integer> q =new FirstQueue<>();  // name will be same as line 16
		
//		q.add(12);
//		q.add(23);
//		q.add(34);
		q.enqueue(12);
		q.enqueue(1);
		q.enqueue(34);
		q.enqueue(125);
		
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(1254);
		System.out.println(q.dequeue());

	}

}
