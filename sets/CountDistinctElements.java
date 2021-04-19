package sets;

import java.util.*;

public class CountDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {15,12,13,12,13,13,18};
		
		// efficient sol M2-  TC ->theta(n) , ASC ->O(n)
//		Set<Integer>  set =  new HashSet<>(Arrays.asList(arr));
		
		Set<Integer>  set =  new HashSet<>();
		for( int x : arr)
			set.add(x);
		System.out.println(set.size());
		
		System.out.println(naiveM1(arr,arr.length));   
		
		
	}
	// Dry run - 
//	i = 0,1,2,3,4,5,6
//  res = 1,2,3,3,3,3,4;
	static int naiveM1(int arr[], int n)  // tC-  O(n^2) , ASC - O(1)
	{
		int res= 0 ;
		for( int i =0 ; i<n ;i++)
		{
			boolean flag =  false;
			for( int j =0 ; j<i ;j++)
			{
				if(arr[i] == arr[j])  // for each i, if arr[i] is not found again in range[0,i) - break jth loop and increment res for vice versa. 
				{
					flag = true;
					break;
				}
			}
			if(flag==false)
				res++; // found a distinct element
		}
		return res;
	}


}
