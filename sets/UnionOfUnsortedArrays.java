package sets;

import java.util.*;

public class UnionOfUnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[ ] = {15,20,5,15};
		int b []  = {15,15,15,20,10};
		
		System.out.println(eff(a,b,a.length, b.length));
		
	}
	static int eff( int a[], int b[] , int m, int n) // TC :  O(n+m) - ASC: O(n+m)
	{
	 
		Set<Integer> s1 =  new HashSet<>();

		
		for( int x :  a)
			s1.add(x);
		
		for( int x:b)
			s1.add(x);
		
		return s1.size();
	}

}
