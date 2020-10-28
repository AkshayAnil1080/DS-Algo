package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("Kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		
		// when  they are remove, it is removed in sorted(coronological) order.
//		//[Apple, Banana, Mango, Kiwi]
//		Apple
//		Banana
//		Kiwi
//		Mango

	//				2 eg.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(45);
		pq.add(100);
		pq.add(12);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}

}
