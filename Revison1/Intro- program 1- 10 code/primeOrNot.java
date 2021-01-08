package intro;

import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number");
		int n = sc.nextInt();
		boolean p  = true;
		for (int i = 2 ; i *i <=n ;i++)
		{
			if(n%i==0) {
				p = false;
			break;
			}
		}
		if(p)
			System.out.println(n+ " is prime" );
		else 
			System.out.println(n+  " is not prime");
	}

}
