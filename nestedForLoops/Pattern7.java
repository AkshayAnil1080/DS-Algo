package nestedForLoops;

import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int i,j;
		int number=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
			 System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(number+"   ");
				number++;
				
			}
			System.out.println();
		}
	}

}
