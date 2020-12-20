package recursion;

import java.util.ArrayList;

public class partitionOfArrayIntoTwosumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,1,2,3,4,8};
		int sum =0;
		for(int i=0;i<a.length;i++)
			sum +=a[i];
		ArrayList<Integer> ans = new ArrayList<>();
		boolean isPossible =  (sum&1)==0 && partition(a,sum/2,0,ans);
		
		if(isPossible)
		{
			for ( int x : ans)
				System.out.print(x+ " ");
		}
		else
			System.out.println("not possible");
	}
	static boolean partition(int a[], int sum, int i, ArrayList<Integer> ans)
	{
		//check
		if(i>=a.length || sum<0) return false;
		if(sum ==0) return true;
		
		ans.add(a[i]);
		boolean leftPossible = partition(a, sum-a[i], i+1, ans);
		
		if(leftPossible) return true;
		
		ans.remove(ans.size()-1);
		return partition(a,sum,i+1, ans);
	}
}
// problem: partitioning of array into two equal sum Array.
//explanation:
//	Have the recursive leap of faith: dont try to draw the recursion tree for each step, u will be lost.
//	1: finding the sum of array:
//	2: determining the sum as even or odd: if(sum&1)==0 sum is even; if (sum&1) ==1 sum is odd.
//	3. An arrayList to store the array to integers whose summation is sum/2.
//	4. a boolean isPossible => if sum is even && partition function returns true
//	5. partition function takes 4 arguments: true if such two equals array is possible.
//		1. checking if index > length and sum <0 => partition= false
//	    2. add the first element in ans.
//		3. is left side possible to move forward with partition function
//		4. but is actually leftside possible return true. else remove the last element of ans.	
//		5. continue moving forward with line 37
//		6. if sum == 0; that is sum is not less than 0 too and return true.
