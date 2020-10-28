package queue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyQueue<Integer> q =new MyQueue<>();
			
//			q.add(12);
//			q.add(23);
//			q.add(34);
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
