package recursion;
import java.util.*;
public class coinGameTheory {

	public static void main(String[] args) {

		int a[] = {1,5,7,3,2,4};
		
		System.out.println(coinMax(a, 0, a.length-1));   // l=0, r= length -1
	}

	
	static int coinMax( int a[], int l, int r)
	{
		if(l+1 == r)
		{
			return Math.max(a[l], a[r]);
		}
			return Math.max(a[l] + Math.min(coinMax(a,l+2, r) , coinMax(a, l+1, r-1)) , 
		                    a[r] + Math.min(coinMax(a,l+1, r-1) , coinMax(a, l ,r-1)));
		
	}
}

// if a[] = {1,5,700,2}
// output : 701
// need not to form the whole recursion tree to check. have the recursive heap of faith.