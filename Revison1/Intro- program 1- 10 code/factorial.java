package intro;

import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int prod = 1;
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		for( int i = n ; i > 0 ; i --)
		{
			prod = prod*i;
		}
		System.out.println(" the factorial of " + n +" is " + prod);
	}

}
