package nestedForLoops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
