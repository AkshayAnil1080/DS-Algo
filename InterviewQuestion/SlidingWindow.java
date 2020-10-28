package InterviewQuestion;
import java.util.*;
public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution
		{
			public int[] maxSlidingWindow(int[] a,int k)
			{
				int n = a.length;
				Deque<Integer> dq =new LinkedList<>();
				int ans[] = new int[n-k+1];
				
				int i =0;
				for(; i<k ;i++)
				{
					while(!dq.isEmpty()  && dq.peekLast() <=a[i] )
						dq.removeLast();
				}
				dq.addLast(i);
				
				
				
				return ans;
			}
		}

}
