package recursion;
import java.util.*;

public class permutationOfString {
 
	static Set<String> set = new HashSet<>(); // has to be static so that other function outside main can access

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		permutations("acc" , 0,2);
	}
	
	static void permutations(String s  , int l , int r)   //l=0 r=length -1
	{
		if(l==r)
		{ 
			if(set.contains(s)) return;
			else
				set.add(s);
			
			System.out.println(s);          // base condition if l==r print the string and return.
			return;
		}
		
		for(int i = l; i<=r; i++)
		{
			s =  interchangeChar(s,l,i);  // swapping the index and returning the string.
			permutations(s,l+1,r);   // string is now completely butchered
			s = interchangeChar(s,l,i);   // BACKTRACKING
		}
	}
	
	static String interchangeChar ( String s , int a , int b)
	{
		char array[] = s.toCharArray();
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		
		return String.valueOf(array);
	}

}

// now another requirement : print only uni   que elements
// Ans: use the power of Ds:  HashSet it allows unique element
// added line 6 and 18-21
