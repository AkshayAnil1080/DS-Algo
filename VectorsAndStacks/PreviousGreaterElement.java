package VectorsAndStacks;

import java.util.ArrayDeque;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,10,18,12,4,6,2,8};
		int n = arr.length;
		fun(arr, n);
		System.out.println();
		eff(arr, n);
	}
	
	static void fun( int arr[] , int n)   // TC:  O(n^2) ASC :  O(1)
	{
		int j =0 ;
		for ( int i =0 ;i <n ;i++)
		{
			for (  j =i-1; j>=0 ;j--)
			{
				if(arr[j] > arr[i])
				{
					System.out.print(arr[j]+ " ");
					break;
				}
			
			}
			if(j==-1)
				System.out.print(-1+" ");
		}
	} 
	static void eff( int arr[], int n)  // TC:  O(n) ASC :  O(n)
	{
		ArrayDeque<Integer> st =  new ArrayDeque<>();
		int ans = 0;
		st.push(arr[0]);
		System.out.print(-1+" ");
		
		for( int i= 1; i<n; i++)
		{
			while(st.isEmpty() == false && st.peek() <= arr[i])
			{
				st.pop();
			}
			
		 ans  = st.isEmpty()? -1 : st.peek();
		 System.out.print(ans +" ");
		 
		 st.push(arr[i  ]);	 
		}
		
}
	}
