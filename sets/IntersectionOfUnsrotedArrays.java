package sets;
import java.util.*;
public class IntersectionOfUnsrotedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,15,20,5,30};
		int b[] = {30,5,30,80};
	
		System.out.println(naive(a,b,a.length, b.length));
		
		System.out.println(effM2(a,b,a.length, b.length));

	}
	static int effM2(int a[] , int b[] , int m , int n) // TC - O(n)) ASC-O(m)
	{
		Set<Integer> set1 = new HashSet<>();
		
		int ans = 0;
		for( int x : a)
			set1.add(x);
		
		for( int x : b)
		{
			if(set1.contains(x))
			{
				ans++;
				set1.remove(x);
			}
		}
		return ans;
	}
	

	static int naive(int a[] , int b[] , int m , int n)  // TC - O(n*(n+m)) ASC-O(1)
	{
		int res = 0;
		
		for( int i=0; i<m ;i++) // TRAVERSE In ARRAY A.
		{
			boolean flag= false;
			for( int j = 0; j <i ;j++)
			{
				if(a[i]== b[j])  // check if it has not appeared already
				{
					flag =  true;  // element has been found before too
					break;
				}
			}
			if(flag == true) // element  found before  ,just continue for next arr[i]
			continue;
			
			for ( int j =0 ;j<n;j++)   //  check if the new element is present in b,if yes res++
			{
				if(a[i] == b[j])
				{
					res++;
					break;
				}

			}
		}
		return res;
	}
}
