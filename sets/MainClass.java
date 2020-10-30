package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> fruits = new HashSet<>();  // Set is implememnted by HashSet , LinkedHashSet, TreeSet , EnumSet
//1 add()
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		
		fruits.add("Banana");
//2. will print distinct elements.		
		System.out.println(fruits);
		
// return true and false for element present or not.
		System.out.println(fruits.add("Banana"));
		System.out.println(fruits.add("Mango"));
		
		
//operation
// UNION;
		Set<Integer> set1 = new HashSet<>();
		set1.add(23);
		set1.add(1);
		set1.add(6);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(1);
		set2.add(16);
		
		 set1.addAll(set2);
		System.out.println(set1);
		
//intersection 
//set1 is now: [23,1,6,3,16]
		set1.retainAll(set2);
		System.out.println(set1);
		
		Set<Integer> set3 = new HashSet<>();
		set3.add(1);
	
// containsAll() : boolean; subset
		System.out.println(set1.containsAll(set3));
	}

}
