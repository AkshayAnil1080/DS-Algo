package sets;

import java.util.*;

//Given a suba array, find if there exits a subarray with sum equala to zero.
// n<10^5. => we have to solve in O(n)

public class SubarraysWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BRUTEFORCE O(n^2) 
		
		int a[] = {2, 1, 3, 2 , -2};
		int k =6;
		boolean p = false;
//		for(int i = 0 ;i <a.length ; i++)
//		{
//			int sum =0;
//			for(int j =i; j<a.length ; j++)
//			{
//				sum = sum+a[j];
//				if(sum == 0)
//				{
//					p=true; break;
//				}
//				if(p) break;
//			}
//		}
		// time space trade off: using some extra space in reducing the time complexity
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for( int i = 0; i<a.length ; i++)
		{
			set.add(sum);
			sum=sum+ a[i];
			if(set.contains(sum-k))
			{
				p=true ;
				break;
			}
		}
		
		System.out.println(p);
	}

}
