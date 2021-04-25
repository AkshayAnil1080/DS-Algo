package VectorsAndStacks;

import java.util.ArrayDeque;

public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// push,pop, peek, size, isEmpty()  
// ArrayDeque in java is array implementations- and since its dynamic size arrays - 
//		TC :  O(1) Amortized
		
		ArrayDeque<Integer> s = new ArrayDeque<>();  
		System.out.println(s.isEmpty());
		s.push(10);
		s.push(20);
		s.push(30);

	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s.peek());
	System.out.println(s.size());
	
	
	}

}
