package intro;

import java.util.Scanner;

public class numberOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nod = (int) Math.log10(n) + 1;
		System.out.println("the number of digit in "+ n + " is " + nod);
		
		
		// find sum, product and reverse of digits.
		int sum = 0, prod = 1, rev_num =0;
		int temp= n;
		while(temp!=0)
			{
			sum = sum + temp%10;
			rev_num = rev_num*10 + temp%10;
			prod = prod * (temp%10);   // don't forget to give the parantheses..
			
			
			temp/=10;
			}
		
		System.out.println("the sum of digits in "+ n + " is " + sum);
		System.out.println("the product of digits in "+ n + " is " + prod);
		System.out.println("the reverse  of number "+ n + " is " + rev_num);
	}

}
