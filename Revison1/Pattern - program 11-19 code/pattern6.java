//		print the pattern6 : 
//		5
//		        1   
//		      2   3   
//		    4   5   6   
//		  7   8   9   10   
//		11   12   13   14   15   

package patterns;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int number = 1;   // maintin a number varible and keep on incrementing after each print. line 30
		int n  = sc.nextInt();
		for ( int i = 1 ; i<=n; i++)
		{
			for ( int j =1 ; j<=n-i ; j++)
			{
				System.out.print("  "); // at every i th row, the spaces before number is 2*(n-i)
			}
			
			for( int j = 1 ; j <=i ;j++)
				{
				System.out.print(number+ "   ");  // at every row, there are 3 spaces after a number.
				number++;
				}
			
			System.out.println();
		}
	}

}
