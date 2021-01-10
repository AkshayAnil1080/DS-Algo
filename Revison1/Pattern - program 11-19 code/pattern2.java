//	print the pattern2
//	5
//	* * * * * 
//	  * * * * 
//	    * * * 
//	      * * 
//	        * 

package patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		for ( int i = 1 ; i<=n; i++)
		{
			for( int j = 1; j<=2*(i-1) ; j++)
			{
				System.out.print(" ");   // or omit 2 in line 14 and print 2 spaces in line 16
			}
			for(int j =1 ;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}


