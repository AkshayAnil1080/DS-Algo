package InterviewQuestion;
import java.util.*;
public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sol = new Solution();
		
		int a[] = {2, 3, 1, 5, 7, 1, 2, 5, 4, 3};
		int ans[] = sol.maxSlidingWindow(a, 3);
		
		
		for(int  x: ans)
		{
			System.out.print(x + " ");
		}
				

	}
	
	static class Solution
		{
			public int[] maxSlidingWindow(int[] a,int k)
			{
				int n = a.length;

//			empty or one element.
				if(n<=1) return a;
				
				
// making a deque with LL and ans[] to store the output				
				Deque<Integer> dq =new LinkedList<>();
				int ans[] = new int[n-k+1];
				
				
//filling dq with index  of first k ele in descending order
				int i =0;
				for(; i<k ; i++) 
				{
					while(!dq.isEmpty()  && a[dq.peekLast()] <=a[i] )
						{dq.removeLast();}
				
				dq.addLast(i);
				}
				
//storing the largest in ans array.	
//here i becomes 4
				for(; i <n ; i++)
				{
					ans[i-k] = a[dq.peekFirst()] ;  //ans[4-3]=ans[0] = largest among the first k ele.
					
//removing the ele which are not in the current window.					
					while(!dq.isEmpty()  && dq.peekFirst() <= i-k )
					{ 
						dq.removeFirst();
					}
//again finding the max among next k nos. like in line 40-44
					while(!dq.isEmpty()  && a[dq.peekLast()] <= a[i] )
					{
						dq.removeLast();
					}
				dq.addLast(i);
				}
				
// to store the largest no of last window. as when it reaches the last window i becomes equal to n. 
//and suppose u though of making the for loop till <=n, then array out of bound error will come.				
				ans[i-k] = a[dq.peekFirst()];
				
				
				
				
				
				return ans;
			}
		}

}
