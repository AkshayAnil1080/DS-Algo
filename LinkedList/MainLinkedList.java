package LinkedList;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		ll.add(30);
		System.out.println(ll.size());
		
		
		
	getTimeDiff(al);
	getTimeDiff(ll);
	}
		static void getTimeDiff(List<Integer> list) {
			
			long start =System.currentTimeMillis();
			for(int i =0;i<100000 ; i++) {
				list.add(0,  i);
			}
		
			
			long end = System.currentTimeMillis();
			System.out.println(list.getClass().getName() + 
					" --> " + (end-start));
			
		}
}
