package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("one" , 1);
		numbers.put("two" , 2);
		numbers.put("three" , 3);
		

//1. put(K,V) changing the prev key  value: ans 5,2,3
		numbers.put("one", 5);
		System.out.println(numbers);
		
		
//2. putIfAbsent(K,V):  O/P 1,2,3
		numbers.putIfAbsent("one" ,400 );
		System.out.println(numbers);
		
//3. get(K): returns the value linked to the key, if not present returns null
		System.out.println(numbers.get("two")); 
		System.out.println(numbers.get("five")); 
		
//4.containsKey(K): boolean- if the key is present or not
//5.conatainsValue(V) :boolean- 		
		System.out.println(numbers.containsKey("two"));
		System.out.println(numbers.containsValue(2));
		
//6.replace(K,V) -O/P 11,2,3
		numbers.replace("one", 11);
		System.out.println(numbers);

//7. replace(K,Old-V,New-V) - 22,2,3     :   v.v.v.v. imp for compcoding
		numbers.replace("one", 11, 22);
		System.out.println(numbers);
		
//8. remove(K)		: O/P-22,2
		numbers.remove("three");
		System.out.println(numbers);
	
//9. remove(K,V) : remove only if this entry exists. O/P- 22,3
		numbers.remove("one" , 33);
		System.out.println(numbers);
		
//10. keySet() , values() , entrySet() - converts {} into the set [] of key, values and entries
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
		
//11. Q print the map with values *100
//	Entry is inner fn of Map.=> import java.util.Map.Entry
		
		Set<Entry <String , Integer >> entries = numbers.entrySet();
		
		for(Entry<String , Integer> entry : entries)
		{// now u can perform any operation here.
			entry.setValue(entry.getValue() * 100);
		}
		System.out.println(numbers);
	}

}
