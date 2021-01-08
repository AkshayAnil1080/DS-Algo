package intro;
//series is  1 - 1/2 + 1/3 - 1/4+ ..... 1/n. input n and   print the sum
import java.util.Scanner;

public class sumOfseries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		float sum  = 0;
		for ( float i =1;i <=n;i++)
		{
			if (i%2 != 0)
			sum = sum + 1/i;
			else
				sum = sum - 1/i;
		}
		System.out.println(" the sum of the series 1 - 1/2 + 1/3 - 1/4+ ..... 1/n. is ");
		System.out.println(sum);
	}

}
