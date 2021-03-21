package arrays;
//TC :  B: O(nlogn)  -  each partition splits in halves - T(n) - 2T(n/2) + theta(n) =O(nlogn)
//	  Avg : O(nlogn) 
//	  W: O(n^2)  -  each partition gives unbalanced split -T(n) = T(n-1) +theta(n) = O(n^2)
//	  worst case  - array is already sorted and last element chosen as pivot.
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {7,5,4,2,0};
		int n=a.length;
		
		quicksort(a , 0 , n-1);
		
		for( int items : a )
			System.out.print(items + " ");
		
		
		
	}
	
	static void quicksort(int a[] , int  lb , int ub )
	{
		if(lb < ub)
		{
			int loc =  partition(a,lb,ub);
			quicksort(a , lb,  loc-1);
			quicksort(a, loc+1 , ub);
		}
	}
	
	static int partition(int a[]  ,int lb, int  ub)
	{
		
		int pivot = a[lb];
		int start  = lb ; 
		int end =  ub;
		
		while(start < end)
		{
			while(a[start]  <= pivot && start< end)
			{
				start =  start + 1;
			}
			
			while(a[end]  > pivot)
			{
				end  =  end - 1;
			}
			
			if(start < end)
			{
				int temp = a[start] ; 
				a[start] =  a[end];
				a[end] = temp;
				
			}
		}
		
		a[lb] = a[end];
		a[end]  = pivot;
		return end;
	}

}
