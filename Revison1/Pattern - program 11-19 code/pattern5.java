//      print the pattern5 pyramid
//		5
//		        *   
//		      *   *   
//		    *   *   *   
//		  *   *   *   *   
//		*   *   *   *   *   

package patterns;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		for ( int i = 1 ; i<=n; i++)
		{
			for ( int  j =1 ;j<=n-i ;j++)
				System.out.print("  "); // at i th row before every * , 2*n-i spaces are present
			
			for (int j =1 ; j<=i; j++)
				System.out.print("*   ");  // in every row, after every *, 3 spaces are present
			
			System.out.println();
		}
	}

}
