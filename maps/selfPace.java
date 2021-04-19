package maps;
import java.util.*;
import java.util.Map.Entry;
public class selfPace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> m  = new HashMap<>();
		
		// 1. put
		m.put("gfg",10);
		m.put("ide", 15 );
		m.put("courses", 10);
		
		// 2. size()
		System.out.println(m);  //  {courses=10, gfg=10, ide=15} -  order will vary		 - diff keys may go in the slots in any order
		System.out.println(m.size());   // 3
		
		// 3. containsKey()
		if(m.containsKey("ide"))
			 System.out.println("yes");   // yes
		else
			System.out.println("No");
		
		// 4. containsValue()
		if(m.containsValue(15))
			 System.out.println("yes");   // yes
		else
			System.out.println("No");
		
		
		// 5. remove() 
		m.remove("ide");
		
		
		// traversal in map
		for( Entry<String, Integer> e :  m.entrySet())
			System.out.println(e.getKey() +  " " +  e.getValue());
		//		courses 10
		//		gfg 10
		
		System.out.println(m.get("ide"));   //null
		System.out.println(m.get("gfg"));   // 10

		
		
	}


}
