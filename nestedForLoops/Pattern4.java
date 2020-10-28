package nestedForLoops;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		int n,i,j;
		for(i=1;i<=n;i++)
		{
			
			for(j=1; j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
