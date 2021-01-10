// run a loop until use enter a negative number.

package intro;

import java.util.Scanner;

public class useOfbreak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	for(; ;)
		{
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println(" entered number is negative , loop breaks");
			break;
			
		}
		}
}
}
