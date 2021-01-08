package intro;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0, b =1;
		int c ,i ;
		System.out.print(a+ " " + b+ " ");
		for(i =0 ;i <n-2 ;i++)
		{
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		}
	}
}
