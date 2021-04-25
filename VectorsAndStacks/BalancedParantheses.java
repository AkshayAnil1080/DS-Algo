    package VectorsAndStacks;
import java.util.*;
public class BalancedParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TC  :  O(n)
//ASC :  O(n)
//		String str = "([])";
		String str = "{}{(}))}";
//		String str = ")";
		int n = str.length();
		System.out.println(fun(str, n));
	}
	
 static boolean fun( String str , int n)
	{
		ArrayDeque<Character> st = new ArrayDeque<>();
		
		for ( int i =0 ;  i <n ; i++)
		{
			if(str.charAt(i)=='('  || str.charAt(i) =='['  || str.charAt(i) =='{'  )
			{
				st.push(str.charAt(i));
			}
			
			else
			{
				if(st.isEmpty()) return false;   // too handle str =")" , "(()))" else throws exception.			
			   
				
				else if( (str.charAt(i) ==')' && st.pop()=='(') ||
					(str.charAt(i) ==']' && st.pop()=='[') ||
					(str.charAt(i) =='}' && st.pop()=='{') )
			    continue;
				
				else return false;   // when str.charAt(i) is closing say } but pop is opening but not same type say (, [, in this case directly return false;
				// Eg: {(}))}
			}
		}
		return(st.isEmpty());
	}
}
