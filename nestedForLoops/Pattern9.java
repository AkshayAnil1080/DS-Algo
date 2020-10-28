package nestedForLoops;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			if(i==1 || i==n)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
			}
			else 
			{
				System.out.print("* ");
				for(j=1;j<=i-2;j++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
