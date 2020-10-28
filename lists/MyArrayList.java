package lists;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits = new ArrayList();
		List<String> vegetables = new ArrayList();
//1 add		
		fruits.add("Apple");
		fruits.add("Orange23");
		
		vegetables.add("potato");
		vegetables.add("tomatato");
		System.out.println(fruits);
		

//		
		Pair<String ,Integer> p1=new Pair("Anuj" , 457);
		p1.getDescription();
		
// 						2. 	addAll
		
		 fruits.addAll(vegetables);
		 System.out.println(fruits);
	
// 					3.get(index) and set(index,value)
		System.out.println(fruits.get(2));
		fruits.set(2, "cabbage");
		 System.out.println(fruits);

		 //			4.remove(index)
		 fruits.remove(3);
		 System.out.println(fruits);
		 //			5.clear() remove all the elements
		 // 		6.removeAll: remove some
		 List<String> toRemove = new ArrayList();
		 toRemove.add("Apple");
		 toRemove.add("Orange23");
		 fruits.removeAll(toRemove);
		 System.out.println(fruits);
		 
		 //			7.size()
		 fruits.add("hey");
		 System.out.println(fruits.size());
		
		 
		 //			8.contains() : return type is boolean

		 System.out.println(fruits.contains("guava"));
		 
		 //			9. isEmpty() : boolean
		 System.out.println(fruits.isEmpty());
		 
		 //			10.toArray(): converts list into array.
//		 String temp[] = new String[fruits.size()];
//		 fruits.toArray(temp);
		 for( String e : fruits) {
			 System.out.println(e);  // same output
		 }
	
	}
}
