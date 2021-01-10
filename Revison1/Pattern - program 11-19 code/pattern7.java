//	print the pattern7
//intuition: 1. use pattern1 for n=4 and then patter4 for n=3
//			2. use is else and print "* " accordingly to ith row.
//	5
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * 
//	* * 
//	* 

package patterns;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int rows = 2*n -1 ;
		for ( int i = 1 ; i<=rows; i++)
		{
			if(i <=n)
			for ( int j =1 ; j<=i ; j++)
			{
				System.out.print("* ");
			}
			
			else
				for( int j =1 ; j<rows-i+1 ; j++)
				{
					System.out.print("* ");
				}
			System.out.println();
		}	

}
}
