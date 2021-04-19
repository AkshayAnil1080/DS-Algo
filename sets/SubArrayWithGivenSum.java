package sets;

import java.util.*;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5,8,6,13,3,-1};
		int k = 35;
		System.out.println(effM2(arr,k));
	}
	
//	NaiveM1 - TC : O(n^2) ASC: O(1)
	static boolean effM2( int arr[] , int k)  // TC: O(n) -ASC :O(n)
	{
		Set<Integer>  set  = new HashSet<>();
		int sum = 0 ;
		
		for( int i =0 ; i<arr.length ;i++)
		{
			sum = sum+arr[i];
			
			if(sum ==k)
				return true;
			
			if(set.contains(sum-k))
				return true;
		}
		return false;
	}

}
