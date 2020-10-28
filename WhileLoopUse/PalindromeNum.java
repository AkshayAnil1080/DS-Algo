package WhileLoopUse;

import java.util.Scanner;
public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp=n;
		int rev=0;
		int rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10 + rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if(n==rev)
		{
			System.out.println("the nummber "+n+" is palindrome");
		}
		else
			System.out.println("not palindrome");		
	}

}
