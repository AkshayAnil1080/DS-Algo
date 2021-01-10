//	print the pattern8
//	5
//	* 
//	* *
//	*   *
//	*     *
//	* * * * * 

package patterns;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		for ( int i = 1; i<=n ;i ++)
		{
			
			if ( i ==1 || i==n)
			{
				for ( int j =1 ; j<=i ;j++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("* ");
				for( int j =1; j<=i-2; j++)
					{
						System.out.print("  ");
					}
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

//Intuition:
// 1st and last line has the same number of "* " as the number of row.
// rest of the rows has 2 stars, separated by th 2*(i-2) spaces. 