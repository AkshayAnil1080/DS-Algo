package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,2,-1,6,3};
		int n=a.length; 
		int i,j;
		for(i=0;i<n-1;i++)
		{
			int minInd= i;
			for(j=i; j<n;j++)
			{
				if(a[j] < a[minInd] )
					{
					minInd = j;
					}
			}
		
		int temp=a[i];
		a[i] = a[minInd];
		a[minInd] = temp;
		}
		for(int e: a)
			System.out.print(e+" ");
	}

}
