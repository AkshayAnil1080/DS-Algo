//Bubble sort
//Approach: Comparison 
//Best TC: O(n^2)   //but my code with some manipulation if the array is sorted, tc will be O(n).
//Worst TC: O(n^2)
// Optimization 1: run the j loop from 0->n-i-1
// Optimization 2: maintain a boolean ,for the case if no swapping or no further swapping is done, break from the loop of i.
package sorting;

import java.util.Scanner;

public class bubbleSort {

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
		
		// bubblesort

		for(i = 0 ;i<n-1; i++)
		{
			boolean sorted= true;				// Optimization 2
			for(j = 0 ; j<n-i-1 ; j++)  // Optimization 1
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
		
		// printing the elements
		for(int b : a)
			System.out.print(b+ " ");
		
		
		
	}

}
