package nestedForLoops;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
			 System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("x   ");
			}
			System.out.println();
		}
	}

}
