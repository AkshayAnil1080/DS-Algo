package arrays;

import java.util.Scanner;

public class NegativeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- !=0)
	    	{
	    	    int n = sc.nextInt();
	    	    int arr[] =  new int[n];
	    	    
	    	    for(int i =0 ;i<n ; i++)
	    	    arr[i]= sc.nextInt();
	    	    
	    	    int j= 0, temp;
	    	    for(int i =0 ;i<n ; i++)
	    	    {
	    	        if(arr[i]<0)
	    	        {
	    	            if(i!=j)
	    	            {
	    	                temp = arr[i];
	    	                arr[i] =  arr[j];
	    	                arr[j] =  temp;
	    	            }
	    	            j++;
	    	        }
	    	    }
	    	    
	    	    for(int i = 0 ;i<n;i++)
	    	    {
	    	        System.out.println(arr[i] + " ");
	    	    }
	    	    System.out.println();
	       
	    	}

	}

}
