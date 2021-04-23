package queue;


class QueueCirArr
{
	 int size, front, cap;
	 int arr[]; 
	 QueueCirArr( int cap)
	 {
		 this.cap = cap;
		 arr =  new int[cap];
		 front = 0;
		 size = 0;  // initially queue is empty.
	 }
	 
	 boolean isFull()
		{
			return (size==cap);
		}
		boolean isEmpty()
		{
			return(size==0);
		}
		
		void enqueue( int x)  // insertion at rear.
		{
			if(isFull()) return;
			
			int rear = getRear();
			rear=  (rear +1)%cap;
			arr[rear]  = x;
			size++;
		}
		
		void dequeue()  // delete the front ele, and shift (size-1) elements to left.
		{
			if (isEmpty())  return;
			front = (front+1)%cap;
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
			else return front+size-1;
		}
}
public class QueueWithCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueCirArr obj = new QueueCirArr(5);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		
		
		obj.dequeue();
		
		System.out.println(obj.isFull());
		System.out.println(obj.isEmpty());
		System.out.println(obj.getFront());
		System.out.println(obj.getRear());

	}

}
