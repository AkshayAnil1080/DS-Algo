package sets;

import java.util.*;

public class LongestConsecutiveSubsequenceInAnyOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1,9,3,4,2,20};  // 1,3,4, - > 4
//		int arr[] = { 8,20,7,30}; // 8,7 - > 2
//		int arr[] = {20,30,40} ;  // 1
		
		int n =  arr.length;
		System.out.println(naiveM1(arr, n));
		System.out.println(effM2(arr, n));
	}
	
	static int naiveM1( int arr[]  , int n)  // Tc : O(nlogn) - ASC :O(1) -  if allowed to modify the input array
	{
		Arrays.sort(arr);
		int res = 0;
		int c= 1 ;
		for ( int i = 1; i<n ;i++)
		{
			if(arr[i] == arr[i-1]+1)
				c++;
			else
				{
				res = Math.max(res,c);
				c = 1;
				}
		}
		return res;
		 
	} 
	
	static int effM2( int arr[]  , int n)  // Tc : O(n) - ASC :O(1) -
	{
		 Set<Integer> set =  new HashSet<>();
		 for( int i=0 ; i<n ;i ++)
			 set.add(arr[i]);
		 
		 int res = 0;
		 
		 for(int x:  set)
		 {
			 if(!set.contains(x-1)) // we found the starting element
			 {
				 int c=1;
				 while(set.contains(x+c))
				 {
					 c++;
				 }
				 res = Math.max(res, c);

			 }
		 }
		 return res;
	}
//	DRY RUN set = { 1,9,3,4,2,20}
//	x=1 c=1,2,3,4 -> res =4;
//	x=9 c=1 -> max(1,4) =  4
//	x=3 -> 2 is present -ignnore
//	x=4 -> 3 is present ignore
//	x=2 -> 1 is present ignore
//	x=20 -> c=1 -> max(1,4) = 4

}
