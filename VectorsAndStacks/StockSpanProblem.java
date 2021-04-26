package VectorsAndStacks;

import java.util.ArrayDeque;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = { 13,15,12,14,16,8,6,4,10,30};
		int n =arr.length;
		fun(arr, n);
		System.out.println();
		effM2(arr, n);
	}
	static void fun( int arr[]  , int n)  // TC:  O(n^2)  ASC : O(1)
	{
		for( int i =0 ;i<n;i++)
		{
			int  c =1;
			for(int j=i-1 ;j>=0 && arr[j] <= arr[i]; j--)
			{
				 c++;
			}
			System.out.print(c+" ");
		}
	}
	
	static void effM2( int arr[] ,  int n)  // TC : O(n) ASC: O(n)
	{
		ArrayDeque<Integer> st =  new ArrayDeque<>();
		int span = 0;
		st.push(0);
		System.out.print(1+" ");
		
		for( int i= 1; i<n; i++)
		{
			while(st.isEmpty() == false && arr[st.peek()] <= arr[i])
			{
				st.pop();
			}
			
		 span  = st.isEmpty()? i+1 : i-st.peek();
		 System.out.print(span+" ");
		 
		 st.push(i);
		}
	}

}
