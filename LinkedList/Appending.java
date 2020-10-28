package LinkedList;

import java.util.*;
public class Appending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLinkedList<String> myLL = new MyLinkedList();
		
		for(int i=0 ;i<10; i++) {
			myLL.add(i+ "addedd");
		}
		
		myLL.print();
			
	}

}
