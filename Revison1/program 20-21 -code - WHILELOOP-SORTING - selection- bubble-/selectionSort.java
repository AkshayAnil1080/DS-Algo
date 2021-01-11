// Selection Sort : Approach: Greedy - Best TC : O(n^2) - worst TC = O(n^2)
// more optimized than bubble: 
// bcoz, here swapping is done only once in one iteration.
//1. find the smallest in the whole array and swap to first element  
//2. find the smallest in all elements excluding first one and swap with second element..
//3. and so on....  
// so one time swapping till O(n-1) times.  i th loop  and iterating inside array always to find the smallest- O(n+n-1+n-2+....2)  - j th loop   - O(n^2)

package sorting;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter "+ n+ " elements");
		
		int i = 0, j =0;
		int a[]= new int [n];
		for (  i = 0 ; i<n ; i++)
		{
		 a[i] = sc.nextInt();
		}
		
		
		for( i = 0 ; i<n-1 ;i ++)
		{
			int minInd =i;
			for( j = i ; j<n ;j++)   // optimization j starts from i.
			{
				if(a[minInd]>a[j])
				{
					minInd = j ;
				}
			}
			// swap
			int temp =a[minInd];
			a[minInd] = a[i];
			a[i] = temp;
		}
		for( int b :a)
			System.out.print(b+ " ");
		
	}

}


