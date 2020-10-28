package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//		ad.addFirst(12);
//		ad.addFirst(24);
//		
//		ad.pop();
//		System.out.println(ad.peek());
		
		// ad as stack;
		ad.push(12);
		ad.push(24);
		ad.push(35);
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		
		
		
	}

}
