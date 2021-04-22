package queue;


 class Queue
{
	int size, cap;
	int arr[];
	
	Queue( int cap)
	{
		this.cap = cap;
		size = 0;
		arr =  new int[cap];
	}
	
	boolean isFull()
	{
		return (size==cap);
	}
	boolean isEmpty()
	{
		return(size==0);
	}
	
	void enqueue( int x)
	{
		if(isFull()) return;
		
		arr[size]  = x;
		size++;
	}
	
	void dequeue()
	{
		if (isEmpty())  return;
		for( int i =0;i <size-1;i++)
		{
			arr[i] = arr[i+1];
		}
		size--;
	}
	int getFront()
	{
		if(isFull()) return -1;
		else return 0;
	}
	
	int getRear()
	{
		if(isFull()) return -1;
		else return size-1;
	}
}

public class QueueUsingArray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue obj = new Queue(5);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		
		obj.dequeue();
		
		System.out.println(obj.isFull());
		System.out.println(obj.isEmpty());
		System.out.println(obj.getFront());
		System.out.println(obj.getRear());
		
	}
	

}
