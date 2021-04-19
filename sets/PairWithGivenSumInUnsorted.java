package sets;
import java.util.*;
public class PairWithgGivenSumInUnsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[]  = {3,2,8,15,-8};  s =17// true
//		int arr[]  = {2,10,3};   s =6// false
		int arr[]  = {5,8,-3,6}; 
		
		int sum = 3;
		int n = arr.length;
		System.out.println(fun(arr,sum,n));
		
		System.out.println(naiveM1(arr,sum,n));
		
		System.out.println(twoptr(arr,sum,n));
	}
	static boolean fun(int arr[], int s , int n)  // TC -O(n) - ASC - O(n )
	{
		Set<Integer>  set = new HashSet<>();
		int sum  = 0;
		
		for ( int i =0 ; i<n;i++)
		{
			if(set.contains(sum-s))
			{
				return true;
			}
			else
				set.add(arr[i]);
			
		}
		return false;
	}
	static boolean naiveM1(int arr[], int s , int n)  // TC -O(n^2) - ASC - O(1)
	{
		for( int i= 0 ;i <n ;i++)
		{
			for( int j = i+1; j<n ;j++)
				if(arr[i]+arr[j]==s)
					return true;
		}
		return false;
	}
	
	static boolean twoptr( int arr[] , int s , int n)  // TC :O(nlogn)  - ASC :O(1)
	{
		Arrays.sort(arr);   // nlogn
		
		int i = 0, j=n-1;
		while(i<j)   // logn
		{
			if(arr[i]+arr[j]==s)
				return true;
			if(arr[i]+arr[j] > s)
				j--;
			else
				i++;
		}
		return false;
	}

}
