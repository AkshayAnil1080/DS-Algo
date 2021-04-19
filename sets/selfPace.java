
package sets;
import java.util.*;
public class selfPace {

//	TC : add() , remove(), contains() - O(1) on avg
//		 size() , isEmpty() -  O(1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> h  = new HashSet<>(); // only np data types, Integer, String, Character,...
		// add()
		h.add("gfg");
		h.add("courses");
		h.add("ide");
		
		// size()
		System.out.println(h.size());
		
		// remove()
		h.remove("ide");
		
		// contains
		System.out.println(h);  // [courses, gfg, ide]
		System.out.println(h.contains("ide"));  // true
		
		// traversing in hashSet - 1
		Iterator<String> i  = h.iterator();
		while(i.hasNext())
			System.out.print(i.next()+ " ");  // courses gfg 
		System.out.println();
		
		// traversing in hashSet - 2
		for( String s :  h)
			System.out.print(s+ " ");  // courses gfg
		System.out.println();
		
		
		// isEmpty()
		System.out.println(h.isEmpty());  // false
		
		// clear()   -- use the same hashset for multiple test cases
		h.clear();
		System.out.println(h.size());   // 0
	}

}
