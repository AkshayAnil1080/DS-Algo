package arrays;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int temp =n;
		
		int rev=0,rem;
		while(temp>0)
		{
			rem=temp%10;
			rev =rev*10+rem;
			temp=temp/10;
		}
		if(rev==n) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not a Palindrome");
	}

}
